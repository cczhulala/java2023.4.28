package ClassAndObject.GenerateMethod;

public class Hero1 {
    String name;
    int hp;
    public Hero1(String heroname){
        name = heroname;
    }

    //构造方法的重载
    public Hero1(String heroname,int num){
        name = heroname;
        hp = num;
    }

    public static void main(String[] args) {
        Hero1 h = new Hero1("提莫");
        // Hero1 h1 = new Hero1();
        //无参的构造方法不能用了
        Hero1 h1 = new Hero1("盖伦",350);
    }
}
