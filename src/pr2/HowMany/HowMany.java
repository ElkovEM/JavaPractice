package pr2.HowMany;
import java.util.Scanner;

public class HowMany {
    int userWords = 0;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HowMany wordCounter = new HowMany();
        String word = " ";
        System.out.println("Вводите слова по одному, каждое с новой строки, конец ввода пустая строка: ");
        while (!word.equals("")){
            word = scanner.nextLine();
            wordCounter.userWords++;
        }
        System.out.println("Количество слов, которые вы ввели: " + (wordCounter.userWords - 1));

    }
}
