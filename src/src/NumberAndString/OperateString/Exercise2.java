package NumberAndString.OperateString;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        String sentence = "peter piper picked a peck of pickled peppers";
        String[] sub = sentence.split(" ");
        System.out.println(Arrays.toString(sub));
        int count = 0;
        for (int i = 0; i < sub.length; i++) {
            if (sub[i].contains("p"))
                if (sub[i].indexOf("p")==0)
                    count++;
        }
        System.out.println(count);


    }
}
