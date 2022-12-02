package pr4.EShop;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Main(String[] arg) {
        users.add(new Users(arg[0], arg[1]));
    }
    private ArrayList<Users> users = new ArrayList<>();

    public static void main(String[] args) {
        String[] arg = new String[2];
        Main shop = new Main(arg);
        boolean flag = false;
        while (flag == false) {
            System.out.println("Sign in(Enter 1) or Sign up(Enter 2).");
            Scanner in = new Scanner(System.in);
            int select = in.nextInt();
            if (select == 1) {
                flag = shop.signIn();
            } else {
                shop.addUsersInList();
                flag = true;
            }
        }
        shop.catalog();
    }

    public boolean signIn() {
        System.out.print("Enter login: ");
        Scanner in = new Scanner(System.in);
        String login = in.nextLine();
        for (Users user : users) {
            if (login.equals(user.getLogin())) {
                System.out.print("Enter password: ");
                String password = in.nextLine();
                if (password.equals(user.getPassword())) {
                    System.out.println("You have successfully logged in.");
                    return true;
                } else {
                    System.out.println("Wrong password.");
                    return false;
                }
            }
        }
        System.out.println("Wrong login. Try sign up.");
        return false;
    }

    public void getUsersInformation() {
        for (Users user : users) {
            System.out.println(user.getLogin() + " " + user.getPassword());
        }
    }

    public void addUsersInList() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter login and password.\n");
        users.add(new Users(in.nextLine(), in.nextLine()));
        System.out.println("You have successfully registered." + "\nYour login: " + users.get(users.size() - 1).getLogin() +
                "\nYour password: " + users.get(users.size() - 1).getPassword() + "\nRemember it.");
    }

    public void catalog() {
        Scanner in = new Scanner(System.in);
        Catalog[] catalog = Catalog.values();
        System.out.println("\nCatalogs: ");
        for (Catalog i : catalog) {
            System.out.println(i);
        }
        boolean flag = true; String sex;
        Catalog man = Catalog.Man;
        Catalog woman = Catalog.Woman;
        while (flag) {
            System.out.println("Select a directory (Man, Woman). Enter \"Show\" for show shopping cart. " +
                    "If you have added items to the shopping cart and want to buy or want to leave the store, enter \"Exit\".");
            sex = in.nextLine();
            if (sex.equals("Man")) {
                man.showManClothes();
            } else if (sex.equals("Woman")) {
                woman.showWomanClothes();
            } else if (sex.equals("Show")) {
                man.cartShow();
            } else if (sex.equals("Exit")) {
                System.out.println("Buy price: " + man.getBuyPrice() + "$.");
                break;
            } else {
                break;
            }
        }
    }
}
