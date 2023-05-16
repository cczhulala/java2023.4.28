package NumberAndString.String;

public class TestString {
    public static void main(String[] args) {
        String garen = "盖伦";

        String teemo = new String("提莫");

        char[] cs = new char[]{'崔','斯','特'};

        String hero = new String(cs);

        String hero3 = hero + teemo + garen;
        System.out.println(hero.length());
    }
}
