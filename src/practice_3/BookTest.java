package practice_3;

/*
Создать класс, описывающий книгу (Book).
В классе должны быть описаны нужные свойства
книги(автор, название, год написания и т. д.)и методы для получения,
изменения этих свойств. Протестировать работу класса
в классе BookTest, содержащим метод статический main(String[] args).
 */

public class BookTest {
    public static void main(String[] args) {
        Book WarAndPeace = new Book("", "", "", "");
        WarAndPeace.setBook_series("Война и Мир");
        WarAndPeace.setBook_date("1865-1869 годах (Первая публикация)");
        WarAndPeace.setBook_genre("Роман-эпопея");
        WarAndPeace.setBook_author("Лев Николаевич Толстой");
        System.out.println(WarAndPeace.getBook_series() + " выпущен в " +
                WarAndPeace.getBook_date());
        System.out.println("Автор: " + WarAndPeace.getBook_author());
        System.out.println("Жанр книги: " + WarAndPeace.getBook_genre());
    }
}

class Book {
    private String book_series;
    private String book_date;
    private String book_genre;
    private String book_author;

    public Book (String book_series, String book_date,
                String book_genre, String book_author) {
        this.book_series = book_series;
        this.book_date = book_date;
        this.book_genre = book_genre;
        this.book_author = book_author;
    }
    public String getBook_series() {
        return this.book_series;
    }
    public String getBook_date() {
        return book_date;
    }
    public String getBook_genre() {
        return book_genre;
    }
    public String getBook_author() {
        return book_author;
    }
    public void setBook_series(String book_series) {
        this.book_series = book_series;
    }
    public void setBook_date(String book_date) {
        this.book_date = book_date;
    }
    public void setBook_genre(String book_genre) {
        this.book_genre = book_genre;
    }
    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }
}
