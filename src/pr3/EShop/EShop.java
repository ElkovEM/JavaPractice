package pr3.EShop;

import pr3.Converter.Convertor;

import java.util.ArrayList;
import java.util.Scanner;

public class EShop {
    static ArrayList<Good> goods = new ArrayList<>();
    public static void main(String[] args){
        Convertor converter = new Convertor();
        Scanner scanner = new Scanner(System.in);

        String check = " ";
        System.out.println("Заполните магазин товарами, конец ввода пустая строка.");
        while (!check.equals("")){
            check = goodInit();
        }
        System.out.println("Выберите индекс желаемого товара для покупки:");
        for (Good good: goods){
            System.out.println("Товар №" + (goods.indexOf(good)+1) + " " + good.name);
        }
        int index = scanner.nextInt() - 1;


        System.out.println("В какую валюту хотите конвертировать цену товара? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
        int currency = scanner.nextInt();
        System.out.println("Ваш товар: " + goods.get(index).name);
        converter.convert(goods.get(index).cost, currency);
        System.out.println("Спасибо за покупку!");

    }

    public static String goodInit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Введите название товара: ");
        String name = scanner.nextLine();
        if (name.equals("")){
            return "";
        }
        System.out.print ("Введите цену товара: ");
        Double cost = scanner.nextDouble();
        if (cost.toString().equals("")){
            return "";
        }
        Good good = new Good(name, cost);
        goods.add(good);
        return " ";
    }
}
