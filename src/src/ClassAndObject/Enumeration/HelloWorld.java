package ClassAndObject.Enumeration;

public class HelloWorld {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        switch(season){
            case SPRING:
                System.out.println("春天");
                break;
            default:
                System.out.println("Null");
        }
    }
}
