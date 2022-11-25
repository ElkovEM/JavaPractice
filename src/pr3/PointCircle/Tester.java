package pr3.PointCircle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tester {
    public static int BOUNDS_OF_RADIUS = 100;
    public static ArrayList <Circle> circleArrayList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите желаемое количество кругов: ");
        int amount = scan.nextInt();
        for (int i = 0;i<amount; i++ ){
            setCircle();
        }
        System.out.println("Круги созданы");
        printCircles();
        sortCircles();
        System.out.println("Круги отсортированы");
        printCircles();
        System.out.println("Наибольший круг: " + findMaxCircle().toString());
        System.out.println("Наименьший круг: " + findMinCircle().toString());
    }
    public static void printCircles(){
        for (Circle circle : circleArrayList) {
            System.out.println(circle.toString());
        }
        System.out.println();
    }
    public static void sortCircles(){
        ArrayList<Circle> temporaryList = new ArrayList<>();
        while(circleArrayList.size() != 0){
            Circle maxCircle = findMaxCircle();
            temporaryList.add(maxCircle);
            circleArrayList.remove(maxCircle);
        }
        circleArrayList = temporaryList;

    }
    public static void setCircle(){
        Random random = new Random();
        double radius = random.nextDouble()*BOUNDS_OF_RADIUS+1;
        circleArrayList.add(new Circle(0,0,radius));
    }
    public static Circle findMaxCircle(){
        double maxRadius = 0;
        Circle maxCircle = new Circle();
        for (Circle circle: circleArrayList){
            if (circle.radius>maxRadius){
                maxRadius = circle.radius;
                maxCircle = circle;
            }
        }
        return maxCircle;
    }
    public static Circle findMinCircle(){
        double minRadius = BOUNDS_OF_RADIUS;
        Circle minCircle = new Circle();
        for (Circle circle: circleArrayList){
            if (circle.radius < minRadius){
                minRadius = circle.radius;
                minCircle = circle;
            }
        }
        return minCircle;
    }
}
