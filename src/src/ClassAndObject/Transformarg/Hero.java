package ClassAndObject.Transformarg;
import ClassAndObject.Override.*;
public class Hero {
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度

    public Hero() {
    }

    public void huixue(int xp) {
        hp = hp + xp;
        xp = 0;
    }

    public Hero(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }

    public void attack(Hero hero, int damage) {
        hero.hp = hero.hp - damage;
    }

    public void revive(Hero h){
        h = new Hero("提莫",383);
    }

    public static void main(String[] args) {
        Hero teemo = new Hero("提莫", 383);
        int xueping = 100;
        teemo.huixue(xueping);
        System.out.println(xueping);
        teemo.attack(teemo,3);
        System.out.println(teemo.hp);

        teemo.revive(teemo);
        System.out.println(teemo.hp);
    }
}
