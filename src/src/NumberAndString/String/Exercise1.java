package NumberAndString.String;

public class Exercise1 {
    public static void main(String[] args) {
        char[] cs = new char[5];
        for (int i = 0; i < 5; i++) {
            int type = (int) (Math.random() * (3 - 1 + 1) + 1);
            switch (type) {
                case 1: {
                    cs[i] = (char) (int) (Math.random() * ('z' - 'a' + 1) + 'a');
                    break;
                }
                case 2: {
                    cs[i] = (char) (int) (Math.random() * ('Z' - 'A' + 1) + 'A');
                    break;
                }
                case 3: {
                    cs[i] = (char) (int) (Math.random() * ('9' - '0' + 1) + '0');
                    break;
                }
            }
        }
        String s = new String(cs);
        System.out.println(cs);
    }
}
