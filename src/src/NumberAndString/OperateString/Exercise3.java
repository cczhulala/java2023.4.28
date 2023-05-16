package NumberAndString.OperateString;

public class Exercise3 {
    public static void main(String[] args) {
        String sentence = "lengendary";
        char[] cs = sentence.toCharArray();
        cs[0] = Character.toUpperCase(cs[0]);
        cs[2] = 'N';
        cs[4] = 'E';
        cs[6] = 'D';
        cs[8] = 'R';
        String senten_new = new String(cs);
        System.out.println(senten_new);
    }
}
