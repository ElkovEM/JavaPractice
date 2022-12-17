package practice4_1.ManagerEmployer;

public class Employer {
    String firstName;
    String lastName;
    double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome() {
        return income;
    }
}
