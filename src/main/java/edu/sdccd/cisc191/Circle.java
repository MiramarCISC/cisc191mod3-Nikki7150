package edu.sdccd.cisc191;

public class Circle extends Shape implements Measurable {

    private final double radius;

    Circle(String name, double radius) {
        super(name); // Nice work!

        if (radius <= 0) {
            throw new IllegalArgumentException("A Circle's radius cannot be negative.");
        }

        this.radius = radius;
    }

    // Your formulae are spot-on!

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Overriding Shape.equals() is not needed.
}
