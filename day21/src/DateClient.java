import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Sophie on 08/12/14.
 */
public class DateClient {

    public void serverLink() {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
            DateGetter d = (DateGetter) reg.lookup("date");
            d.getDate();
        } catch (RemoteException ex) {
            ex.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args){
        DateClient dc = new DateClient();
        dc.serverLink();
    }
}
