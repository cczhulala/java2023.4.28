package JieKo.DuoTai;

public class Item {
    String name;
    int price;

    public void buy(){
        System.out.println("购买");
    }
    public void effect(){
        System.out.println("物品使用后，可以有效果");
    }

    public static void main(String[] args) {
        Item i1 = new LifePotion();
        Item i2 = new MagicPotion();
        i1.effect();
        i2.effect();
    }
}
