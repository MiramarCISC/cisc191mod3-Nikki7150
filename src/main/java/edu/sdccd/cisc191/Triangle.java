package edu.sdccd.cisc191;

public class Triangle extends Shape implements Measurable{

    private final double length;
    private final double breadth;
    private final double height;
    Triangle(String name, double length, double breadth,  double height) {
        super(name);
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * height * breadth;
    }

    @Override
    double perimeter() {
        return length + breadth + height;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
