package practice_1;

/*
Написать программу, которая с помощью метода,
вычисляет факториал числа (использовать управляющую конструкцию цикла),
проверить работу метода.
*/

public class exercise7 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(Factorial(a));
    }
    private static int Factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
