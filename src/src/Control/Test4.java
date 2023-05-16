package Control;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = s.nextInt();
        int i = 1;
        int sum = 1;
        while(i<=num){
            sum = sum*i;
            i++;
        }
        System.out.println("阶乘是:"+sum);
    }
}
