package NumberAndString.Char;

public class TestChar {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'b';
        //只能放一个字符
        // char c3 = 'ac';
        Character c = c1;
        char c3 = c;

        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isDigit('b'));
        System.out.println(Character.isWhitespace('a'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

        //'' 和""不一样，一个代表char，一个代表，String
        // String a = 'a';
        String a = Character.toString('a');
        System.out.println(a);
        System.out.println("a\\tb");
        System.out.println("a\tb\\");
    }
}
