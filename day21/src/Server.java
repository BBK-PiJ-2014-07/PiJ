import java.rmi.*;
//import java.rmi.Naming;
//import java.rmi.RMISecurityManager;
//import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Sophie on 08/12/14.
 */
public class Server {
    public static void main(String[] args){
        Server srv = new Server();
        srv.launch();
    }

    public void launch(){
        /*if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }*/
        try {
            Registry reg = LocateRegistry.createRegistry(1099);
            reg.rebind("date", new DateImpl());
        } catch (RemoteException ex){
            ex.printStackTrace();
        }
    }
}
