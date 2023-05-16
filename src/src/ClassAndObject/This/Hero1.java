package ClassAndObject.This;

public class Hero1 {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public Hero1(String name, float hp){
        this.name = name;
        this.hp = hp;
    }

    public Hero1(String name, float hp, float armor, int moveSpeed){
        this(name,hp);
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }

    public static void main(String[] args) {
        Hero1 garen = new Hero1("盖伦",100);
        Hero1 timo = new Hero1("提莫",100,40,350);
    }
}
