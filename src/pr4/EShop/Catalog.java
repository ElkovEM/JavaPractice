package pr4.EShop;
import java.util.ArrayList;
import java.util.Scanner;

public enum Catalog {
    Man {
        private TShirt tShirt = new TShirt(Size.M, 100, "Red");
        private Pants pants = new Pants(Size.L, 120, "Blue");
        private Tie tie = new Tie(Size.S, 50, "Black");

        public void showManClothes() {
            MenClothing[] man = new MenClothing[3];
            man[0] = tShirt; man[1] = pants; man[2] = tie;
            for (int i = 0; i < 3; i++) {
                System.out.print(i + 1 + " : " + man[i].dressMan());
            }
            System.out.println("Enter item number if you want to add items to your shopping cart or \"Exit\" to return to the selection of catalogs.");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            switch (n) {
                case(1):
                    cart.add(man[0].dressMan());
                    buyPrice += man[0].getPrice();
                    break;
                case(2):
                    cart.add(man[1].dressMan());
                    buyPrice += man[1].getPrice();
                    break;
                case(3):
                    cart.add(man[2].dressMan());
                    buyPrice += man[2].getPrice();
                    break;
            }
        }
    }, Woman {
        private TShirt tShirt = new TShirt(Size.XXS, 150, "Red");
        private Pants pants = new Pants(Size.S, 220, "Blue");
        private Skirt skirt = new Skirt(Size.S, 120, "Black");

        public void showWomanClothes() {
            WomanClothing[] woman = new WomanClothing[3];
            woman[0] = tShirt; woman[1] = pants; woman[2] = skirt;
            for (int i = 0; i < 3; i++) {
                System.out.print(i + 1 + " : " + woman[i].dressWoman());
            }
            System.out.println("Enter item number if you want to add items to your shopping cart or \"Exit\" to return to the selection of catalogs.");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            switch (n) {
                case(1):
                    cart.add(woman[0].dressWoman());
                    buyPrice += woman[0].getPrice();
                    break;
                case(2):
                    cart.add(woman[1].dressWoman());
                    buyPrice += woman[1].getPrice();
                    break;
                case(3):
                    cart.add(woman[2].dressWoman());
                    buyPrice += woman[2].getPrice();
                    break;
            }
        }
    };

    public void showManClothes() {}

    public void showWomanClothes() {}

    private static ArrayList<String> cart = new ArrayList<>();

    private static int buyPrice = 0;

    public void cartShow() {
        for (int i = 0; i < cart.size(); i++) {
            System.out.print(i + 1 + ". " + cart.get(i));
        }
    }

    public int getBuyPrice() {
        return buyPrice;
    }
}
