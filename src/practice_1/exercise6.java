package practice_1.exercise6;

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
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] =(int)(Math.random()*20);
        }
    }

    private static void printArray (int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
public class Quicksort {
    public static void quicksort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);

        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        quicksort(array, lowIndex, leftPointer - 1);
        quicksort(array, leftPointer + 1, highIndex);

    }

    public static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;

        while (leftPointer < rightPointer) {

            // Walk from the left until we find a number greater than the pivot, or hit the right pointer.
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            // Walk from the right until we find a number less than the pivot, or hit the left pointer.
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        if(array[leftPointer] > array[highIndex]) {
            swap(array, leftPointer, highIndex);
        }
        else {
            leftPointer = highIndex;
        }

        return leftPointer;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}