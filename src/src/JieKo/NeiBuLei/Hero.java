package JieKo.NeiBuLei;

public class Hero {
    private String name;

    float hp;
    float armor;
    int moveSpeed;

    private static void battleWin(){
        System.out.println("battle win");
    }
    static class EnemyCrystal{
        int hp = 5000;
        public void checkIfVictory(){
            if (hp==0){
                Hero.battleWin();
                //System.out.println(name+"win this game");
            }
        }
    }

    class BattleScore{
        int kill;
        int die;
        int assit;

        public void lengendary(){
            if(kill>=8){
                System.out.println(name+"超神");

            }
            else {
                System.out.println(name+"没有超神");
            }
        }
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        BattleScore score = garen.new BattleScore();
        score.kill = 9;
        score.lengendary();

        Hero.EnemyCrystal crystal = new Hero.EnemyCrystal();
        crystal.checkIfVictory();
    }
}
