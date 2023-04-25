package tp5_1;

import java.rmi.Naming;
import java.util.ArrayList;

import Produit.Produit;
import tp5.ServerInterface;

public class Client1 {
	
public static void main(String argv[]) {
		
		try {
			ServerInterface objet = (ServerInterface) Naming.lookup("rmi://localhost:2048/Obj");
			objet.enregistrer_client(new ClientImplementation());
			//pour verifier si  tous les clients sont notifie a chaque modification
			
            
		}
		
		catch (Exception e) {
	    	e.printStackTrace();
	}
		
	}
	

}
