package math;
import java.util.Scanner;

public class Math2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("输入的数字是："+a+"\n"+"i++的数字是："+a++);
        System.out.println("输入的数字是："+a+"\n"+"++i的数字是："+(++a));
        int i = 1;
        int j = ++i + i++ + ++i + ++i + i++;
        System.out.println(j);
    }
}
