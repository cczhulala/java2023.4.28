package JieKo.FinalExercise;

public abstract class Animal {
    protected int legs;
    public Animal(int legs){
        this.legs = legs;
    }
    public abstract void eat();

    public void walk(){
        if(legs ==0){
            System.out.println(legs+"条腿，是水里游的");
        }else if (legs == 2 ){
            System.out.println(legs+"条腿，是地上走的和天上飞的");
        }else if(legs == 4 ){
            System.out.println(legs+"条腿，地上跑的还有爬的");
        }else {
            System.out.println("怪物");
        }
    }
}
