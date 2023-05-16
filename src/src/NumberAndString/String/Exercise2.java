package NumberAndString.String;
import NumberAndString.String.Exercise1_2.*;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        String[] cs = new String[8];
        for (int i = 0; i < cs.length; i++) {
            cs[i] = Exercise1_2.randomString(5);
        }
        System.out.println("未排序前的数组：");
        System.out.println(Arrays.toString(cs));

        for (int i = 0; i < cs.length-1; i++) {
            for (int j = i+1; j <cs.length ; j++) {
                char firstChar1 = cs[i].charAt(0);
                char firstChar2 = cs[j].charAt(0);

                firstChar1 = Character.toLowerCase(firstChar1);
                firstChar2 = Character.toLowerCase(firstChar2);

                if (firstChar1>firstChar2){
                    String temp = cs[i];
                    cs[i] = cs[j];
                    cs[j] = temp;
                }
            }
            System.out.println("排序过后的数组：");
            System.out.println(Arrays.toString(cs));
        }
    }
}
