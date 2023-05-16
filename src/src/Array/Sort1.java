package Array;

public class Sort1 {
    public static void main(String[] args) {
        int a[] = new int[]{18,62,68,82,65,9};
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]+" ");
        }
        System.out.println(" ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j <a.length ; j++) {
                if (a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
    }
}
