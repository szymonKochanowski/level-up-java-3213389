package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class CalculateWaterBill {

  public static void calculateWaterBill() {
    double result = 0;
    double priceForGallon = 18.84;
    double priceForAdditionalGalon = 3.9;
    int sizeOfOneGalon = 1496;
    int sizeOfHalfGalon = 748;
    Scanner sc = new Scanner(System.in);

    System.out.println("Please provide number of gallons that you used:");
    int usedNumberOfGallons = sc.nextInt();

    if (usedNumberOfGallons <= sizeOfOneGalon) {
      result = priceForGallon;
    } else if (usedNumberOfGallons > sizeOfOneGalon) {

      int numberOfExtraGalons = usedNumberOfGallons - sizeOfOneGalon;
      double numberOfHalfGalons = numberOfExtraGalons / sizeOfHalfGalon;
 
      if ((numberOfHalfGalons % 0.5) > 0) {
        numberOfHalfGalons += 1;
      }

      double priceForExtraGalons = numberOfHalfGalons * priceForAdditionalGalon;

      result = priceForGallon + priceForExtraGalons;
    }

    System.out.println("Your bill for water equals to: " + result + "$");
  }
}
