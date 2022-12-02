package pr4.EShop;

public abstract class Clothes {
    protected Size clothesSize;
    protected int price;
    protected String clothesColor;

    Clothes() {

    }

    public Size getClothesSize() {
        return clothesSize;
    }

    public void setClothesSize(Size clothesSize) {
        this.clothesSize = clothesSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getClothesColor() {
        return clothesColor;
    }

    public void setClothesColor(String clothesColor) {
        this.clothesColor = clothesColor;
    }
}
