package pr2.Book;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название книги");
        String name = scan.nextLine();
        System.out.println("Введите имя автора");
        String author = scan.nextLine();
        System.out.println("Введите год издания");
        int year = scan.nextInt();
        Book test = new Book(name, author, year);
        System.out.println(test);
    }
}
