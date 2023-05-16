package Date;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class TestDate2 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date d = new Date();
        String str = sdf.format(d);
        System.out.println(str);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf1.format(d));

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String str1 = "2016/1/5 12:12:12";
        try{
            Date d1 = sdf2.parse(str1);
            System.out.printf("%s变成了%s\n",str1,d1.toString());
        }catch(ParseException e){
            e.printStackTrace();
        }
    }
}
