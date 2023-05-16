package Class;

public class Method {
    String name;
    double hp;
    double armor;
    int moveSpeed;

    void keng() {
        System.out.println("坑队友");
    }

    double getArmor() {
        return armor;
    }

    void addSpeed(int speed) {
        moveSpeed = moveSpeed + speed;
    }

    void legendary() {
        System.out.println("超神！");
    }

    float getHp() {
        return (float) hp;
    }

    void recovery(float blood) {
        hp = hp + blood;
        System.out.println("本次恢复了" + blood + "血量");
    }

    public static void main(String[] args) {
        Method hero = new Method();
        hero.name = "ccz";
        hero.armor = 382;
        hero.hp = 5000;
        hero.moveSpeed = 330;
        hero.keng();
        hero.getArmor();
        hero.addSpeed(100);
        hero.legendary();
        hero.recovery(100f);
        float hp = hero.getHp();
        System.out.println(hp);
    }

}
