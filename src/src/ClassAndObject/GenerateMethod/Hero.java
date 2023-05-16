package ClassAndObject.GenerateMethod;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public Hero(){
        //如果不写，默认提供一个无参的构造方法
        System.out.println("实例化一个对象的时候，必然调用构造方法");
    }

    public static void main(String[] args) {
        Hero h = new Hero();
    }
}
