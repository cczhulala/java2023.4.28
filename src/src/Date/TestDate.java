package Date;
import java.util.Date;

public class TestDate {
    public static void main(String[] args){
        Date d1 = new Date();
        System.out.println("当前时间：");
        System.out.println(d1);
        System.out.println();

        Date d2 = new Date(5000);
        System.out.println("从1970开始，过了5秒：");
        System.out.println(d2);
        System.out.println(d1.getTime());
        System.out.println(System.currentTimeMillis());
        System.out.println(d2.getTime());
    }
}
