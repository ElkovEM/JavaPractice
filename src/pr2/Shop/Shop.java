package pr2.Shop;

import java.util.ArrayList;

/*
4. Разработайте класс Shop, для этого реализуйте

Методы добавления и удаления компьютеров в магазине,
Добавьте метод поиска в магазине компьютера, нужного пользователю.

Протестируйте работу созданных классов.
Данные для заполнения массива компьютеров вводятся с клавиатуры
пользователем. Для этого реализуйте интерфейс.
 */

public class Shop {
    ArrayList<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer){
        computers.add(computer);
    }
    public void removeComputer(Computer computer){
        computers.remove(computer);
    }
    public Computer findComputer(Computer computer){
        for (Computer comp: computers){
            if(comp == computer){
                return computer;
            } else return null;
        }
        return null;
    }

    public void showComputers () {
        for (Computer computer : computers)
            System.out.println(computer.getName());
    }
}

