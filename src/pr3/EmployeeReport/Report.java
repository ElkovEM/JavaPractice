package pr3.EmployeeReport;

import java.util.ArrayList;
import java.util.Formatter;

public class Report {
    public static ArrayList<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {
        setEmployees();
        generateReport();
    }
    static void setEmployees(){
        Employee employee1 = new Employee("Виноградов Борис Дмитриевич", 35_500.200);
        employees.add(employee1);
        Employee employee2 = new Employee("Глухова Алёна Максимовна", 102_017.12);
        employees.add(employee2);
        Employee employee3 = new Employee("Воронов Максим Ярославович", 64_303.11);
        employees.add(employee3);
    }

    static void generateReport(){
        for (Employee employee:employees){
            //String str = String.format("Сотрудник %s. Зарплата: %s", employee.fullName, employee.salary);
            Formatter formatter = new Formatter();
            formatter.format("Сотрудник %-40s Зарплата: %s", employee.fullname, employee.salary);
            System.out.println(formatter);
        }
    }
}
