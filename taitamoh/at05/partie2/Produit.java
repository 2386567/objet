package taitamoh.at05.partie2;

import java.util.Scanner;

/**
 * Cette classe contient les attributs et les m�thodes d'un produit
 *  
 */
public class Produit {
	private static final int MIN_CAR_DESCRIPTION = 2;
	private static final int MAX_CAR_DESCRIPTION = 250;
	private static final int MAX_PRIX = 20000;
	private static final int MAX_NUMERO = 100000;
	private static final int MIN_NUMERO = 0;;
	private int numero;
	private String description;
	private double prix;

	public Produit(int numero, String description, double prix) {
		setNumero(numero);
		setDescription(description);
		setPrix(prix);
	}

	public Produit() {
		this(0, "inconnu", 0);
	}

	private void setNumero(int numero) {
		if (numero > MIN_NUMERO && numero <= MAX_NUMERO) {
			this.numero = numero;
		}
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if (description.length() <= MAX_CAR_DESCRIPTION && description.length() >= MAX_CAR_DESCRIPTION) {
			this.description = description;
		}
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public int getNumero() {
		return numero;
	}

	public void setPrix(double prix) {
		if (prix > 0 && prix < MAX_PRIX) {
			this.prix = prix;
		}
	}

	public void appliquerRabais(double pourcentage) {
		setPrix(prix - (pourcentage / 100) * prix);
	}
	// Modification de l'atelier 4
	@Override
	public String toString() {
		return "Numero: " + numero + "\nDescription: " 
	+ description + "\nPrix: " + String.format("%.2f$", prix);
	}
	// Modification de l'atelier 4
	public double calculerPrixVente() {
		return getPrix();
	}

	/*
	 * Demande � lire un num�ro de produit � partir du clavier tant qu'il n'est pas
	 * valide. Elle affecte le num�ro valide � l'attribut numero.
	 */
	public void lireNumero(Scanner clavier) {
		boolean valide = false;
		int numeroLu;

		do {
			System.out.print("Entrez le num�ro du produit: ");
			numeroLu = clavier.nextInt();
			clavier.nextLine();
			if (numeroLu >= MIN_NUMERO && numeroLu <= MAX_NUMERO) {
				setNumero(numeroLu);
				valide = true;
			} else {
				System.out.println(
						"Le num�ro du produit doit contenir ente  " + MIN_NUMERO + "caract�res et " + MAX_NUMERO);
			}
		} while (!valide);
	}

	/*
	 * Demande � lire un prix de produit � partir du clavier tant qu'il n'est pas
	 * valide. Elle affecte le num�ro valide � l'attribut prix.
	 */
	public void lirePrix(Scanner clavier) {
		boolean valide = false;
		double prixLu;

		do {
			System.out.print("Entrez le prix du produit: ");
			prixLu = clavier.nextDouble();
			clavier.nextLine();
			// clavier.nextLine();
			if (prixLu >= 0 && prixLu <= MAX_PRIX) {
				setPrix(prixLu);
				valide = true;
			} else {
				System.out.println("Le prix du produit doit �tre entre 0 et  " + MAX_PRIX);
			}
		} while (!valide);
	}

	/*
	 * Demande � lire une description de produit � partir du clavier tant qu'il
	 * n'est pas valide. Elle affecte la description valide � l'attribut
	 * description.
	 */
	public void lireDescription(Scanner clavier) {
		boolean valide = false;
		String descriptionLue;

		do {
			System.out.print("Entrez la description du produit: ");
			descriptionLue = clavier.nextLine();
			if (descriptionLue.length() >= MIN_CAR_DESCRIPTION && descriptionLue.length() <= MAX_CAR_DESCRIPTION) {
				setDescription(descriptionLue);
				valide = true;
			} else {
				System.out.println("La description  du produit doit �tre entre " + MIN_CAR_DESCRIPTION
						+ "caract�res et " + MAX_CAR_DESCRIPTION);
			}
		} while (!valide);
	}
	
	//partie 2
	//Lire tous les renseignements du produit
	//Cette m�thode est red�finie dans les classes filles
	public void lireRenseignements(Scanner clavier) {
		System.out.println("Entrez les renseignements du produit");
		lireNumero(clavier);
		lireDescription(clavier);
		lirePrix(clavier);
	}
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		Produit prod1 = new Produit(1, "Stylo", 12.25);
		// tester toString()
		System.out.println(prod1);
		
	}
}
