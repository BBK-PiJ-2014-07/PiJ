import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Sophie on 08/12/14.
 */
public class EchoClient {

    public void serverLink(){
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
            Echo e = (Echo) reg.lookup("echo");
            e.echo("Hello world!");

        } catch (RemoteException ex) {
            ex.printStackTrace();
        } catch (NotBoundException nbx) {
            nbx.printStackTrace();
        }
    }

    public static void main(String[] args){
        EchoClient ec = new EchoClient();
        ec.serverLink();
    }

}
