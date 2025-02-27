package taitamoh.at03;

import java.util.Scanner;

import taitamoh.at01.produit;

public class Produit {
	// constantes de classe
	private static final int MIN_CAR_DESCRIPTION = 2;
	private static final int MAX_CAR_DESCRIPTION = 250;
	private static final int MAX_PRIX = 20000;
	private static final int MAX_NUMERO = 100000;
	private static final int MIN_NUMERO = 0;
	// attributs d'instance
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
		if (numero > MIN_NUMERO && numero <= MAX_NUMERO) {
			this.numero = numero;
		}
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if (description.length() <= MAX_CAR_DESCRIPTION && description.length() >= MIN_CAR_DESCRIPTION) {
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
		if (prix > 0 && prix < MAX_PRIX) {
			this.prix = prix;
		}
	}

	public String toString() {
		return String.format("%3d %-15s %.2f$", numero, description, prix);
	}

	/*
	 * Demande de lire un numero de produit a partir du clavier tant qu'il n'est pas
	 * valide. Elle affecte le numero valide a l'attribut numero.
	 */
	public void lireNumero(Scanner clavier) {
		boolean valide = false;
		int numeroLu;

		do {
			System.out.print("Entrez le numero du produit: ");
			numeroLu = clavier.nextInt();
			clavier.nextLine(); 
			// positionner le pointeur de lecture au debut de la ligne suivante

			if (numeroLu >= MIN_NUMERO && numeroLu <= MAX_NUMERO) {
				setNumero(numeroLu);
				valide = true;
			} else {
				System.out.println("Le num�ro du produit doit etre entre  " + MIN_NUMERO + " et " + MAX_NUMERO);
			}
		} while (!valide);
	}

	/*
	 * Demande de lire un prix de produit a partir du clavier tant qu'il n'est pas
	 * valide. Elle affecte le numero valide a l'attribut prix.
	 */
	public void lirePrix(Scanner clavier) {
		// TO DO
		boolean valide = false;
		float prixProduit;
		do {
			System.out.println("Entrez le prix du produit : ");
			if (clavier.hasNextFloat()) {
            prixProduit=clavier.nextFloat();
			clavier.nextLine();
			if (prixProduit < MAX_PRIX) {
				setPrix(prixProduit);
				valide = true;
			}else{
				System.out.println("Le prix du produit doit être entre 0 et " + MAX_PRIX);
			}
		}
	}while (!valide);
		
	}

	/*
	 * Demande de lire une description de produit a partir du clavier tant qu'il
	 * n'est pas valide. Elle affecte la description valide a l'attribut
	 * description.
	 */
	public void lireDescription(Scanner clavier) {
		// TO DO
		boolean valide = false;
		String description="";
		do {
			System.out.println("Entrez la description du produit : ");
			description = clavier.next();
			if (description.length()>=MIN_CAR_DESCRIPTION && description.length()<=MAX_CAR_DESCRIPTION) {
				setDescription(description);
				valide=true;
			}else{
                 System.out.println("La description du produit doit être ente " + MIN_CAR_DESCRIPTION + "et" + MAX_CAR_DESCRIPTION );  
			}
		} while (!valide);
	}
// la méthode main() pour tester les méthodes que vous avez ajoute
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		// creer un produit vide
		Produit prod = new Produit();
		
		// lire le numero du produit
		prod.lireNumero(clavier);
		// lire la description du produit.Appeler la methode lireDescription() 
		prod.lireDescription(clavier);
		// TO DO
		
		// lire le prix du produit. Appeler la methode lirePrix(()
		prod.lirePrix(clavier);
		
		// TO DO
		
		// Afficher les informations du produit. Appeler la methode toString()
		System.out.println(prod.toString());
		// TO DO

	}
}
