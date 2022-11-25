package pr2.PointCircle;

import java.util.Scanner;

public class Tester {
    public static int amountOfObjects = 3;
    public static Circle[] array = new Circle[amountOfObjects];

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Максимальное количество доступных кругов = " + amountOfObjects);
        System.out.println("Введите данные для + " + amountOfObjects + " кругов");
        for (int i = 0; i < amountOfObjects; i++){
            System.out.println("Введите х: ");
            double x = scan.nextDouble();
            System.out.println("Введите y: ");
            double y = scan.nextDouble();
            System.out.println("Введите radius: ");
            double radius = scan.nextDouble();

            array[i] = new Circle(x,y,radius);
            System.out.println("Круг сохранен");
        }
        for (Circle circle: array){
            System.out.println(circle.toString());
        }



    }

}