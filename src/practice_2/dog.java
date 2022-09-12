package practice_2;

/*
Разработайте и реализуйте класс Dog (Собака),
поля класса описывают кличку и возраст собаки.
Необходимо выполнить следующие действия:

определить конструктор собаки, чтобы принять и инициализировать данные экземпляра.,
включить стандартные методы  (аксессоры) для получения и установки для имени и возраста,
включить метод для перевода возраста собаки в "человеческий " возраст
(возраст семь раз собаки),
включите метод ToString, который возвращает описание экземпляра собаки в виде строки.

Создание класса тестера под названием ПитомникСобак,
реализует массив собак и основной метод этого класса
позволяет добавить в него несколько объектов собаки.
 */
public class dog {
    public static void main(String[] args) {
        ObjectDog Doge = new ObjectDog("Strelka", 4);
        Doge.ToString();
    }
}

class ObjectDog {
    String nickname;
    int age;
    int id = 0;
    public ObjectDog (String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() { return nickname; }
    public int getAge() { return age; }
    public void setNickname(String nickname) { this.nickname = nickname; }
    public void setAge(int age) { this.age = age; }
    public int humanAge() { return age*7; }
    public void ToString() { System.out.println("Nickname: " + nickname +
            "\nAge: " + age + " (Human age: " + humanAge() + ")"); }
    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }

}

