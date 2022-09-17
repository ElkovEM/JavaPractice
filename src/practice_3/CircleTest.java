package practice_3;

/*
Создать класс, описывающий модель окружности (Circle).
В классе должны быть описаны нужные свойства окружности и методы для получения, изменения этих свойств.
Протестировать работу класса в классе CircleTest, содержащим метод статический main(String[] args).
 */

public class CircleTest {
    public static void main(String[] args) {
        circle circle = new circle(5);
        circle.setRadius(25);
        System.out.println("Radius: " + circle.getRadius());
    }
}

class circle {
    int radius;
    public circle(int radius) {
        this.radius = radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
}