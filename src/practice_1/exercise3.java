package practice_1.exercise3;

import java.lang.reflect.Array;
import java.util.Random;

/*
Написать программу,
в результате которой считается сумма элементов целочисленного массива с помощью
циклов for, while, do while, результат выводится на экран.
*/

public class exercise3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillingArray(array);
        SumArrayFor(array);
        SumArrayWhile(array);
        SumArrayDoWhile(array);
    }

    public static void fillingArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }

        System.out.print("Defined array (integer 1 to 100): ");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void SumArrayFor(int[] array) {
        int ArraySum = 0;
        for (int j : array) {
            ArraySum += j;
        }
        System.out.println("\nSum of array through 'for':");
        System.out.println(ArraySum);
    }

    public static void SumArrayWhile(int[] array) {
        int ArraySum = 0;
        int i = 0;
        while (i < array.length) {
            ArraySum += array[i];
            i++;
        }
        System.out.println("Sum of array through 'while':");
        System.out.println(ArraySum);
    }

    public static void SumArrayDoWhile(int[] array) {
        int ArraySum = 0;
        int i = 0;
        do {
            ArraySum += array[i];
            i++;
        } while (i < array.length);
        System.out.println("Sum of array through 'do while':");
        System.out.println(ArraySum);
    }
}