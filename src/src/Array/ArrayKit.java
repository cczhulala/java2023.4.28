package Array;

import java.util.Arrays;

public class ArrayKit {
    public static void main(String[] args) {
        int[] a = new int[]{18, 62, 68, 82, 65, 9};
        int[] b = Arrays.copyOfRange(a,0,5);
        for(int each : b){
            System.out.println(each);
        }

        String content = Arrays.toString(a);
        System.out.println(content);

        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.binarySearch(a,68));
        System.out.println(Arrays.equals(a,b));
        Arrays.fill(a,5);
        System.out.println(Arrays.toString(a));

        int[][] two = new int[5][8];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                two[i][j] = (int)(Math.random()*100);
            }
        }
        int[] one = new int[40];
        for (int i = 0; i < 5; i++) {
            System.arraycopy(two[i],0,one,i*8,two[i].length);
        }
        Arrays.sort(one);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                two[i][j] = one[i*8+j];
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(two[i]));
        }
    }
}
