package pr4.Atelier;

public class Atelier {
    public String dressMan(MenClothing[] man) {
        String s = "Man clothes: \n";
        for (int i = 0; i < 3; i++) {
            s += man[i].dressMan();
        }
        return s;
    }
    public String dressWoman(WomanClothing[] woman) {
        String s = "Woman clothes: \n";
        for (int i = 0; i < 3; i++) {
            s += woman[i].dressWoman();
        }
        return s;
    }
}
