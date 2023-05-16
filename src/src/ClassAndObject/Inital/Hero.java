package ClassAndObject.Inital;

public class Hero {
    public String name = "some hero";
    protected float hp;
    float maxHP;

    {
        maxHP = 200;
    }

    public Hero(){
        hp = 100;
    }

    public static int itemCapacity=8;

    static{
        itemCapacity = 6;
    }
    public static void main(String[] args) {

    }
}
