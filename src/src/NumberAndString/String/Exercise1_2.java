package NumberAndString.String;

public class Exercise1_2 {
    public static String randomString(int number){
        char[] cs = new char[number];
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool+=(char)i;
        }
        for (short i = 'a'; i <='z'; i++) {
            pool+=(char)i;
        }
        for (short i = 'A'; i <= 'Z' ; i++) {
            pool+=(char)i;
        }
        for (int i = 0; i < cs.length; i++) {
            int r = (int)(Math.random()*pool.length());
            cs[i] = pool.charAt(r);
        }
        String str = new String(cs);
        return str;
    }



    public static void main(String[] args) {
        char[] cs = new char[5];
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool+=(char)i;
        }
        for (short i = 'a'; i <='z'; i++) {
            pool+=(char)i;
        }
        for (short i = 'A'; i <= 'Z' ; i++) {
            pool+=(char)i;
        }
        for (int i = 0; i < cs.length; i++) {
            int r = (int)(Math.random()*pool.length());
            cs[i] = pool.charAt(r);
        }
        String str = new String(cs);
        System.out.println(str);
    }
}
