package pr4.EShop;

public class TShirt extends Clothes implements MenClothing, WomanClothing {


    public TShirt(Size clothesSize, int clothesPrice, String clothesColor) {
        this.clothesSize = clothesSize;
        this.price = clothesPrice;
        this.clothesColor = clothesColor;
    }

    @Override
    public String dressMan() {
        return "TShirt for Man (very cool):" +
                "Size: " + clothesSize +
                ", EuroSize: " + this.clothesSize.getEuroSize() +
                ", Price: " + price +
                ", Color: '" + clothesColor + '\'' +
                ", Description: '" + this.clothesSize.getDescription() + "'" +
                "}\n";
    }

    @Override
    public String dressWoman() {
        return "TShirt for Woman (also very cool):" +
                "Size: " + clothesSize +
                ", EuroSize: " + this.clothesSize.getEuroSize() +
                ", Price: " + price +
                ", Color: '" + clothesColor + '\'' +
                ", Description: '" + this.clothesSize.getDescription() + "'" +
                "}\n";
    }

}
