package math;

public class Test2 {
    public static void main(String[] args) {
        int i = 1;
        boolean b = !(i++ == 3) ^ (i++ ==2) && (i++==3);
        System.out.println(b);
        System.out.println(i);
    }
}
