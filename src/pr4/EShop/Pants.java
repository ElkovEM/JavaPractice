package pr4.EShop;

public class Pants extends Clothes implements MenClothing, WomanClothing {

    public Pants(Size clothesSize, int clothesPrice, String clothesColor) {
        this.clothesSize = clothesSize;
        this.price = clothesPrice;
        this.clothesColor = clothesColor;
    }

    @Override
    public String dressMan() {
        return "Pants for Man (cool):" +
                "Size: " + clothesSize +
                ", EuroSize: " + this.clothesSize.getEuroSize() +
                ", Price: " + price +
                ", Color: '" + clothesColor + '\'' +
                ", Description: '" + this.clothesSize.getDescription() + "'" +
                "}\n";
    }

    @Override
    public String dressWoman() {
        return "Pants for Woman (nice):" +
                "Size: " + clothesSize +
                ", EuroSize: " + this.clothesSize.getEuroSize() +
                ", Price: " + price +
                ", Color: '" + clothesColor + '\'' +
                ", Description: '" + this.clothesSize.getDescription() + "'" +
                "}\n";
    }
}
