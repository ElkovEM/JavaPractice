package pr3.Random;
import java.util.Random;
/*
1. Создать массив вещественных чисел случайным образом, вывести его
на экран, отсортировать его, и снова вывести на экран (использовать два
подхода к генерации случайных чисел – метод random() класса Math и класс
Random)
 */

public class RandomArray {
    public static void main(String[] args) {
        float[] arrayMath = new float[20];
        float[] arrayRandom = new float[20];
        randomMathFilling(arrayMath);
        System.out.println("Random filled Array by random():");
        printArray(arrayMath);
        System.out.println("Sorted:");
        selectionSort(arrayMath);
        printArray(arrayMath);

        System.out.println();

        randomRandomFilling(arrayRandom);
        System.out.println("Random filled Array by Random class:");
        printArray(arrayRandom);
        System.out.println("Sorted:");
        selectionSort(arrayRandom);
        printArray(arrayRandom);
    }

    public static void randomMathFilling(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float)(Math.random()*array.length);
        }
    }
    public static void randomRandomFilling(float[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextFloat()* array.length;
        }
    }

    public static void printArray(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(float[] sortArr) {
        for (int i = 0; i < sortArr.length; i++) {
            int pos = i;
            float min = sortArr[i];
            //цикл выбора наименьшего элемента
            for (int j = i + 1; j < sortArr.length; j++) {
                if (sortArr[j] < min) {
                    //pos - индекс наименьшего элемента
                    pos = j;
                    min = sortArr[j];
                }
            }
            sortArr[pos] = sortArr[i];
            //меняем местами наименьший с sortArr[i]
            sortArr[i] = min;
        }
    }
}
