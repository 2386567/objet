package taitamoh.at05.partie1;

import java.util.Scanner;

/**
 * Cette classe contient les attributs et les m�thodes d'un ProduitTaxableTPS �
 * Ce sont des produits sur lesquels on paie seulement la taxe TPS (d�tax�s de
 * TVQ). Exemples de produits : livres imprim�s et produits pour b�b�s (les
 * couches pour b�b�s, les biberons, les sacs jetables pour de biberons�).
 *
 */
public class ProduitTaxableTPS extends Produit implements Taxable {
	public static final double TPS = 0.05;
	private static final char LIVRE = 'l';
	private static final char BEBE = 'b';

	private char type;

	public ProduitTaxableTPS() {
		this(0, "inconnu", 0, '\u0000');

	}

	public ProduitTaxableTPS(int numero, String description, double prix, char type) {
		super(numero, description, prix);
		setType(type);

	}

	private void setType(char type) {
		if (type == LIVRE || type == BEBE | type == '\u0000') {
			this.type = type;
		}
	}

	public char getType() {
		return type;
	}

	@Override
	public double calculerPrixVente() {
		return getPrix() + calculerTaxes();
	}

	@Override
	public String toString() {
		// pour ne pas redefinir toStrin() dans la classe ProduitTaxable, on n'affiche
		// le type que s'il n'est pas un caractere null
		String typeAffiche = "";
		if (type != '\u0000') {
			typeAffiche = "\nType de produit: " + type;
		}
		return super.toString() + typeAffiche + "\nPrix incluant les taxes : "
				+ String.format("%.2f$", calculerPrixVente());
	}

	public void lireType(Scanner clavier) {
		boolean valide = false;
		char typeLu;

		do {
			System.out.println("Entrez le type du produit exon�r� de TVQ l pour livvre et b pour b�b�: ");
			typeLu = clavier.next().charAt(0);
			clavier.nextLine();
			// Convertir le caract�re lu en minuscule avec la m�thode statique toLowerCase()
			// de la classe Character
			typeLu = Character.toLowerCase(typeLu);
			if (typeLu == LIVRE || type == BEBE) {
				setType(typeLu);
				valide = true;
			} else {
				System.out.println("Les seules valeurs permises sont " + LIVRE + " et " + BEBE);
			}
		} while (!valide);
	}

	// partie2
	@Override
	public void lireRenseignements(Scanner clavier) {
		super.lireRenseignements(clavier);
		lireType(clavier);
	}

	@Override
	public double calculerTaxes() {

		return getPrix() * TPS;

	}

	@Override
	public boolean equals(Object objet) {
		boolean egal = false;

		if (objet != null && objet instanceof ProduitTaxableTPS) {

			ProduitTaxableTPS autre = (ProduitTaxableTPS) objet;
			egal = this.getNumero() == autre.getNumero() && this.type == autre.type;
		}

		return egal;
	}

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		// tester toString()
		ProduitTaxableTPS prod1 = new ProduitTaxableTPS(3, "Comment gerer son stresse", 15.75, 'l');
		System.out.println(prod1);
		// tester lireCategorie() et le calcul de la tps
		ProduitTaxableTPS prod2 = new ProduitTaxableTPS();
		prod2.lireNumero(clavier);
		prod2.lireDescription(clavier);
		prod2.lirePrix(clavier);
		prod2.lireType(clavier);
		System.out.println(prod2);
	}
}
