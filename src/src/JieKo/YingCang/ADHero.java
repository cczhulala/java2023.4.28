package JieKo.YingCang;

public class ADHero extends Hero implements AD{
    @Override
    public void physicAttack(){
        System.out.println("进行了AD攻击");
    }
    public static void battleWin(){
        System.out.println("AD Win");
    }

    public static void main(String[] args) {
        Hero.battleWin();
        ADHero.battleWin();

        Hero h = new ADHero();
        h.battleWin();
        //调用父类的类方法，因为是类方法
        // 类的方法无论怎样使用都是它该类的方法，不可能是对象所在类的方法
    }

}
