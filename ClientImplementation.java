package tp5_1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClientImplementation extends UnicastRemoteObject implements ClientInterface{
	
	protected ClientImplementation() throws RemoteException {
		
	}

	public void notification()throws RemoteException{
	 System.out.println("une modification a ete apporte");	
	}

}
