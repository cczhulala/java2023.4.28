package JieKo.FinalExercise;

public class Cat extends Animal implements pet{
    public String name;
    public void eat(){
        System.out.println(name+"吃东西");
    }
    public Cat(String name){
        super(4);
        this.name =name;
    }
    public Cat(){
        this(null);
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

    public static void main(String[] args) {
        Cat c = new Cat("pet");
        c.play();
        c.eat();
        c.setName("cool");
        c.play();
    }
}
