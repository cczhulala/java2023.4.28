package Array;

public class InitializeArray2 {
    public static void main(String[] args) {
        int[] a = new int[]{10,20,30,40,50};
        int[] b = {10,20,30,40,50};
        //不能同时指定数组内容和长度

        int[] c = new int[5];
        for (int i = 0; i < 5; i++) {
            c[i] = (int) (Math.random()*100);
            System.out.println(c[i]);
        }
        int d = 0;
        for (int i = 0; i < 3; i++) {
            d = c[i];
            c[i] = c[4-i];
            c[4-i] = d;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(c[i]);
        }
    }
}
