import java.rmi.RemoteException;

/**
 * Created by Sophie on 08/12/14.
 */
public class EchoImpl implements Echo {
    public EchoImpl() throws RemoteException {

    }

    public String echo(String s) {
        System.out.println("Echo \'" + s + "\'");
        return s;
    }
}
