package pr8.Natural;

import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        NaturalNumbersCheck Natural = new NaturalNumbersCheck();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Natural.checkIsItANaturalNumber(n);
    }
}

