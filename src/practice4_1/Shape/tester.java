package practice4_1.Shape;

public class tester {
    public static void main(String[] args) {
        Shape Rectangle = new Rectangle(15, 20);
        System.out.print(Rectangle.getType() + "  ");
        System.out.println(Rectangle.toString());

        Shape Circle = new Circle(15);
        System.out.print(Circle.getType() + "  ");
        System.out.println(Circle.toString());

        Shape Square = new Square(10);
        System.out.print(Square.getType() + "  ");
        System.out.println(Square.toString());
    }
}
