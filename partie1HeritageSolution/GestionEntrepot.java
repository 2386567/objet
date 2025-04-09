package enseignant.at04.partie1;

import java.util.Scanner;

public class GestionEntrepot {
	public static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		// creer un entrepot de 10 produits
		ListeProduits listeProd = new ListeProduits(100); // 10 produit maximum
		System.out.println("*****Initialise l'entrepot****");
		// Appelez initialiser entrepot
		initialiserEntrepot(listeProd);
		System.out.println("\n****Les produits de l'entrpot****");
		listeProd.listerProduits();
		/*
		 * System.out.println(" \n****Ajout d'un produit****");
		 * ajouterProduit(listeProd);
		 * System.out.println("\n****Les produits de l'entrep�t****");
		 * listeProd.listerProduits();
		 * System.out.println("\n****Supprimer un produit****");
		 * supprimerProduit(listeProd);
		 * System.out.println("Les produits de l'entrep�t"); listeProd.listerProduits();
		 * System.out.println("\n****Recherche de produits****");
		 * rechercherPoduit(listeProd);
		 */
	}

	/*
	 * Ajouter 3 produits  dans l'entrep�t de types diff�rents
	 */
	public static void initialiserEntrepot(ListeProduits listeProd) {
		listeProd.ajouter(new ProduitBase(1, "Boite de 1 litre lait en carton Quebon 2%", 3.25, "Lait"));
		listeProd.ajouter(new ProduitTaxableTPS(2, "Comment gerer son stress", 15.75, 'l'));
		listeProd.ajouter(new ProduitTaxable(3, "Tapis de souris Confort", 15.75));
	}

	public static void ajouterProduit(ListeProduits listeProd) {
		Produit prod = new Produit();
		prod.lireNumero(clavier);
		prod.lireDescription(clavier);
		prod.lirePrix(clavier);
		if (listeProd.ajouter(prod)) {
			System.out.println("Le produit a �t� ajout�");
		} else {
			System.out.println("Le produit n'a pas pu �tre ajout�");
		}

	}

	public static void supprimerProduit(ListeProduits listeProd) {
		int numero;
		System.out.println("Entrez le num�ro du produit � supprimer:");
		numero = clavier.nextInt();
		if (listeProd.supprimer(numero)) {
			System.out.println("Le produit a �t� supprim�");
		} else {
			System.out.println("Le produit est introuvable");
		}
	}

	public static void rechercherPoduit(ListeProduits listeProd) {
		int numero, indiceTrouve;
		Produit produit;
		System.out.println("Entrez le num�ro du produit � rechercher:");
		numero = clavier.nextInt();
		indiceTrouve = listeProd.trouverProduit(numero);
		if (indiceTrouve == -1) {
			System.out.print("Le produit est introuvale");
		} else {
			produit = listeProd.obtenirProduit(indiceTrouve);
			System.out.print("Voici le produit que vous cherchez:");
			System.out.println(produit.toString());
		}
	}
}
