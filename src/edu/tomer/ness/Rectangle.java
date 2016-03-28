package edu.tomer.ness;


public class Rectangle extends Shape {

    public Rectangle(int width, int height) {
        super(width, height);
    }

    Double getArea(){
        return width * height;
    }
}
