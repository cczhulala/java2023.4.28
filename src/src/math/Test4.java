package math;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("今天是周几?");
        int day = s.nextInt();

        String k = day < 6 ? "今天是工作日" : "今天是周末";
        System.out.println(k);
    }
}
