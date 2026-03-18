package edu.sdccd.cisc191;

public class Rectangle extends Shape implements Measurable {
    private final double width;
    private final double height;

    Rectangle(String name, double width, double height) {
        super(name); // Good job!

        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("The Rectangle's dimensions must all be positive.");
        }

        this.width = width;
        this.height = height;
    }

    // Formulas are correct

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    // Overriding Shape.equals() is not needed.
}
