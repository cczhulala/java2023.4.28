package JieKo.FinalExercise;

public class Spider extends Animal{
    public void eat(){
        System.out.println("蜘蛛吃");
    }
    public Spider(int legs){
        super(legs);
    }
    public void walk(){
        super.walk();
    }

    public static void main(String[] args) {
        Spider s = new Spider(8);
        s.walk();
        s.eat();
    }
}
