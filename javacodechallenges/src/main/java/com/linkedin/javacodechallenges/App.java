package com.linkedin.javacodechallenges;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // System.out.println( "Hello World!" );

        // int number = 12;
        // System.out.println(evenOrOdd(number));

        // String password = "a1aaAa";
        // System.out.println(passwordComplexity(password));

        // DoubleOrNothingGame.doubleOrNothing();

        // CalculateWaterBill.calculateWaterBill();

        onehundredDaysFromNow();

    }

    private static void onehundredDaysFromNow() {
        LocalDate localDateTime = LocalDate.now(ZoneId.systemDefault()).plusDays(100);
        System.out.println(localDateTime);
    }

    public static boolean passwordComplexity(String password) {
        return password.length() >= 6
                && password.matches(".*\\d.*")
                && password.matches(".*[a-z].*")
                && password.matches(".*[A-Z].*");
    }

    public static boolean evenOrOdd(int number) {
        return number % 2 == 0;
    }
}
