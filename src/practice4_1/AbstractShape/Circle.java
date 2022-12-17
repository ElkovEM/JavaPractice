package practice4_1.AbstractShape;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    //!!!!!!

    @Override
    double getArea() {
        return radius*radius*3.14;
    }

    @Override
    double getPerimeter() {
        return 2*3.14*radius;
    }

    //!!!!!!



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
