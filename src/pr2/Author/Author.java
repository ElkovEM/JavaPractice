package pr2.Author;

/*
1. По диаграмме класса UML описывающей сущность Автор.
Необходимо написать программу, которая состоит из двух классов Author и
TestAuthor. Класс Author должен содержать реализацию методов,
представленных на диаграмме класса на рисунке 2.4
 */

public class Author {
    String name;
    String email;
    char gender;
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author: " +
                "name: " + name +
                "gender: " + gender +
                "email: " + email;
    }
}

