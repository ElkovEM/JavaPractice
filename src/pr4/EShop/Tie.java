package pr4.EShop;

public class Tie extends Clothes implements MenClothing {

    public Tie(Size clothesSize, int clothesPrice, String clothesColor) {
        this.clothesSize = clothesSize;
        this.price = clothesPrice;
        this.clothesColor = clothesColor;
    }

    @Override
    public String dressMan() {
        return "Tie:" +
                " Size: " + clothesSize +
                ", EuroSize: " + this.clothesSize.getEuroSize() +
                ", Price: " + price +
                ", Color: '" + clothesColor + '\'' +
                ", Description: '" + this.clothesSize.getDescription() + "'" +
                "}\n";
    }
}
