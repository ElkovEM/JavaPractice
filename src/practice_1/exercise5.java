package practice_1;

/*
Написать программу, в результате работы которой выводятся
на экран первые 10 чисел гармонического ряда (форматировать вывод).
*/

public class exercise5 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++)
            System.out.println(String.format("Argument %d: %s", i, args[i]));
    }
}