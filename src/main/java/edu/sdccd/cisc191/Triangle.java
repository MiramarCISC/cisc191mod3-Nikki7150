package edu.sdccd.cisc191;

public class Triangle extends Shape implements Measurable{

    // PR Note: Main gives a 3, 4, 5 triangle, so I assume the actual measurements are
    //          supposed to be a, b, and c (the sides of a triangle).
    private final double length;
    private final double breadth;
    private final double height;

    Triangle(String name, double length, double breadth,  double height) {
        super(name);

        if (length <= 0 || breadth <= 0 || height <= 0) {
            throw new IllegalArgumentException("A Triangle's dimensions must all be positive!");
        }

        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Formulae work with the fields set in class

    @Override
    public double area() {
        return 0.5 * height * breadth;
    }

    @Override
    public double perimeter() {
        return length + breadth + height;
    }

    // Overriding Shape.equals() is not needed.
}
