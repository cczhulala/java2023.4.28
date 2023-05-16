package NumberAndString.StringBuffer;

public class TestString {
    public static void main(String[] args) {
        String str1 = "let there";
        StringBuffer sb = new StringBuffer(str1);
        System.out.println(sb.capacity());
        sb.append("be light");
        System.out.println(sb);
        sb.delete(4,10);
        System.out.println(sb);
        sb.insert(4,"there ");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
