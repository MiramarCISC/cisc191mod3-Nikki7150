package edu.sdccd.cisc191;

// Shape must implement Measurable
abstract class Shape implements Comparable<Shape>,Measurable {
    String name;

    public Shape(String name) {
        if (name == null || name.trim().isBlank()) {
            throw new IllegalArgumentException("A Shape cannot have a null or blank name.");
        }

        this.name = name;
    }

    @Override abstract public double area(); // Must be public and have @Override

    public abstract double perimeter(); // Having this be public is good practice

    public String describe(){
        return this.name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Shape other) {
        // Compare by area first
        int areaCompare = Double.compare(this.area(), other.area());

        if (areaCompare != 0) return areaCompare;

        // Then by name
        return this.name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object other) {
        return (other instanceof Shape shape) // `shape` can be used to fetch common values w/o casting
            && this.name.equals(shape.name)
            && this.area() == shape.area() // Checking if they have the same area
            && this.perimeter() == shape.perimeter() // and perimeter
            && this.getClass() == shape.getClass(); // and are the same shape
    }
}