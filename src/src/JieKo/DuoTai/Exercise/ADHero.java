package JieKo.DuoTai.Exercise;

public class ADHero extends Hero implements Mortal{
    public void physicAttack(){
        System.out.println("进行物理攻击");
    }
    public void die(){
        System.out.println("AD Die");
    }
}
