package NumberAndString.CompareString;

import java.util.Locale;

public class TestString {


    public static void main(String[] args) {
        String str1 = "the light";
        String str2 = new String(str1);
        System.out.println(str1 == str2);
        System.out.println(str2);
        String str3 = "the light";
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
        str3 = str3.toUpperCase();
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str3));

        String start = "the";
        String end = "Ight";
        System.out.println(str1.startsWith(start));
        System.out.println(str1.endsWith(end));


    }
}
