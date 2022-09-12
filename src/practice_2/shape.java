package practice_2;

/*
Необходимо реализовать
простейший класс Shape (Фигура) на языке программирования Java.
- Добавить метод toString().
- Создать класс-тестер для вывода информации об объекте.
 */


public class shape {
    public static void main(String[] args) {
        Tester square = new Tester("Square");
        square.nameOutput();
    }

}

class ObjectShape {
    String name;
    public ObjectShape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class Tester extends ObjectShape {
    public Tester(String name) {
        super(name);
    }
    void nameOutput() {
        System.out.println((getName()));
    }
}

