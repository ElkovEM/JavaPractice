package practice4_1.Shape;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    //!!!!!!

    @Override
    String getType() {
        return "Type: Circle";
    }

    @Override
    double getArea() {
        return radius*radius*3.14;
    }

    @Override
    double getPerimeter() {
        return 2*3.14*radius;
    }

    //!!!!!!

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + getArea() +
                "perimeter(length)" + getPerimeter() +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
