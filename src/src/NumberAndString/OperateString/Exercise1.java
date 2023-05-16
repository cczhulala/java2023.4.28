package NumberAndString.OperateString;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        String sentence = "let there be light";
        System.out.println(sentence);
        String[] sub = sentence.split(" ");
        System.out.println(Arrays.toString(sub));
        String temp1 = sub[0].replaceAll("l","L");
        String temp2 = sub[1].replaceAll("t","T");
        String temp3 = sub[2].replaceAll("b","B");
        String temp4 = sub[3].replaceAll("l","L");
        String new_Sentence = temp1+" "+temp2+" "+temp3+" "+temp4;
        System.out.println(new_Sentence);
    }
}
