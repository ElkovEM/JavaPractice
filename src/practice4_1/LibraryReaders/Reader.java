package practice4_1.LibraryReaders;

/*
5. Класс «Читатели библиотеки». Определить класс Reader, хранящий
такую информацию о пользователе библиотеки: ФИО, номер читательского
билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().
Разработать программу, в которой создается массив объектов данного класса.
Перегрузить методы takeBook(), returnBook(): -

takeBook, который будет принимать количество взятых книг.
Выводит на консоль сообщение "Петров В. В. взял 3 книги".

takeBook, который будет принимать переменное количество
названий книг. Выводит на консоль сообщение "Петров В. В. взял книги:
Приключения, Словарь, Энциклопедия".

takeBook, который будет принимать переменное количество объектов класса
Book (создать новый класс, содержащий имя и автора книги).
Выводит на консоль сообщение “Петров В. В. взял книги: Приключения, Словарь, Энциклопедия”.

Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение “Петров В. В.
вернул книги: Приключения, Словарь, Энциклопедия”. Или “Петров В. В.
вернул 3 книги”.
 */
public class Reader {
    String name;
    int card;
    String faculty;
    int dateOfBirth;
    int number;

    public Reader(String name, int card, String faculty, int dateOfBirth, int number) {
        this.name = name;
        this.card = card;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.number = number;
    }

    void takeBook(){
        System.out.println(name + "взял книги");
    };
    void takeBook(int books) {
        System.out.println(name + "взял " + books + " книги");
    }
    void takeBook(String[] books) {
        System.out.println(name + "взял книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i] + " ");
        }
    }
    void takeBook(Book[] books) {
        System.out.println(name + "взял книги: ");
        for (int i = 0; i < books.length; i++) {
            books[i].toString();
        }
    }

    void returnBook(){
        System.out.println(name + "вернул книги");
    };
    void returnBook(int books) {
        System.out.println(name + "вернул " + books + " книги");
    }
    void returnBook(String[] books) {
        System.out.println(name + "вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i] + " ");
        }
    }
    void returnBook(Book[] books) {
        System.out.println(name + "вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].toString());
        }
    }
}
