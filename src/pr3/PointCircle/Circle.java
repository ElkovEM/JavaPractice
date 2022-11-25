package pr3.PointCircle;

/*
2. Создать класс точка Point, описывающий точку на плоскости.
Создать Circle класс, в котором одно поле представляет точку – центр
окружности, и добавить другие свойства, позволяющие задать точку на
плоскости. Создать третий класс Tester который использует для хранения
объектов массив объектов Circle и второе поле количество элементов в массиве.
Добавить в класс методы, позволяющие найти самую маленькую и самую
большую окружность. Добавить в класс метод, упорядочивающий хранение
окружностей в массив. Для инициализации полей радиуса и длины окружности
используйте класс Random или метод random() класса Math по желанию
 */

import pr2.PointCircle.Point;

public class Circle {
    double x;
    double y;
    double radius;
    Point center;

    Circle(){
        this.center = new Point(0, 0);
        this.radius = 1;
    }
    Circle(double x, double y, double radius){
        this.center = new Point(x, y);
        this.radius = radius;
    }

    public double findCircleArea(){
        return radius*radius*3.14;
    }
    public double findCircleLength(){
        return 2*3.14*radius;
    }

    public void compareCircles(Circle obj1, Circle obj2){
        if (obj1 == obj2){
            System.out.println("Круги одинаковые");
        } else System.out.println("Круги разные");
    }
    public void setCenter(Point center) {
        this.center = center;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setR(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

