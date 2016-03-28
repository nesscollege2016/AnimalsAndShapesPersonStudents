package edu.tomer.ness;

/**
 * Created by Dev on 28/03/2016.
 */
public class Cat extends Animal {
    String type;

    public Cat(int age, String type) {
        super(age);
        this.type = type;
    }

    @Override
    void makeSound() {
        System.out.println("Miaow");
    }
}
