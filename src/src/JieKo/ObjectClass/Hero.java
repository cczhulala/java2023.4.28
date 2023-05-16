package JieKo.ObjectClass;

public class Hero {
    public String name;
    protected float hp;

    public String toString(){
        return name;
    }
    public void finalize(){
        System.out.println("这个英雄正在被回收");
    }

    public static void main(String[] args) {

//        Hero h = new Hero();
//        h.name = "盖伦";
//        System.out.println(h.toString());
//        //直接打印对象就是打印该对象的toString()返回值
//        //如果没用重写，就是打印出虚拟地址
//        System.out.println(h);

//        Hero h;
//        for (int i = 0; i < 10000000; i++) {
//            //不断生成新的对象
//            //每创建一个对象，前一个对象，就没有引用指向了
//            //那些对象，就满足垃圾回收的条件
//            //当，垃圾堆积的比较多的时候，就会触发垃圾回收
//            //一旦这个对象被回收，它的finalize()方法就会被调用
//            //注意这个方法不是即刻调用的
//            new Hero();
        Hero h = new Hero();
        h.hp = 300;
        Hero g = new Hero();
        g.hp = 300;
        System.out.println(h.equals(g));
        System.out.println(h==g);
    }
}

