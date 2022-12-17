package practice4_1.Phone;

/*
2. Создайте класс Phone, который содержит переменные number,
model и weight.
1)Создайте три экземпляра этого класса. 2) Выведите на консоль значения
их переменных. 3) Добавить в класс Phone методы: receiveCall, имеет один
параметр – имя звонящего. 4)Выводит на консоль сообщение “Звонит {name}”.
5)Метод getNumber – возвращает номер телефона. 6) Вызвать эти методы для
каждого из объектов. 7) Добавить конструктор в класс Phone, который
принимает на вход три параметра для инициализации переменных класса -
number, model и weight. 8)Добавить конструктор, который принимает на вход
два параметра для инициализации переменных класса - number, model.
9)Добавить конструктор без параметров. 10)Вызвать из конструктора с тремя
параметрами конструктор с двумя. 11)Добавьте перегруженный метод.
receiveCall, который принимает два параметра - имя звонящего и номер
телефона звонящего. 12)Вызвать этот метод. 13)Создать метод sendMessage с
аргументами переменной длины. Данный метод принимает на вход номера
телефонов, которым будет отправлено сообщение. 14)Метод выводит на
консоль номера этих телефонов.
 */
public class Phone {
    int number;
    String model;
    double weight;

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    String receiveCall(String callerName) {
        return callerName + " calls";
    }
    String receiveCall(String callerName, int callerNumber) {
        return callerName + " calls, number: " + callerNumber;
    }

    void sendMessage(String message, int[] numbers) {
        System.out.println("You are sending message: " + message + "\nto these numbers");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    int getNumber() {
        return number;
    }
}
