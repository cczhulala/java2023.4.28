package math;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入身高(m)：");
        float a = s.nextFloat();
        System.out.println("请输入体重(kg)：");
        float b = s.nextFloat();
        System.out.println("当前的BMI是：" + b / (a * a));
    }
}
