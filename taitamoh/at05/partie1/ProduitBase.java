package taitamoh.at05.partie1;

import java.util.Scanner;

/**
 * Cette classe contient les attributs et les m�thodes d'un ProduitBase � Les
 * produits de base ne sont pas taxables. Exemples fruits et L�gumes, �ufs,
 * pains et c�r�ales, poissons, produits laitiers
 * 
 */
public class ProduitBase extends Produit {
	private static final int MIN_CAR_CATEGORIE = 2;
	private static final int MAX_CAR_CATEGORIE = 250;
	private String categorie;

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		if (categorie.length() <= MAX_CAR_CATEGORIE && categorie.length() >= MIN_CAR_CATEGORIE) {
			this.categorie = categorie;
		}

	}

	public ProduitBase(int numero, String description, double prix) {
		super(numero, description, prix);
		setCategorie(description);

	}

	@Override
	public String toString() {
		return super.toString() + "\nCategorie: " + categorie;
	}

	public void lireCategorie(Scanner clavier) {
		boolean valide = false;
		String categorieLue;

		do {
			System.out.println("Entrez la cat�gorie du produit de base, Exemple Fruits et l�gumes, viandes...");
			categorieLue = clavier.nextLine();
			if (categorieLue.length() >= MIN_CAR_CATEGORIE && categorieLue.length() <= MAX_CAR_CATEGORIE) {
				setCategorie(categorieLue);
				valide = true;
			} else {
				System.out.println("La description  du produit doit �tre entre " + MIN_CAR_CATEGORIE + "caract�res et "
						+ MAX_CAR_CATEGORIE);
			}
		} while (!valide);

	}

	// partie 2
	@Override
	public void lireRenseignements(Scanner clavier) {
		super.lireRenseignements(clavier);
		lireCategorie(clavier);
	}

	@Override
	public double calculerPrixVente() {
		return getPrix();
	}

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		ProduitBase prod1 = new Produit(3, "Boite de 1 litre lait en carton Quebon 2%", 3.25, "Lait");
		// tester toSring()
		System.out.println(prod1);
		// tester lireCategorie()
		ProduitBase prod2 = new ProduitBase();
		prod2.lireNumero(clavier);
		prod2.lireCategorie(clavier);
		System.out.println(prod2);
	}
}
