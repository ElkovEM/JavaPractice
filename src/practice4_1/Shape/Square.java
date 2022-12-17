package practice4_1.Shape;

public class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    String getType() {
        return "Type: Square";
    }

    @Override
    double getArea() {
        return side*side;
    }

    @Override
    double getPerimeter() {
        return 4*side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + getArea() +
                ", perimeter" + getPerimeter() +
                '}';
    }
}
