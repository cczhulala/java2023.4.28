package JieKo.Super;

import JieKo.YingCang.AD;

public class ADHero extends Hero implements AD {
    @Override
    public void physicAttack(){
        System.out.println("进行物理攻击");
    }
    int moveSpeed =400;
    public ADHero(String name){
        super(name);
        System.out.println("AD Hero 的构造方法");
    }

//    public ADHero(String name){
//        super(name);
//        System.out.println("AD Hero 的构造方法");
//    }
//
//    由于作为子类，无论如何都会调用父类的构造方法。默认情况下，
//    会调用父类的无参的构造方法。但是，当父类没有无参构造方法的时候
//    (提供了有参构造方法，并且不显示提供无参构造方法)，
//    子类就会抛出异常，因为它尝试去调用父类的无参构造方法。
//    这个时候，子类应该必须通过super去调用父类声明的，存在的，
//    有参的构造方法。
    public int getMoveSpeed(){
        return this.moveSpeed;
    }
    public int getMoveSpeed2(){
        return super.moveSpeed;
    }

    public static void main(String[] args) {
        ADHero h =new ADHero("ss");
        System.out.println(h.getMoveSpeed());
        System.out.println(h.getMoveSpeed2());
    }
}
