package com.linkedin.javacodechallenges;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

        // onehundredDaysFromNow();

        // studentVolunteers();

        String word = "AZ";
        letterPoints(word);
    }

    private static void letterPoints(String word) {
        Map<Character, Integer> pointsForLetter = new HashMap<>();
        for (int i = 0; i < 26; i++) { // 26 to liczba liter w alfabecie
            pointsForLetter.put((char) ('A' + i), i + 1);
        }

        int result = 0;

        for (int i = 0; i < word.length(); i++) {
            result = result + pointsForLetter.get(word.charAt(i));
        }

        System.out.println(result);
    }

    private static void studentVolunteers() {
        // kazdy student musi wziac udzial w przynajmniej dwoch wydarzeniach
        // nalezy znalesc ktory student wciaz musi odbyw wolontariat
        List<String> students = List.of("Sally", "Polly", "Molly", "Tony", "Harry");

        Map<String, List<String>> attendeesMapping = Map.of(
                "Farers Market", List.of("Sally", "Molly", "Harry"),
                "Car Wash Fundraiser", List.of("Molly", "Tony", "Polly"),
                "Cooking Worshop", List.of("Sally", "Molly", "Polly"),
                "Midnight Breakefast", List.of("Molly", "Polly"));

        Map<String, Integer> studentsThatNeedToDoVolunteers = new HashMap<>();
        int counter = 0;
        String name = "";

        for (int i = 0; i < students.size(); i++) {
            for (List<String> persons : attendeesMapping.values()) {
                if (persons.contains(students.get(i))) {
                    counter++;
                    name = students.get(i);
                }
            }
            if (counter < 2) {
                studentsThatNeedToDoVolunteers.put(name, counter);
            }
            counter = 0;
        }

        System.out.println("Student that needs to take a part in volunteery events:");
        System.out.println("Student name: |  How many times:");
        for (Map.Entry<String, Integer> student : studentsThatNeedToDoVolunteers.entrySet()) {
            System.out.println(student.getKey() + " | " + student.getValue());
        }

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
