package pr2.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author Author = new Author("name", "email", 'M');
        System.out.println("Автор: " + Author.getName() + "\nПол: " + Author.getGender() + "\nЭлектронная почта: " + Author.getEmail());
    }
}
