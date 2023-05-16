package JieKo.Super;
import JieKo.Override.Item;

public class Hero {
    String name;
    float armor;
    float hp;
    int moveSpeed;

    public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }

//    public Hero(){
//        System.out.println("Hero的构造方法");
//    }
    public Hero(String name){
        System.out.println("Hero的有参数构造方法");
        this.name=name;
    }

    public static void main(String[] args) {
//        new Hero();
    }
}
