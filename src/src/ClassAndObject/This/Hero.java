package ClassAndObject.This;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public Hero(String name) {
        System.out.println("一个参数的构造方法");
        this.name = name;
    }

    public Hero(String name, float hp) {
        //在一个构造方法中，调用另外一个构造方法
        this(name);
        System.out.println("两个参数的构造方法");
        this.hp = hp;
    }

    public void showAddressInMemory() {
        System.out.println("打印this看到的虚拟地址：" + this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Hero garen = new Hero("提莫", 100);
        garen.setName("盖伦");
        System.out.println(garen.name);
        System.out.println("打印对象看到的虚拟地址：" + garen);
        garen.showAddressInMemory();


    }
}
