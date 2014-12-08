import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * Created by Sophie on 08/12/14.
 */
public interface Date extends Remote {

    public String getDate() throws RemoteException;
}
