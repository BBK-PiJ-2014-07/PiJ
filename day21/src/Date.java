import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Sophie on 08/12/14.
 */
public class Date {
    public String getDate(){
        Calendar cal = new GregorianCalendar();
        int year = cal.YEAR;
        int month = cal.MONTH;
        int day = cal.DAY_OF_MONTH;
        String date = String.valueOf(year + month + day);
        return date;
    }
}
