package math;

public class Math4 {
    public static void main(String[] args) {
        int i = 2;
        System.out.println(i == 1 & i++ == 2);
        System.out.println(i);

        int j = 2;
//        &&才是短路与
        System.out.println(j == 1 && j++ == 2);
        System.out.println(j);

        int k = 2;
        System.out.println(k == 2 | k++ == 2);
        System.out.println(k);

        int l = 2;
//        ||才是短路或
        System.out.println(l == 2 || l++ == 2);
        System.out.println(l);

        boolean c = true;
        System.out.println(c);
        System.out.println(!c);

        boolean g = false;
        System.out.println(c^g);
        System.out.println(c^(!g));
    }
}
