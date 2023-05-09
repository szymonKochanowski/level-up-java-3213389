package com.linkedin.javacodechallenges;

public class Person {

  private String firstName;
  private String lastName;
  private int age;

  public Person(String firstName, String lastName, int age) {
    if (firstName.matches("^[a-zA-Z]+$") && firstName.length() > 2) {
      this.firstName = firstName;
    } else {
      System.out.println("Firstname must contains only characters.");
    }

    if (lastName.matches("^[a-zA-Z]+$") && lastName.length() > 2) {
      this.lastName = lastName;
    } else {
      System.out.println("Lastname must contains only characters.");
    }

    setAge(age);
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    if (age > 0) {
      this.age = age;
    } else {
      System.out.println("Age can't be less that 0");
    }
  }

  public void introducePerson() {
    System.out.println(
        "Hello my name is: " + this.firstName + " " + this.lastName + " and I have " + this.age + " years old.");
  }

}