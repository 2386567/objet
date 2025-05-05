package taitamoh.at05Partie2.at05;

import java.util.Scanner;

public class GestionEntrepot {
	public static Scanner clavier = new Scanner(System.in);
	private static final  char PRODUIT_BASE = 'B';
	private static final  char PRODUIT_TAXABLE = 'T';
	private static final  char PRODUIT_TPS = 'S';
	private static final String MESSAGE_TAB_PLEIN = "Le nombre maximum de produits est atteint.";
	
	public static void main(String[] args) {

		// creer un entrepot de 10 produits
		ListeProduits listeProd = new ListeProduits(4); // 10 produit maximum
		System.out.println("\n*****Initialise l'entrepot****");
		// Appelez initialiser entrepot
		initialiserEntrepot(listeProd);
		System.out.println("\n****Les produits de l'entrpot****");
		afficherProduits(listeProd);
		
		//ajouter des produits
		System.out.println("\n****Ajout d'un produit****");
		ajouterProduit(listeProd);

		System.out.println("\n****Les produits de l'entrepot\n****");
		afficherProduits(listeProd);
		
		//Appliquer un rabais de 10% sur les livres 
		appliquerRabaisLivre(listeProd, 10);
		afficherProduits(listeProd);
	}

	/*
	 * Ajouter 3 produits dans l'entrepot de types differents
	 */
	public static void initialiserEntrepot(ListeProduits listeProd) {
		listeProd.ajouter(new ProduitBase(1, "Boite de 1 litre lait en carton Quebon 2%", 3.25, "Lait"));
		listeProd.ajouter(new ProduitTaxableTPS(2, "Comment gerer son stress", 15.75, 'l'));
		listeProd.ajouter(new ProduitTaxable(3, "Tapis de souris Confort", 15.75));
		
	}

	public static void ajouterProduit(ListeProduits listeProd) {
	
		boolean codeValide = false;
		char codeLu;
		char reponse = 'N';
		Produit produit = null;
		if (listeProd.estPlein()) {
			System.out.println(MESSAGE_TAB_PLEIN);
		} else { // creer un Produit en fonction du type produit choisi
			do { // autre produit
				do { // valider choix menu
					System.out.println(
							"Codes des produits: \nB: produit de Base "
									+ "\nT: produit taxable \nS: produit taxable TPS ");
					System.out.print("Entrez le code:  ");
					codeLu = clavier.next().charAt(0);
					codeLu = Character.toUpperCase(codeLu);
					switch (codeLu) {
					case PRODUIT_BASE:
						produit = new ProduitBase();
						codeValide = true;
						break;
					case PRODUIT_TPS:
						produit = new ProduitTaxableTPS();
						codeValide = true;
						break;

					case PRODUIT_TAXABLE:
						produit = new ProduitTaxable();
						codeValide = true;
						break;
					default:
						produit = null;
						System.out.println("Choix invalide");
					}
				} while (!codeValide);
				// Polymorphisme: appelle la methode de la bonne classe.
				produit.lireRenseignements(clavier);
				if (listeProd.ajouter(produit)) {
					System.out.println("Le produit a ete ajoute avec succes");

				} else {
					System.out.println("Echec d'ajout du produit");
				}

				if (listeProd.estPlein()) {
					System.out.println(MESSAGE_TAB_PLEIN);
					reponse = 'N'; // pour quitter la boucle 
				} else {
					System.out.print("\nVoulez-vous saisir un autre produit? ");
					reponse = clavier.next().toUpperCase().charAt(0);
				}
			

			} while (reponse == 'O');
		

		} // else

	}


	public static void supprimerProduit(ListeProduits listeProd) {
		int numero;
		System.out.println("Entrez le numero du produit a supprimer:");
		numero = clavier.nextInt();
		if (listeProd.supprimer(numero)) {
			System.out.println("Le produit a ete supprime");
		} else {
			System.out.println("Le produit est introuvable");
		}
	}

	public static void rechercherPoduit(ListeProduits listeProd) {
		int numero, indiceTrouve;
		Produit produit;
		System.out.println("Entrez le numero du produit � rechercher:");
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

	public static void afficherProduits(ListeProduits listeProd) {
		if (listeProd.estVide()) {
			System.out.println("Aucun produit a afficher.");

		} else {
			listeProd.listerProduits();
		}
	}

	public static void appliquerRabaisLivre(ListeProduits listeProd, double taux) {
		for (int i = 0; i < listeProd.taille(); i++) {
			if (listeProd.obtenirProduit(i) instanceof ProduitTaxableTPS) {
				ProduitTaxableTPS produitTps = (ProduitTaxableTPS) listeProd.obtenirProduit(i);
				if (produitTps.getType() == 'l') {
					produitTps.appliquerRabais(taux);
				}
			}
		}
	}

}
