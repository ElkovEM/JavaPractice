package pr8.Decomposition;

/*
Дано натуральное число n>1. Выведите все простые множители этого
числа в порядке не убывания с учетом кратности. Алгоритм должен иметь
сложность O(logn)
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Decomposition {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the natural number: ");
        int number = in.nextInt();
        System.out.println(primesRecursive(number));
    }

    public static List<Integer> primesRecursive(int n) {
        return primesRecursive(n, 2);
    }

    //overload a private method that also takes f as argument:
    private static List<Integer> primesRecursive(int n, int f) {
        if (n == 1) return new ArrayList<Integer>();
        if (n % f == 0) {
            List<Integer> factors = primesRecursive(n/f, f);
            factors.add(f);
            return factors;
        } else
            return primesRecursive(n, f+1);
    }
}

