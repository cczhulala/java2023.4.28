package JieKo.DuoTai.Exercise;

public class Hero {
    public String name;
    public int hp;

    public void kill(Mortal m){
        m.die();
    }
    public static void main(String[] args) {
        Hero garen = new Hero();
        ADHero ad = new ADHero();
        garen.kill(ad);
    }
}
