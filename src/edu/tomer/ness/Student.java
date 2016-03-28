package edu.tomer.ness;


import java.util.Scanner;

public class Student extends Person {
    String faculty;

    public Student() {
        super();//call the empty constructor of the base class
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter faculty:");
        this.faculty = scanner.next();
    }


    public Student(String firstName, String lastName, String id, String faculty) {
        super(firstName, lastName, id);
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        String personString = super.toString();
        return "faculty: " + faculty + " "  + personString;
    }
}
