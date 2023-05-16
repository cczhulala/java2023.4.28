package ClassAndObject;

public class Inheritance {
    public class Item{
        String name;
        int price;
    }

    public class Weaponother extends Item{
        //在类前面加上静态方法也行
        int damage;
    }

    public static void main(String[] args){
        Inheritance inheritance = new Inheritance();
        Weaponother test = inheritance.new Weaponother();
    }
}
