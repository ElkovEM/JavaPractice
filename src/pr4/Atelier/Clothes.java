package pr4.Atelier;

public abstract class Clothes {
    protected Size clothesSize;
    protected int clothesPrice;
    protected String clothesColor;

    Clothes() {

    }

    public Size getClothesSize() {
        return clothesSize;
    }

    public void setClothesSize(Size clothesSize) {
        this.clothesSize = clothesSize;
    }

    public int getClothesPrice() {
        return clothesPrice;
    }

    public void setClothesPrice(int clothesPrice) {
        this.clothesPrice = clothesPrice;
    }

    public String getClothesColor() {
        return clothesColor;
    }

    public void setClothesColor(String clothesColor) {
        this.clothesColor = clothesColor;
    }
}
