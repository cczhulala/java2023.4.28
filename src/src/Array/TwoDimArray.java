package Array;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] a = new int[2][3];
        a[1][2] = 5;
        int[][] b = new int[2][];
        b[0] = new int[3];
        b[0][2] = 5;

        int[][] c = new int[][]{
                {1,2,4},
                {4,5},
                {6,7,8,9}
        };

        int[][] two = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                two[i][j] = (int)(Math.random()*100);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(two[i][j]+"\t");
            }
//            if (i==4)
//                break;
            System.out.println();
        }

        int max = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (two[i][j]>max)
                    max=two[i][j];
                    x = i;
                    y = j;
            }
        }
        System.out.println("找出来的最大值是："+max);
        System.out.println("其坐标是["+x+"]["+y+"]");
    }
}
