package Array;

public class CopyArray {
    public static void main(String[] args) {
        int[] a = new int[]{18, 62, 68, 82, 65, 9};
        int[] b = new int[3];

        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }

        System.arraycopy(a, a.length - b.length, b, 0, b.length);
        for (int each : b) {
            System.out.println(each);
        }
        System.out.println("***********************************");
        int[] a1 = new int[(int) (Math.random() * 5 + 5)];
        int[] a2 = new int[(int) (Math.random() * 5 + 5)];
        int[] c = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < a2.length; i++) {
            a2[i] = (int) (Math.random() * 100);
        }
        System.out.println("数组a1的内容：");
        for (int i = 0; i < a1.length; i++) {
            if (i == a1.length - 1) {
                System.out.println(a1[i]);
                break;
            }
            System.out.print(a1[i] + " ");
        }
        System.out.println("数组a2的内容：");
        for (int i = 0; i < a2.length; i++) {
            if (i == a2.length - 1) {
                System.out.println(a2[i] + "\n");
                break;
            }
            System.out.print(a2[i] + " ");
        }

        System.arraycopy(a1, 0, c, 0, a1.length);
        System.arraycopy(a2, 0, c, a1.length, a2.length);
        System.out.println("数组c的内容");
        for (int each : c) {
            System.out.print(each + " ");
        }
    }
}
