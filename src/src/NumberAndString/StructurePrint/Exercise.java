package NumberAndString.StructurePrint;
import java.util.Scanner;
public class Exercise {
    public static void main(String[] args){
        Scanner s  = new Scanner(System.in);
        System.out.println("请输入地名：");
        String local = s.nextLine();

        System.out.println("请输入金额：");
        int money = s.nextInt();
        System.out.format("%s,%d.%n",local,money);
    }
}
