package taitamoh.at05.partie1;

import java.util.Scanner;

/**
 * Cette classe contient les attributs et les m�thodes d'un ProduitTaxable ��
 * Les produits taxables sont les produits sur lesquels on paie la TPS et la
 * TVQ.
 *
 */
public class ProduitTaxable extends Produit implements Taxable {
	public static final double TVQ = 0.09975;

	public ProduitTaxable() {
		this(0, "", 0);

	}

	public ProduitTaxable(int numero, String description, double prix) {
		super(numero, description, prix);

	}

	@Override
	public double calculerPrixVente() {
		return getPrix() + calculerTaxes();
	}

	@Override
	public double calculerTaxes() {
		return getPrix() * (TPS + TVQ);
	}
	/*
	 * Question 5: Nous n'avons pas besoin de red�finir la m�thode toString(). C'est
	 * la m�thode ProduitTaxableTPS.toString() qui sera appel�e.
	 * � l'ex�cution de cette m�thode, Java appelle la m�thode clculerPrixVente() de
	 * la classe
	 * ProduitTaxableTPS si l'objet est de cette classe. C'est le polymorphisme.
	 */

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		ProduitTaxable prod1 = new ProduitTaxable(25, "Tapis de souris Confort", 10);
		System.out.println(prod1);

	}

	@Override
	public void lireRenseignements(Scanner clavier) {
		lireNumero(clavier);
		lireDescription(clavier);
		lirePrix(clavier);

	}

}
