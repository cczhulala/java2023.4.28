package JieKo.ChouXianLei.Exercise;

public abstract class Item {
    public abstract boolean disposable();

    public static void main(String[] args) {
        LifePotion l = new LifePotion();
        System.out.println(l.disposable());
    }
}
