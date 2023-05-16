package ClassAndObject;

public class Cite {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public static void main(String[] args) {
        Cite hero = new Cite();
        hero.name = "盖伦";
        //一个引用，多个对象
        Cite h2 = hero;
        Cite h3 =hero;
        System.out.println(h3.name);
        //一个引用，同一时间只能指向一个对象
        Cite aaa = new Cite();
        aaa.name = "aaa";
        aaa = new Cite();
        System.out.println(aaa.name);
    }
}
