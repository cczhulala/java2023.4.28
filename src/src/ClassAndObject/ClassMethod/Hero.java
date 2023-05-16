package ClassAndObject.ClassMethod;

public class Hero {
    public String name;
    protected float hp;

    public void die(){
        hp = 0;
    }
    public static void battleWin(){
        System.out.println("battle win");
        //this.die();
//        静态方法属于类 不需要创建对象 就被分配了空间  也称为类方法
//        一开始就已经存在了 而实例方法属于类的对象  需要创建对象
//        才会分配空间 才能够使用 才会存在
//        所以静态方法内部不能 调用非静态方法
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.die();

        Hero teemo = new Hero();
        teemo.name = "提莫";

        Hero.battleWin();
        garen.battleWin();
    }
}
