package tp5_1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientInterface extends Remote {
	
	public void notification()throws RemoteException;

}
