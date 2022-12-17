package practice4_1.Shape;

public class Rectangle extends Shape {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    String getType() {
        return "Type: Rectangle";
    }

    @Override
    double getArea() {
        return (height*width);
    }

    @Override
    double getPerimeter() {
        return 2*(width+height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
