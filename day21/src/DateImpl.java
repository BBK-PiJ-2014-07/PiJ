import java.util.Calendar;
import java.util.GregorianCalendar;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


/**
 * Created by Sophie on 08/12/14.
 */
public class DateImpl extends UnicastRemoteObject {
    protected DateImpl() throws RemoteException {
    }

    public String getDate(){
        Calendar cal = new GregorianCalendar();
        int year = cal.YEAR;
        int month = cal.MONTH;
        int day = cal.DAY_OF_MONTH;
        String date = String.valueOf(year + month + day);
        return date;
    }
}
