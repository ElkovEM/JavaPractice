package practice4_1.Person;

public class tester {
    public static void main(String[] args) {
        Person Egor = new Person("Egor Elkov", 19);
        Person Dima = new Person();
        Dima.setFullName("Dmitriy Ivanov");
        Dima.talk();
        Egor.move();
    }
}
