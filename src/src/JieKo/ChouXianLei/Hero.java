package JieKo.ChouXianLei;

public abstract class Hero {
    public abstract void attack();

    public static void main(String[] args) {
        //Hero h = new Hero();
        Hero h = new Hero(){
            public void attack(){
                System.out.println("aaa");
            }
        };
        h.attack();

        class SomeHero extends Hero{
            public void attack(){
                System.out.println("bbb");
            }
        }

        SomeHero s = new SomeHero();
        s.attack();
    }
}
