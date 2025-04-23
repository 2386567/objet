package taitamoh.at05.partie2;

/**
 * Cette classe contient les attributs et les m�thodes d'une liste de produits
 * 
 */
public class ListeProduits {

	private Produit tabProduits[];
	private int nbProduits;

	public ListeProduits(int maxProduits) {
		tabProduits = new Produit[maxProduits];
		nbProduits = 0;

	}

	// Retourne le nombre de produits dans le tableau
	public int taille() {
		return nbProduits;
	}

	// Retourne true si le tableau de produits est vide, false sinon
	public boolean estVide() {
		return nbProduits == 0;
	}

	// Retourne true si le tableau de produits est plein, false sinon
	public boolean estPlein() {
		return nbProduits == tabProduits.length;
	}

	// retourne le produit dont l'indice est donn� en param�tre.
	public Produit obtenirProduit(int indice) {
		Produit produit = null;
		if (indice >= 0 && indice < nbProduits) {
			produit = tabProduits[indice];
		}
		return produit;

	}

	/*
	 * Ajoute le produit re�u en param�tre dans le tableau de produits. Elle
	 * retourne true si le produit est ajout� dans le tablaus, false sinon.
	 */
	public boolean ajouter(Produit produitAjouter) {
		boolean insertionOk = false;
		if (!estPlein()) {
			tabProduits[nbProduits] = produitAjouter;
			nbProduits++; // un produit de plus
			insertionOk = true;
		}
		return insertionOk;
	}

	/*
	 * Affiche le contenu du tableau des produits. .
	 */
	public void listerProduits() {
		if (!this.estVide()) {
			for (int i = 0; i < nbProduits; i++) {
				System.out.println(tabProduits[i].toString());
			}
		}

	}

	/*
	 * Retourne l'indice du produit dont le num�ro est donn� en param�tre dans le
	 * tableau des produits. Elle retourne -1 si le produit n'existe pas
	 */
	public int trouverProduit(int numeroAchercher) {
		int indice = -1;
		int pos = 0;
		boolean trouve = false;

		while (!trouve && pos < nbProduits) {
			if (tabProduits[pos].getNumero() == numeroAchercher) {
				trouve = true;
			} else {
				pos++;
			}
		}
		if (trouve) {
			indice = pos;
		}

		return indice;
	}

	/*
	 * Elle supprime le produit dont le num�ro est donn� en param�tre. Elle retourne
	 * true si le produit a �t� supprim�, false sinon.
	 */
	public boolean supprimer(int numeroAsupprimer) {
		boolean suppressionOk = false;
		int indice;
		if (!estVide()) {
			indice = trouverProduit(numeroAsupprimer);
			if (indice != -1) {
				// d�caler le contenu des cases vers la gauche
				for (int i = indice + 1; i < nbProduits; i++) {
					tabProduits[i - 1] = tabProduits[i];
				}
				// un produit  de moins
				nbProduits--;
				tabProduits[nbProduits] = null;
				suppressionOk = true;
			}

		}
		return suppressionOk;

	}

// Pour tester les m�thode de cette classe
	public static void main(String[] args) {
		ListeProduits liste = new ListeProduits(10);
		Produit prod1 = new Produit(100, "Chaise", 200);
		Produit prod2 = new Produit(200, "table", 500);
		liste.ajouter(prod1);
		liste.ajouter(prod2);
		liste.listerProduits();
		System.out.println(liste.trouverProduit(300));
		liste.supprimer(100);
		System.out.println("apr�s suppression de 100");
		liste.listerProduits();
		

	}

}
