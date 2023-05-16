package NumberAndString.StringBuffer;

public class Exercise1 {

    public static String randomString(int number) {
        char[] cs = new char[number];
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
        for (int i = 0; i < cs.length; i++) {
            int r = (int) (Math.random() * pool.length());
            cs[i] = pool.charAt(r);
        }
        String str = new String(cs);
        return str;
    }

    public static void main(String[] args) {
        String str = "";
        long start_1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += "" + randomString(1);
        }
        long end_1 = System.currentTimeMillis();
        System.out.println(str);
        System.out.println(end_1 - start_1);
        String str1 = "";
        StringBuffer st = new StringBuffer(str1);
        long start_2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            st.append(randomString(1));
        }
        long end_2 = System.currentTimeMillis();
        System.out.println(st);
        System.out.println(end_2-start_2);

    }
}
