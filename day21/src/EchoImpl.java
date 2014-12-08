import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Sophie on 08/12/14.
 */
public class EchoImpl extends UnicastRemoteObject implements Echo{
    public EchoImpl() throws RemoteException {

    }
    @Override
    public String echo(String s) {
        System.out.println("Echo \'" + s + "\'");
        return s;
    }

}
