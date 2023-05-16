package ClassAndObject.Inital;

public class Test {
    public String name = "some hero";

    public Test(){
        name = "one hero";
    }
    {
        name = "the hero";
    }
    //构造方法最后执行，其余两个要看前后顺序如何
    //如果是静态属性，那么，静态初始化块先于声明
    public static void main(String[] args) {
        Test ab = new Test();
        System.out.println(ab.name);
    }
}
