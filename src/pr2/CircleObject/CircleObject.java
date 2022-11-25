package pr2.CircleObject;

/*
6. Создать класс, описывающий модель окружности (Circle). В классе
должны быть описаны нужные свойства окружности и методы для получения и
изменения этих свойств. Добавить методы для расчета площади круга и длины
окружности, а также метод позволяющий сравнивать две окружности. При
помощи класса CircleTest, содержащего статический метод main(String[] args),
протестировать работу класcа Circle.
 */

public class CircleObject {
    double x;
    double y;
    double radius;

    public CircleObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findCircleArea(){
        return radius * radius * 3.14;
    }

    public double findCircleLength(){
        return 2 * 3.14 * radius;
    }

    public void compareCircles(CircleObject obj1, CircleObject obj2){
        if (obj1 == obj2){
            System.out.println("Круги одинаковые");
        } else System.out.println("Круги разные");
    }
    @Override
    public String toString() {
        return "CircleObject{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }
}

