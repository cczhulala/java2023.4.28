package NumberAndString.OperateString;

import java.util.Arrays;

public class TestString {
    public static void main(String[] args) {
        String sentence = " sdasdas113 ";
        char c = sentence.charAt(0);
        System.out.println(c);

        char[] cs = sentence.toCharArray();
        System.out.println(sentence.length()==cs.length);
        String subString1 = sentence.substring(3);
        System.out.println(subString1);
        String subString2 = sentence.substring(3,5);
        System.out.println(subString2);

        String subsentence3[] = sentence.split("a");
        System.out.println(Arrays.toString(subsentence3));
        System.out.println(sentence.trim());

        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());

        System.out.println(sentence.indexOf('a'));
        System.out.println(sentence.indexOf("da"));
        System.out.println(sentence.lastIndexOf('a'));
        System.out.println(sentence.indexOf('a',5));
        System.out.println(sentence.contains("da"));

        String temp = sentence.replaceAll("a","c");
        temp = temp.replaceAll("d","u");
        System.out.println(temp);
        temp = temp.replaceFirst("c","Q");
        System.out.println(temp);
    }
}
