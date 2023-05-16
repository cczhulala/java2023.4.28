package Array;

public class Sort2 {
    public static void main(String[] args) {
        int[] a = new int[]{18, 62, 68, 82, 65, 9};
        for (int each : a) {
            System.out.println(each + " ");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int each : a) {
            System.out.println(each + " ");
        }
    }
}
