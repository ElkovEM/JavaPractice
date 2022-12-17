package practice4_1.LibraryReaders;

public class Book {
    String author;
    String name;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
