package pr3.ArrayTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Task5 Task = new Task5();
        Scanner scanner = new Scanner(System.in);
        int arraySize = -1;
        while (!(arraySize >= 0)){
            System.out.println("Введите размер массива: ");
            arraySize = scanner.nextInt();
        }

        int arrayOfInteger[] = new int[arraySize];
        System.out.println("Array 1: ");
        for (int i = 0; i < arraySize; i++){
            arrayOfInteger[i] = (int)(Math.random()*(arraySize + 1));
            System.out.print(arrayOfInteger[i] + " ");
        }
        System.out.println();

        System.out.println("Array 2: ");
        Task.ArrayEven(arrayOfInteger);

    }

    public void ArrayEven(int[] array) {
        ArrayList <Integer> SortedArray = new ArrayList <>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)  {
                SortedArray.add(array[i]);
            }
        }
        for (int i = 0; i < SortedArray.size(); i++) {
            System.out.print(SortedArray.get(i) + " ");
        }
    }
}


