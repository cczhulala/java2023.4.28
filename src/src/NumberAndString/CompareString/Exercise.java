package NumberAndString.CompareString;

public class Exercise {

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
        String[] str = new String[100];
        String temp;
        for (int i = 0; i < str.length; i++) {
            str[i] = randomString(2);
            if ((i + 1) % 10 != 0) {
                System.out.print(str[i] + '\t');
            } else
                System.out.println(str[i]);
        }
        String reps = "";
        int k;
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            int flag = 0;
            k = i;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    k = j;
                    flag = 1;
                }
            }
            if (flag == 1) {
                sum++;
                reps += " " + str[k];
            }
        }

        System.out.printf("一共有%d种重复字符串\n", sum);
        if (sum != 0) {
            System.out.println("它们是:" + reps.trim());
        }
    }
}
