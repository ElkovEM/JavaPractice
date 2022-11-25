package pr2.Shop;
import java.util.Scanner;

public class ShopTester {
    public static void main(String[] args){
        Shop CityLink = new Shop();
        Scanner scan = new Scanner(System.in);
        String name = ".";
        System.out.println("Введите названия компьютеров, чтобы закончить вводить введите пустую строку:");
        while (!name.equals("")){
            name = scan.nextLine();
            CityLink.computers.add(new Computer(name));
        }

        System.out.println("Список компьютеров:");
        CityLink.showComputers();
    }

}