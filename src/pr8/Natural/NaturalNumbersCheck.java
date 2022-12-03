package pr8.Natural;

/*
Дано натуральное число n>1. Проверьте, является ли оно простым.
Программа должна вывести слово YES, если число простое и NO, если число
составное. Алгоритм должен иметь сложность O(logn).
Указание. Понятно, что задача сама по себе нерекурсивна, т.к. проверка
числа n на простоту никак не сводится к проверке на простоту меньших чисел.
Поэтому нужно сделать еще один параметр рекурсии: делитель числа, и именно
по этому параметру и делать рекурсию
 */

public class NaturalNumbersCheck {
    static int var = 2;
    public static void checkIsItANaturalNumber(int n) {
        if (n > 1) {
            if (n % var != 0) {
                var++;
                checkIsItANaturalNumber(n);
            } else if (n % var == 0) {
                printIsItNaturalNumber(var, n);
            }
        }
    }

    private static void printIsItNaturalNumber(int var, int n) {
        if (var == n) {
            System.out.println(n + " is a natural number.");
        } else {
            System.out.println(n + " is not a natural number.");
        }
    }
}
