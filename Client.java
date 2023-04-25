package tp5_1;

import java.rmi.*;
import java.util.ArrayList;

import java.util.*;

import Produit.Produit;
import tp5.ServerInterface;


public class Client {
	
	public static void main(String argv[]) {
		int operation;
		int continuer=0;
		try {
			ServerInterface objet = (ServerInterface) Naming.lookup("rmi://localhost:2048/Obj");
			objet.enregistrer_client(new ClientImplementation());
			
            
            while(continuer!=1) {
            	System.out.print("veillez choisir l'operation:\n");
    			System.out.print("1-ajouter un produit \n2-afficher la liste des produits \n"
    					+ "3-retirer une quantite d'un produit \n4-ajouter une quantite a un produit\n"
    					+ "5-consulter la quantite d'un produit 6-quitter. ");
            	Scanner sc=new Scanner(System.in); 
    			operation = sc.nextInt();
			 switch(operation) {
			 case 1:					
				 	System.out.println("--------------------------" );
					System.out.println("entrez le nom du produit  " );
                    sc.nextLine();
					String nom = sc.nextLine();
					
					System.out.println("entrez la quantite du produit  " );
					
					int q =Integer.parseInt(sc.nextLine()) ;
					objet.Ajouter_produit(nom,q);
					System.out.println("--------------------------" );
					break;

			 case 2:
				 System.out.println("--------------------------" );
				 ArrayList<Produit> produit = objet.Liste_produits();
					for(Produit product:produit) {
						System.out.println("Le produit : " + product.getNom()+" sa quantite : "+product.getQuantite());
					}
					System.out.println("--------------------------" );
					break;
			 case 3 :
				 System.out.println("--------------------------" );
				 System.out.println("entrez le nom du produit  " );
                 sc.nextLine();

					String nom1 = sc.nextLine();
					System.out.println("entrez la quantite que vous voulez retirer " );
					int q1 = sc.nextInt();
					objet.modifier_quantite(nom1,q1);
					System.out.println("--------------------------" );
					break;
					
			 case 4:
				 System.out.println("--------------------------" );
				 System.out.println("entrez le nom du produit  " );
                 sc.nextLine();

					String nom2 = sc.nextLine();
					System.out.println("entrez la quantite que vous voulez ajouter " );
					int q2 = sc.nextInt();
					objet.modifier_quantite(nom2,q2);
					System.out.println("--------------------------" );
					break;
			 case 5:
				 System.out.println("--------------------------" );
				 System.out.println("entrez le nom du produit  " );
				 
                 sc.nextLine();

					String nom3 = sc.nextLine();
					System.out.print("la quantite du produit"+nom3+" est :" + objet.quantite_produit(nom3));
					System.out.println("--------------------------" );
					break;
			 case 6:
				 continuer=1;
				 break;
				 default:
					 break;
					 
			 }}}
           
		
		catch (Exception e) {
	    	e.printStackTrace();
	}
		
	}}


