package Array;

public class InitializeArray {
    public static void main(String[] args) {
        int[] a;
        a = new int[5];

        int[] b = new int[5];
        a[0] = 1;
        a[1] = 2;
        System.out.println(a.length);
        a[4] = 100;

        int[] c = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = (int) (Math.random()*100);
            System.out.println(a[i]);
        }
        int d = 0;
        for (int i = 0; i < 5; i++) {
            if (d<a[i])
                d=a[i];
        }
        System.out.println(d);
    }
}

