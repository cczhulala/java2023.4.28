package ClassAndObject.Enumeration;

public class Exercise {
    public static void main(String[] args) {
        for(HeroType type:HeroType.values()){
            switch(type){
                case TANK :
                    System.out.println("坦克");
                    break;
                case WARRIOR:
                    System.out.println("法师");
                    break;
                default:
                    System.out.println("Null");
            }
        }
    }
}
