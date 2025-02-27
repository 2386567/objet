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
		//TO DO
		
		System.out.println("\nLes produits de l'entrepot apres ajout d'un produit");
		listeProd.listerProduits();
		
		//Appeler supprimerProduit() ici-bas
		//TO DO
				
		System.out.println("\nLes produits de l'entrep�t apres suppression d'un produit");
		listeProd.listerProduits();
		
		System.out.println("\nRecherche de produits");
		
		//Appeler rechercherPoduit() ic-bas
		//TO DO
		
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
	}

	public static void supprimerProduit(ListeProduits listeProd) {
		//TO DO
	}

	public static void rechercherPoduit(ListeProduits listeProd) {
		//TO DO
	}
}
