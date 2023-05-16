package ClassAndObject.Override;

import com.sun.istack.internal.NotNull;

public class Support extends Hero {
    public void heal() {
        System.out.println("不知道给谁加了血");
    }

    public void heal(Hero h) {
        System.out.println("给" + h.name + "加血");
    }

    public void heal(Hero h, int hp) {
        System.out.println("给" + h.name + "加了" + hp + "的血");
    }

    public static void main(String[] args) {
        Support H = new Support();
        Hero h = new Hero();
        h.name = "提莫";
        int hp = (int) (Math.random() * 1000);
        H.heal();
        H.heal(h);
        H.heal(h, hp);

    }
}
