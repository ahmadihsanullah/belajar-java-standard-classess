package programmer.zaman.now.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date date = new Date();
//        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 2023);
        calendar.add(Calendar.HOUR_OF_DAY, 10);
        calendar.add(Calendar.MONTH, Calendar.FEBRUARY);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
