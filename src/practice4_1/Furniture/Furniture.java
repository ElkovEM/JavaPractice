package practice4_1.Furniture;

/*
9. Создать абстрактный класс, описывающий сущность мебель. С
помощью наследования реализовать различные виды мебели. Также создать
класс FurnitureShop, моделирующий магазин мебели. Протестировать работу
классов
 */
public abstract class Furniture {
    private int legCount;
    private double height;
    private double width;
    private double depth;
    private boolean maySeat;
    private int price;
    private String modelName;

    public Furniture(int legCount, double height, double width, double depth, boolean maySeat, int price, String modelName) {
        this.legCount = legCount;
        this.depth = depth;
        this.maySeat = maySeat;
        this.price = price;
        this.modelName = modelName;
    }

    public abstract void jumpOn();

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public int getLegCount() {
        return legCount;
    }

    public boolean isMaySeat() {
        return maySeat;
    }

    @Override
    public String toString() {
        return "modelName=" + modelName +
                ", legCount=" + legCount +
                ", height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                ", maySeat=" + maySeat +
                ", price=" + price;
    }
}
