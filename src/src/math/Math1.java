package math;

import java.util.Scanner;

public class Math1 {
    public static void main(String[] args) {
        int i = 10;
        int j = 5;
        int a = i + j;
        int b = i - j;
        int c = i * j;
        int d = i / j;

        Scanner s = new Scanner(System.in);
        int a1 = s.nextInt();
        System.out.println("第一个整数：" + a1);
        int b1 = s.nextInt();
        System.out.println("第二个整数：" + b1);
        System.out.println("两个数字的和是：" + (a1 + b1));
        String no = s.nextLine();
        String str = s.nextLine();
        System.out.println("读取的字符串是：" + str);


    }
}
