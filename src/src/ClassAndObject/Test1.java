package ClassAndObject;

public class Test1 extends Item{
    int damage; //攻击力
    public static void main(String[] args) {
        Test1 infinityEdge = new Test1();
        infinityEdge.damage = 65; //damage属性在类Test中新设计的

        infinityEdge.name = "无尽之刃";//name属性，是从Item中继承来的，就不需要重复设计了
        infinityEdge.price = 3600;

    }

}