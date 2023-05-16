package ClassAndObject.ClassProperty;

public class Hero {
    public String name;
    protected float hp;
    static String copyright;//由static修饰的类属性会被所有对象共享
    //类属性又叫静态属性
    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        Hero.copyright = "版权由公司所有";

        System.out.println(garen.name);
        System.out.println(garen.copyright);

        Hero teemo = new Hero();
        teemo.name = "提莫";
        System.out.println(teemo.name);
        System.out.println(teemo.copyright);
        System.out.println("******************");
        System.out.println(Hero.copyright);
        garen.copyright="sssss";
        System.out.println(garen.copyright);
        System.out.println(teemo.copyright);
    }
}
