package practice4_1.ManagerEmployer;

/*
6. Создайте пример наследования, реализуйте класс Employer и класс
Manager. Manager отличается от Employer наличием дополнительных выплат от
продаж а) Класс Employer содержит переменные: String firstName, lastName и
поле income для заработной платы. Класс Manager также имеет поле double
averageSum содержащую среднюю суммы дополнительных выплат за продажи.
б) Создать переменную типа Employer, которая ссылается на объект типа
Manager. в) Создать метод getIncome() для класса Employer, который
возвращает заработную плату. Переопределить этот метод в классе Manager и
добавить к доходу сумму с продаж. г) Создать массив типа Employer
содержащий объекты класса Employer и Manager. Вызвать метод getIncome()
для каждого элемента массива
 */

public class Manager extends Employer {
    double averageSum;

    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        return income + averageSum;
    }
}
