package ClassAndObject.Enumeration;

public class Test {
    public static void main(String[] args) {
        int season = 5;
        switch (season) {
            case 1:
                System.out.println("春天");
                break;
            case 2:
                System.out.println("夏天");
                break;
            case 3:
                System.out.println("秋天");
                break;
            case 4:
                System.out.println("冬天");
                break;
        }
        for(Season s:Season.values()){
            System.out.println(s);
        }
    }
}
