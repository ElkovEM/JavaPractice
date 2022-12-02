package pr4.EShop;

public class Skirt extends Clothes implements WomanClothing {

    public Skirt(Size clothesSize, int clothesPrice, String clothesColor) {
        this.clothesSize = clothesSize;
        this.price = clothesPrice;
        this.clothesColor = clothesColor;
    }

    @Override
    public String dressWoman() {
        return "Skirt:" +
                "Size: " + clothesSize +
                ", EuroSize: " + this.clothesSize.getEuroSize() +
                ", Price: " + price +
                ", Color: '" + clothesColor + '\'' +
                ", Description: '" + this.clothesSize.getDescription() + "'" +
                "}\n";
    }
}
