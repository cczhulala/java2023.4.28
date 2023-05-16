package Control;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入身高(m)：");
        float high = s.nextFloat();
        System.out.println("请输入体重(kg)：");
        float weight = s.nextFloat();
        float bmi = weight/(high*high);
        System.out.println("当前的BMI是："+bmi);
        String str;
        if(bmi<18){
            str = "体重过轻";
        }else if (bmi<24&&bmi>=18.5){
            str = "正常范围";
        }else if(bmi<27&&bmi>=24){
            str = "体重过重";
        }else if(bmi<30&&bmi>=27){
            str = "轻度肥胖";
        }else if (bmi<35&&bmi>=30){
            str = "中度肥胖";
        }else {
            str = "重度肥胖";
        }
        System.out.println("当前身体状态是:"+str);
    }
}
