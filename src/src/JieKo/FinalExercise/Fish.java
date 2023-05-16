package JieKo.FinalExercise;

public class Fish extends Animal implements pet{
    private String name;
    public void eat(){
        System.out.println("鱼在吃");
    }
    public void walk(){
        System.out.println("鱼不能走并且腿个数为："+legs);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void play(){
        System.out.println(name+"在玩");
    }
    public Fish(){
        super(0);
    }

    public static void main(String[] args) {
        Fish f = new Fish();
        f.setName("Fish");
        f.play();
    }
}
