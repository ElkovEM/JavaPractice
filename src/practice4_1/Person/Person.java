package practice4_1.Person;

/*
3. Создать класс Person, который содержит: a) поля fullName, age. б)
методы move() и talk(), в которых просто вывести на консоль сообщение -
"Такой-то Person говорит". в) Добавьте два конструктора - Person() и
Person(fullName, age). Создайте два объекта этого класса. Один объект
инициализируется конструктором Person(), другой - Person(fullName, age)
 */

public class Person {
    String fullName;
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void move() {
        System.out.println("Such-and-such " + fullName + " moves");
    }

    void talk() {
        System.out.println("Such-and-such " + fullName + " talks");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
