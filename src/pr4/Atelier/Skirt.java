package pr4.Atelier;

public class Skirt extends Clothes implements WomanClothing {

    public Skirt(Size clothesSize, int clothesPrice, String clothesColor) {
        this.clothesSize = clothesSize;
        this.clothesPrice = clothesPrice;
        this.clothesColor = clothesColor;
    }

    @Override
    public String dressWoman() {
        return "Skirt:" +
                "Size: " + clothesSize +
                ", EuroSize: " + this.clothesSize.getEuroSize() +
                ", Price: " + clothesPrice +
                ", Color: '" + clothesColor + '\'' +
                ", Description: '" + this.clothesSize.getDescription() + "'" +
                "}\n";
    }
}
