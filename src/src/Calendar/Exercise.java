package Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class Exercise {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        Date d1 = c.getTime();
        System.out.println("今天是："+sdf.format(d1));
        c.setTime(d1);
        c.add(Calendar.MONTH,2);
        c.set(Calendar.DAY_OF_MONTH,1);
        c.add(Calendar.DATE,-3);
        System.out.println("下个月倒数第三天是："+sdf.format(c.getTime()));
    }
}
