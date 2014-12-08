import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * Created by Sophie on 08/12/14.
 */
public interface DateGetter extends Remote {

    public void getDate() throws RemoteException;
}
