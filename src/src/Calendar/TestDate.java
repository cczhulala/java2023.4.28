package Calendar;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TestDate {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//        Date d1 = c.getTime();
//        System.out.println(d1);
//        Date d2 = new Date(0);
//        c.setTime(d2);
//        System.out.println(d2);
        Calendar c = Calendar.getInstance();
        Date now = c.getTime();
        System.out.println("当前日期：\t" + sdf.format(c.getTime()));

        c.setTime(now);
        c.add(Calendar.MONTH, 1);
        System.out.println("下个月的今天：\t" + sdf.format(c.getTime()));

        c.setTime(now);
        c.add(Calendar.YEAR, -1);
        System.out.println("去年的今天：\t" + sdf.format(c.getTime()));

        c.setTime(now);
        c.add(Calendar.MONTH,-1);
        c.add(Calendar.DATE,3);
        System.out.println("上个月的后推三天：\t"+sdf.format(c.getTime()));
    }
}
