package Control;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println("i:" + i);
        }
        int j = 1;
        while (j < 101) {
            if (j % 3 == 0 || j % 5 == 0){
                j++;
                continue;
            }
            System.out.println("输出的数字为:" + j);
            j++;
        }
    }
}
