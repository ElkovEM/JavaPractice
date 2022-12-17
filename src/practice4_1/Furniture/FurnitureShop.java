package practice4_1.Furniture;

public class FurnitureShop {
    private Furniture[] goods;

    public FurnitureShop(int count) {
        goods = new Furniture[count];
        for (int i = 0; i < count; ) {
            goods[i++] = new Chair("Standart", 1.7, 0.4, 0.4, "fabric", "Wood", true, 1300);
            if(i >= count) break;
            goods[i++] = new Table("Standart", 4, 1.65, 3.1, 1.9, 2700, "Wood", 3);
            if (i >= count)break;
            goods[i++] = new Bed("Standart", 0.8, 2, 3, 7400, 2,
                    230, "Wood", "Sheep's wool");
        }
    }

    public Furniture[] getGoods() {
        return goods;
    }

    public void add(Furniture f){
        Furniture[] tmp = new Furniture[goods.length+1];
        System.arraycopy(goods, 0, tmp, 0, goods.length);
        tmp[goods.length] = f;
        goods = tmp;
    }

    public Furniture buy(int number){
        Furniture f = goods[number];
        Furniture[] tmp = new Furniture[goods.length-1];
        for (int i = 0; i < goods.length; i++){
            if(i < number) tmp[i] = goods[i];
            if (i > number) tmp[i-1] = goods[i];
        }
        goods = tmp;
        return f;
    }

    public String getPrices(){
        String res = "Shop is selling these goods:\n\n";
        for (Furniture f : goods) {
            res += f.toString() + "\n";
        }

        return res;
    }
}
