package ClassAndObject.Exercise1;

public class Armor extends Item{
    int ac;
    public static void main(String[] args){
        Armor hero1 = new Armor();
        hero1.name = "布甲";
        hero1.price = 300;
        hero1.ac = 15;

        Armor hero2 = new Armor();
        hero2.name = "锁子甲";
        hero2.price = 500;
        hero2.ac = 40;

    }
}
