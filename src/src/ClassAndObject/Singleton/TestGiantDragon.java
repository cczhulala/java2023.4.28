package ClassAndObject.Singleton;
//饿汉单例模式，无论如何都会创建一个实例
public class TestGiantDragon {
    public static void main(String[] args) {
       // GiantDragon g1 = new GiantDragon();
        GiantDragon g1 = GiantDragon.getInstance();
        GiantDragon g2 = GiantDragon.getInstance();
        //其实是同一个对象
        System.out.println(g1);
        System.out.println(g2);
    }
}
