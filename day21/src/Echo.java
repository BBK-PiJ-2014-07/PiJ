import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * Created by Sophie on 08/12/14.
 */
public interface Echo extends Remote {

    public String echo(String s) throws RemoteException;
}
