package pr2.PointCircle;

public class Circle  {
    private double radius;
    Point center;

    public Circle(){
        this.center = new Point(0, 0);
        this.radius = 1;
    }
    public Circle(double x, double y, double radius){
        this.center = new Point(x, y);
        this.radius = radius;
    }
}
