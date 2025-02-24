package taitamoh.at03;

import java.util.Scanner;

public class ListeProduits {
	private Produit[] tabProduits;
	private int nbProduits;

   //Constructeur
	public ListeProduits(int maxProduits) {	
		//initialiser le tableau tabProduits  avec un nombre de cases egal a  maxProduits.
		// TO DO
	
		
		//Initialiser nbProduits a zero (aucun produit lors de l'instanciation)
		// TO DO
		
	}

	// Retourne le nombre de produits dans le tableau
	public int taille() {
		// TO DO
		return 0;
	}

	// Retourne true si le tableau de produits est vide(nbProduits = 0), false sinon
	public boolean estVide() {
		// TO DO
		return false;
	}

	// Retourne true si le tableau de produits est plein (nbProduits egale la taille du tableau),
	// false sinon
	public boolean estPlein() {
		// TO DO
		return false;
	}

	// retourne le produit dont l'indice est donne en parametre.
	public Produit obtenirProduit(int indice) {
		Produit produit = null;
		if (indice >= 0 && indice < nbProduits) {
			produit = tabProduits[indice];
		}
		return produit;
	}

	/*
	 * Ajoute le produit fourni en parametre dans le tableau de produits. Elle
	 * retourne true si le produit est ajoute dans le tablaus, false sinon.
	 */
	public boolean ajouter(Produit nouveauProduit) {
		boolean insertionOk = false;
		if (!estPlein()) {
			// deposer nouveauProduit dans la case d'indice nbProduits du tableau tabProduits
			// TO DO
			
			insertionOk = true;
			// Incrementer le nombre de produits(nbProduits)
			// TO DO
			
		}
		return insertionOk;
	}

	/*
	 * Affiche le contenu du tableau des produits. .
	 */
	public void listerProduits() {
		if (!estVide()) {
			// parcourir le tableau tabProduits pour afficher ses elements. 
			// Appeler toString() de la classe Produit
			//TO DO
		}
	}

	/*
	 * Retourne l'indice du produit dont le numero est donne en parametre dans le
	 * tableau des produits. Elle retourne -1 si le produit n'existe pas
	 */
	public int trouverProduit(int numeroAChercher) {

		return 0;
	}

	/*
	 * elle supprime le produit dont le numero est donne en parametre. Elle retourne
	 * true si le produit a ete supprime, false sinon.
	 */
	public boolean supprimer(int numeroASupprimer) {

		return false;

	}

// pour tester les methode de cette classe
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		Produit prod1 = new Produit(100, "Chaise", 200);
		Produit prod2 = new Produit(200, "table", 500);
		Produit prod3 = new Produit(300, "Armoire", 1000);
		// Creer une liste de produits  de 10 elements nommee liste. 
		// Appelez le constructeur de ListeProduits() avec le bon parametre. 
		//TO DO
		
		//Ajouter prod1, prod2 et prod3  a cette liste. Appeler liste.ajouter() pour ajouter chaque produit
		//TO DO
		
		//Afficher les produits de cette liste. Appeler liste.listerProduits()
		//TO DO
		
			
		System.out.print("L'indice du produit de numero 200: ");
		//Rechercher l'indice du produit de numero 200 et l'afficher. 
		// Appeler liste.trouverProduit()
		//TO DO
		
		System.out.print("L'indice du produit de numero 400 inexistant: ");
		//Rechercher l'indice du produit de numero 400 et l'afficher(doit donner -1). 
		// Appeler liste.trouverProduit()
		//TO DO
		
		System.out.println("Supprimer le produit de numero 100: ");
		//Supprimer le produit de numero 100, puis afficher la liste apres suppression.
		// Appeler liste.supprimer() puis liste.listerProduits()
		//TO DO

	}

}
