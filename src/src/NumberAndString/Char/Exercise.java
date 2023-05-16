package NumberAndString.Char;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] cs = str.toCharArray();
        System.out.println(Arrays.toString(cs));
        for (char each:cs){
            if (Character.isDigit(each)||Character.isUpperCase(each))
                System.out.print(each);
        }

    }
}
