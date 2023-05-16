package Control;

public class For {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("while输出的i：" + i);
            i++;
        }
        for (int j = 0; j < 5; j++) {
            System.out.println("for输出的i：" + j);
        }
        int sum = 0;
        int money = 1;
        for(int k=1;k<11;k++){
            sum = sum + money;
            money = money * 2;
        }
        System.out.println("乞丐的总收入为："+sum);
    }
}
