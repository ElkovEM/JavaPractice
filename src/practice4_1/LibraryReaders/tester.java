package practice4_1.LibraryReaders;

public class tester {
    public static void main(String[] args) {
        Reader[] Readers = new Reader[3];
        Book[] Books = new Book[2];
        Books[0] = new Book("author", "name");
        Books[1] = new Book("author2", "name2");
        Readers[0] = new Reader("Egor", 42515, "IIT",200603, 790572245);
        Readers[1] = new Reader("Dima", 42516, "IIT",140203, 791111111);
        Readers[2] = new Reader("Test", 11111, "IIT",111111, 111111111);

        Readers[1].takeBook(2);
        Readers[2].returnBook(Books);
    }
}
