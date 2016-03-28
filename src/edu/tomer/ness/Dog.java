package edu.tomer.ness;


public class Dog extends Animal {
    String type;

    public Dog(int age, String type) {
        super(age);
        this.type = type;
    }

    @Override
    void makeSound() {
        System.out.println("Hav - Hav");
    }
}
