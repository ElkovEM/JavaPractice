package practice4_1.ManagerEmployer;

public class tester {
    public static void main(String[] args) {
        Employer[] Rabotyagi = new Employer[3];
        Rabotyagi[0] = new Manager("Egor", "Ivanov", 50000, 15000);
        Rabotyagi[1] = new Employer("Dima", "Dmitriev", 65310);
        Rabotyagi[2] = new Employer("Kirill", "Sergeev", 58012);
        System.out.println(Rabotyagi[0].getIncome());
        System.out.println(Rabotyagi[1].getIncome());
        System.out.println(Rabotyagi[2].getIncome());
    }

}
