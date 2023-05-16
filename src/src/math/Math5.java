package math;

public class Math5 {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(Integer.toBinaryString(i));
        int j = 6;
        System.out.println(Integer.toBinaryString(j));
        System.out.println(i<<1);
        System.out.println(Integer.toBinaryString(i<<1));
        int c = -16;
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(c>>>1));
    }
}

