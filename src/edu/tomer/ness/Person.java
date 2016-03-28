package edu.tomer.ness;


import java.util.Scanner;

public class Person {
    String firstName;
    String lastName;
    String id;

    /**
     * Person Constructor
     * @param firstName persons firstName
     * @param lastName persons lastName
     * @param id persons Identification number
     */
    public Person(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public Person() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name:");
        this.firstName = scan.next();

        System.out.println("Enter last Name:");
        this.lastName = scan.next();

        System.out.println("Enter ID:");
        this.id = scan.next();
    }

    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                '}';
    }


}
