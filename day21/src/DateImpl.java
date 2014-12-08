import java.util.Calendar;
import java.util.GregorianCalendar;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


/**
 * Created by Sophie on 08/12/14.
 */
public class DateImpl extends UnicastRemoteObject implements DateGetter{
    protected DateImpl() throws RemoteException {
    }

    public void getDate(){
        Calendar cal = new GregorianCalendar();
        int year = Calendar.getInstance().get(cal.YEAR);
        int month = Calendar.getInstance().get(cal.MONTH) + 1;
        int day = Calendar.getInstance().get(cal.DAY_OF_MONTH);
        System.out.println(day + "-" + month + "-" + year);
    }
}
