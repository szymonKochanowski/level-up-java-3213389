package com.linkedin.javacodechallenges;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );

        // int number = 12;
        // System.out.println(evenOrOdd(number));

        // String password = "a1aaAa";
        // System.out.println(passwordComplexity(password));

        DoubleOrNothingGame.doubleOrNothing();
        
        
        
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
