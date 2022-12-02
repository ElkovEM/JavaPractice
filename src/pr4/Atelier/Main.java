package pr4.Atelier;

public class Main {
    public static void main(String[] args) {
        MenClothing[] man = new MenClothing[3];
        WomanClothing[] woman = new WomanClothing[3];
        man[0] = new TShirt(Size.M, 100, "Red");
        woman[0] = new TShirt(Size.XXS, 90, "Pink");
        man[1] = new Pants(Size.L, 120, "Blue");
        woman[1] = new Pants(Size.XS, 150, "White");
        man[2] = new Tie(Size.S, 50, "Black");
        woman[2] = new Skirt(Size.S, 90, "Green");

        Atelier manC = new Atelier();
        Atelier womanC = new Atelier();

        System.out.println(manC.dressMan(man));
        System.out.println(womanC.dressWoman(woman));
    }
}
