package JieKo.NeiBuLei.Exercise;

public abstract class Item {
    public abstract boolean disposable();

    public static void main(String[] args) {
        Item item = new Item(){
            public boolean disposable(){
                return true;
            }
        };
        System.out.println(item.disposable());
    }
}
