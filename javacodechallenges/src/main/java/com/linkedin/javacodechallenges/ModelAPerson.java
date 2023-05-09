package com.linkedin.javacodechallenges;

public class ModelAPerson {

  public static void main(String[] args) {

    Person person1 = new Person("Tomek", "Ogonek", 33);
    person1.setAge(22);
    person1.introducePerson();

    Person person2 = new Person("123", " ", 18);//person with wrong credentials
    person2.setAge(0);
    person2.introducePerson();

    Person person3 = new Person("Tomasz", "Kot", 42);
    person3.introducePerson();

  }

}
