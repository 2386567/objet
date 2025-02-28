package taitamoh.at03;

import java.util.Scanner;

public class GestionEntrepot {
	public static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		// creer un entrepot de 100 produits
		ListeProduits listeProd = new ListeProduits(100); // 100 produit maximum
		System.out.println("Initialiser l'entrep�t");
		initialiserEntrepot(listeProd);
		
		System.out.println("\nLes produits de l'entrep�t apr�s initialisation");		
		listeProd.listerProduits();
		
		System.out.println("\nAjout de produits");
		//Appeler ajouterProduit() ici-bas
		 ajouterProduit(listeProd);
		//TO DO
		
		System.out.println("\nLes produits de l'entrepot apres ajout d'un produit");
		listeProd.listerProduits();
		
		//Appeler supprimerProduit() ici-bas
		//TO DO
		supprimerProduit(listeProd);
				
		System.out.println("\nLes produits de l'entrep�t apres suppression d'un produit");
		listeProd.listerProduits();
		
		System.out.println("\nRecherche de produits");
		
		//Appeler rechercherPoduit() ic-bas
		//TO DO
		rechercherPoduit(listeProd);
		
	}

	/*
	 * Ajoute les 3 produits suivants dans l'entrep�t 
	 * 100: Table: 5000 
	 * 150: Chaise:60 
	 * 200: lit: 500
	 * 
	 */
	public static void initialiserEntrepot(ListeProduits listeProd) {
		//TO DO
	Produit prod1 = new Produit(100, "Table", 5000);
	Produit prod2 = new Produit(150, "Chaise", 60);
	Produit prod3 = new Produit(200, "lit", 500);
	listeProd.ajouter(prod1);
	listeProd.ajouter(prod2);
	listeProd.ajouter(prod3);
		
	}

	public static void ajouterProduit(ListeProduits listeProd) {
		//TO DO
		Produit prod = new Produit();
		prod.lireNumero(clavier);
		prod.lireDescription(clavier);
		prod.lirePrix(clavier);
		if (listeProd.ajouter(prod)) {
			System.out.println("Le produit a été ajouté");
		}else{
			System.out.println("Éche d'ajout du produit");
		}
		
	}

	public static void supprimerProduit(ListeProduits listeProd) {
		//TO DO
		int numero;
		boolean supprimer ;
		System.out.println("Entrez le numéro du produit à supprimer");
		numero = clavier.nextInt();
		clavier.nextLine();
	    supprimer = listeProd.supprimer(numero);
		if (supprimer) {
			System.out.println("Le produit a été supprimé");
		}else{
			System.out.println("Le produit est introuvable");
		}

	}

	public static void rechercherPoduit(ListeProduits listeProd) {
		//TO DO
        int numero;

		System.out.println("Entrez le numéro du produit à rechercher : ");
        numero=clavier.nextInt();
		numero = listeProd.trouverProduit(numero);
		if (numero!=-1) {
			Produit produitTrouve = listeProd.obtenirProduit(numero);
			System.out.println("Produit trouvé :  " );
			System.out.println(produitTrouve.toString());
		}else{
			System.out.println("Le produit est introuvable");
		}
	}
}
