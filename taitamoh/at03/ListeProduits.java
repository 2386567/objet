package taitamoh.at03;

import java.util.List;
import java.util.Scanner;

public class ListeProduits {
	private Produit[] tabProduits;
	private int nbProduits;

   //Constructeur
	public ListeProduits(int maxProduits) {	
		//initialiser le tableau tabProduits  avec un nombre de cases egal a  maxProduits.
		// TO DO
	    tabProduits=new Produit[maxProduits];
	
		
		//Initialiser nbProduits a zero (aucun produit lors de l'instanciation)
		// TO DO
		nbProduits=0;
	}

	// Retourne le nombre de produits dans le tableau
	public int taille() {
		// TO DO
		return nbProduits;
	}

	// Retourne true si le tableau de produits est vide(nbProduits = 0), false sinon
	public boolean estVide() {
		// TO DO
		return nbProduits==0;
	}

	// Retourne true si le tableau de produits est plein (nbProduits egale la taille du tableau),
	// false sinon
	public boolean estPlein() {
		// TO DO
		
	
		return nbProduits ==tabProduits.length ;
	}

	// retourne le produit dont l'indice est donne en parametre.
	/**cette méthode retourne le produit correspondant
	 * à l'indice donné en paramètre
	 * @param indice donné en paramètre
	 * @return le produit de l'indice
	 */
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
			tabProduits[nbProduits]=nouveauProduit;
			// Incrementer le nombre de produits(nbProduits)
			// TO DO
			nbProduits++;
			insertionOk= true;
			
		}
		return insertionOk;
	}

	/*
	 * Affiche le contenu du tableau des produits. .
	 */
	public void listerProduits() {
		if (!estVide()) {
			// parcourir le tableau tabProduits pour afficher ses elements. 
			for (int i = 0; i < tabProduits.length; i++) {
				if(tabProduits[i] != null){
                   System.out.println(tabProduits[i].toString());
				}
			}
			// Appeler toString() de la classe Produit
			//TO DO
		}
	}

	/*
	 * Retourne l'indice du produit dont le numero est donne en parametre dans le
	 * tableau des produits. Elle retourne -1 si le produit n'existe pas
	 */
	public int trouverProduit(int numeroAChercher) {
		int trouverProduit=-1;
		for (int j = 0; j < tabProduits.length; j++) {
		if (tabProduits[j] != null && tabProduits[j].getNumero() == numeroAChercher ){
			trouverProduit=j;
			
	
	}
}
		return trouverProduit;
	}

	/*
	 * elle supprime le produit dont le numero est donne en parametre. Elle retourne
	 * true si le produit a ete supprime, false sinon.
	 */
	public boolean supprimer(int numeroASupprimer) {
		boolean tab=false;
		int indice=0;
		
        if (estVide()) {
		System.out.println("La liste est vide");
		tab = false;
		}else {
		indice=trouverProduit(numeroASupprimer);
		if (indice == -1) {
			tab = false;
			}else{

			
		for (int i = indice + 1; i < nbProduits; i++) {
			tabProduits[i - 1] = tabProduits[i];
			}
		
		tabProduits[nbProduits-1]=null;
			nbProduits--;
			tab = true;
	}
}
			return tab;
	}
	
	
// pour tester les methode de cette classe
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		Produit prod1 = new Produit(100, "Chaise", 200);
		Produit prod2 = new Produit(200, "table", 500);
		Produit prod3 = new Produit(300, "Armoire", 1000);
		int indice;
		// Creer une liste de produits  de 10 elements nommee liste. 
		// Appelez le constructeur de ListeProduits() avec le bon parametre. 
		//TO DO
		ListeProduits liste = new ListeProduits(10);
		//Ajouter prod1, prod2 et prod3  a cette liste. Appeler liste.ajouter() pour ajouter chaque produit
		//TO DO
		liste.ajouter(prod1);
		liste.ajouter(prod2);
		liste.ajouter(prod3);
		//Afficher les produits de cette liste. Appeler liste.listerProduits()
		//TO DO
		System.out.println("La liste des produitsS");
		liste.listerProduits();
		//Rechercher l'indice du produit de numero 200 et l'afficher.
		// Appeler liste.trouverProduit()
		//TO DO
		 indice = liste.trouverProduit(200);
		System.out.println("L'indice du produit de numero 200: " + indice);
		//Rechercher l'indice du produit de numero 400 et l'afficher(doit donner -1). 
		// Appeler liste.trouverProduit()
		//TO DO
		indice = liste.trouverProduit(400); 
		System.out.println("L'indice du produit de numero 400 inexistant: " + indice);
		
		//Supprimer le produit de numero 100, puis afficher la liste apres suppression.
		// Appeler liste.supprimer() puis liste.listerProduits()
		//TO DO
		System.out.println("Supprimer le produit de numero 100: ");
		liste.supprimer(100);
		System.out.println("Listes produits après suppression");
		liste.listerProduits();
		
	}

}
