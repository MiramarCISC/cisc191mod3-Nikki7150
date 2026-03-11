package edu.sdccd.cisc191;

public class Rectangle extends Shape implements Measurable {
    private final double width;
    private final double height;

    Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
