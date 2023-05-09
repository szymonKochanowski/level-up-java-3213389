package com.linkedin.javacodechallenges;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothingGame {

  public static void doubleOrNothing() {
    Scanner sc = new Scanner(System.in);
    int result = 10;
    boolean isStillPlaying = true;
    Random random = new Random();
    int counter = 0;

    System.out.println("Welcome in game! Your current result is: " + result);

    while (isStillPlaying) {

      if (random.nextInt(3) == 1) {
        result *= 2;
        counter++;
        System.out.println("Your result after: " + counter + " attemp: " + result);
        System.out.println("If do you want try again choose: 1");
        System.out.println("If do you want end game choose another number than 1");
        int decision = sc.nextInt();
        if (decision == 1) {
          continue;
        } else {
          System.out.println("Congratulation!!! You won: " + result + " points!");
          break;
        }
      } else {
        isStillPlaying = false;
        result = 0;
        System.out.println("Sorry, you don't have lucky this time. You lose all points.");
        System.out.println("Your current result is: " + result);
      }
    }
  }
}
