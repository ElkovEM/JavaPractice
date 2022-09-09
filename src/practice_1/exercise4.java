package practice_1.exercise4;

/*
Написать программу, в результате которой выводятся
на экран аргументы командной строки в цикле for
*/

public class exercise4 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++)
            System.out.println("Argument = " + args[i]);
        }
    }
}