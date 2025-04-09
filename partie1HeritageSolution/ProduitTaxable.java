package enseignant.at04.partie1;

import java.util.Scanner;

/**
 * Cette classe contient les attributs et les m�thodes d'un ProduitTaxable ��
 * Les produits taxables sont les produits sur lesquels on paie la TPS et la
 * TVQ.
 *
 */
public class ProduitTaxable extends ProduitTaxableTPS {

	protected static final double TVQ = 0.09975;

	public ProduitTaxable() {
		this(0, "inconnu", 0);

	}

	public ProduitTaxable(int numero, String description, double prix) {
		super(numero, description, prix, '\u0000');

	}

	@Override
	public double calculerPrixVente() {
		return super.calculerPrixVente() + getPrix() * TVQ;
	}
	/*
	 * Question 5: Nous n'avons pas besoin de redefinir la methode toString(). C'est
	 * la methode ProduitTaxableTPS.toString() qui sera appelee.
	 * A l'execution de cette methode, Java appelle la methode clculerPrixVente() de la classe 
	 * ProduitTaxableTPS si l'objet est de cette classe. C'est le polymorphisme.
	 */

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		ProduitTaxable prod1 = new ProduitTaxable(25, "Tapis de souris Confort", 10);
		System.out.println(prod1);

	}
}
