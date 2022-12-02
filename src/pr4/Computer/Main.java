package pr4.Computer;

import java.util.Scanner;

enum Brands {
    Microsoft, Apple, Samsung, Lenovo, Asus;
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter brand:");
        String s = in.nextLine();
        int price; Computer PC;
        switch (s) {
            case "Microsoft":
                System.out.println("Enter price, speed, memory, size.");
                price = in.nextInt();
                PC = new Computer(price, in.nextLine(), in.nextLine(), in.nextLine());
                System.out.println(Brands.Microsoft);
                PC.toString();
                break;
            case "Apple":
                System.out.println("Enter price, speed, memory, size.");
                price = in.nextInt();in.nextLine();
                PC = new Computer(price, in.nextLine(), in.nextLine(), in.nextLine());
                System.out.println(Brands.Apple);
                PC.toString();
                break;
            case "Asus":
                System.out.println("Enter price, speed, memory, size.");
                price = in.nextInt();in.nextLine();
                PC = new Computer(price, in.nextLine(), in.nextLine(), in.nextLine());
                System.out.println(Brands.Asus);
                System.out.println(PC.toString());
                break;
            case "Samsung":
                System.out.println("Enter price, speed, memory, size.");
                price = in.nextInt();in.nextLine();
                PC = new Computer(price, in.nextLine(), in.nextLine(), in.nextLine());
                System.out.println(Brands.Samsung);
                PC.toString();
                break;
            case "Lenovo":
                System.out.println("Enter price, speed, memory, size.");
                price = in.nextInt();in.nextLine();
                PC = new Computer(price, in.nextLine(), in.nextLine(), in.nextLine());
                System.out.println(Brands.Lenovo);
                PC.toString();
                break;
            default:
                System.out.println("Wrong name.");
                break;
        }
    }
}
