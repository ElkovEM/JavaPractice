package practice_1;

import java.lang.reflect.Array;
import java.util.Random;

/*
Написать программу, в результате которой генерируется
массив целых чисел случайным образом, вывести его на экран, отсортировать его,
и снова вывести на экран
(использовать два подхода к генерации случайных чисел – метод random() класса Math
и класс Random).
 */


public class exercise6 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Quicksort qcksrt = new Quicksort();
        fillingArrayRandom(array);

        System.out.println("Before the sort: ");
        printArray(array);

        qcksrt.quicksort(array, 0, array.length-1);

        System.out.println("\nAfter the sort: ");
        printArray(array);
    }

    private static void fillingArrayRandom (int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] =(int)(Math.random()*100);
        }
    }

    private static void printArray (int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
