package edu.sdccd.cisc191;

public class Circle extends Shape implements Measurable {

    private final double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
