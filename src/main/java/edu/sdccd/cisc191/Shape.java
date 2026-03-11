package edu.sdccd.cisc191;

abstract class Shape implements Comparable<Shape> {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double area();
    abstract double perimeter();

    public String describe(){
        return this.name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Shape other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Shape && this.name.equals(((Shape) other).name);
    }

}