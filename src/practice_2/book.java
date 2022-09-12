package practice_2;

public class book {
    public static void main(String[] args) {
        practice_2.ObjectBook Jujutsu = new practice_2.ObjectBook(
                "Магическая Битва",
                "2",
                "Графический роман. Манга",
                "Сенён",
                "Гэгэ Акутами",
                "В одном из токийских кинотеатров сотрудники обнаруживают тела трех старшеклассников, чьи головы деформированы неестественным образом. Информацию о загадочном убийстве передают в Токийский магический колледж, и на место происшествия приезжают Юдзи Итадори и его старший коллега. Маги берутся за расследование, не подозревая, что вскоре им предстоит сделать страшное открытие.\n" +
                        "Тем временем жизнь в магическом колледже тоже не стоит на месте: сокурсники Юдзи вовсю готовятся к приближающейся ежегодной программе обмена опытом с киотскими заклинателями, которые, по слухам, значительно превосходят токийских студентов…\n" +
                        "\n");
        System.out.println(Jujutsu.getBook_series() + " Кн." + Jujutsu.getBook_number());
        System.out.println("Тип книги: " + Jujutsu.getBook_type());
        System.out.println("Жанр книги: " + Jujutsu.getBook_genre());
        System.out.println("Автор: " + Jujutsu.getBook_author());
        System.out.println("Описание: " + Jujutsu.getBook_description());
    }
}

class ObjectBook {
    private String book_series;
    private String book_number;
    private String book_type;
    private String book_genre;
    private String book_author;
    private String book_description;

    public ObjectBook(String book_series, String book_number, String book_type,
                      String book_genre, String book_author, String book_description) {
        this.book_series = book_series;
        this.book_number = book_number;
        this.book_type = book_type;
        this.book_genre = book_genre;
        this.book_author = book_author;
        this.book_description = book_description;
    }

    public String getBook_series() {
        return this.book_series;
    }

    public String getBook_number() {
        return book_number;
    }

    public String getBook_type() {
        return book_type;
    }

    public String getBook_genre() {
        return book_genre;
    }

    public String getBook_author() {
        return book_author;
    }

    public String getBook_description() {
        return book_description;
    }

}
