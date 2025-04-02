package taitamoh.at04.partie1;

import java.util.Scanner;

public class Produit {
	private static final int MIN_CAR_DESCRIPTION = 2;
	private static final int MAX_CAR_DESCRIPTION = 250;
	private static final int MAX_PRIX = 20000;
	private static final int MAX_NUMERO = 100000;
	private static final int MIN_NUMERO = 0;
	private int numero;
	private String description;
	private double prix;

	public Produit(int numero, String description, double prix) {
		setNumero(numero);
		setDescription(description);
		setPrix(prix);
	}

	public Produit() {
		this(0, "", 0);
	}

	private void setNumero(int numero) {
		if (numero >= MIN_NUMERO && numero <= MAX_NUMERO) {
			this.numero = numero;
		}
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if (description.length() <= MAX_CAR_DESCRIPTION &&
				description.length() >= MIN_CAR_DESCRIPTION) {
			this.description = description;
		}
	}

	public double getPrix() {
		return prix;
	}

	public int getNumero() {
		return numero;
	}

	public void setPrix(double prix) {
		if (prix > 0 && prix <= MAX_PRIX) {
			this.prix = prix;
		}
	}

	public double prixApresRabais(double pourcentage) {
		return prix - (pourcentage / 100) * prix;
	}

	@Override
	public String toString() {
		return "Numéro: " + numero + "\n" +
				"Description : " + description + "\n" +
				"Prix: " + String.format("%.2f", prix) + "$";
	}

	/*
	 * Demande à lire un numéro de produit à partir du clavier tant qu'il n'est pas
	 * valide.
	 * Elle affecte le numéro valide à l'attribut numero.
	 */
	public void lireNumero(Scanner clavier) {
		boolean valide = false;
		int numeroLu;

		do {
			System.out.print("Entrez le numéro du produit: ");
			numeroLu = clavier.nextInt();
			clavier.nextLine();
			if (numeroLu >= MIN_NUMERO && numeroLu <= MAX_NUMERO) {
				setNumero(numeroLu);
				valide = true;
			} else {
				System.out.println(
						"Le numéro du produit doit contenir ente  "
								+ MIN_NUMERO + "caractères et " + MAX_NUMERO);
			}
		} while (!valide);
	}

	/*
	 * Demande à lire un prix de produit à partir du clavier tant qu'il n'est pas
	 * valide.
	 * Elle affecte le numéro valide à l'attribut prix.
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
				System.out.println("Le prix du produit doit être entre 0 et  " + MAX_PRIX);
			}
		} while (!valide);
	}

	/*
	 * Demande à lire une description de produit à partir du clavier tant qu'il
	 * n'est pas valide.
	 * Elle affecte la description valide à l'attribut description.
	 */
	public void lireDescription(Scanner clavier) {
		boolean valide = false;
		String descriptionLue;

		do {
			System.out.print("Entrez la description du produit: ");
			descriptionLue = clavier.nextLine();
			if (descriptionLue.length() >= MIN_CAR_DESCRIPTION &&
					descriptionLue.length() <= MAX_CAR_DESCRIPTION) {
				setDescription(descriptionLue);
				valide = true;
			} else {
				System.out.println("La description  du produit doit être entre " +
						MIN_CAR_DESCRIPTION
						+ "caractères et " + MAX_CAR_DESCRIPTION);
			}
		} while (!valide);
	}

	public double calculerPrixVente() {
		return prix;
	}

	public void appliquerRabais(double pourcentage) {
		setPrix(prix - (pourcentage / 100) * prix);
	}

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		Produit prod1 = new Produit(1, "Stylo", 12.25);
		System.out.println(prod1);
		Produit prod2 = new Produit();
		prod2.lireNumero(clavier);

		prod2.lireDescription(clavier);
		prod2.lirePrix(clavier);

		System.out.println("Informations du poduit: " + prod2.toString());

	}
}
