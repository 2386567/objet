package zoubamo.at05;

import java.util.Scanner;

public class TestAtelier5 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		Produit[] tabProduit = new Produit[3];
		ProduitTaxable prod1 = new ProduitTaxable(7, "Tapis de souris Confort", 15.75);
		ProduitBase prod2 = new ProduitBase(7, "Boite de 1 litre lait en carton Quebon 2%", 3.25, "Lait");
		ProduitTaxableTPS prod3 = new ProduitTaxableTPS(1, "Comment gerer son stresse", 15.75, 'l');
		ProduitTaxableTPS prod4 = new ProduitTaxableTPS(5, "Les aventures de Lili", 15.75, 'l');
		tabProduit[0] = prod1;
		tabProduit[1] = prod2;
		tabProduit[2] = prod3;
		//********** Question 6 *************
		// test de equals de la classe Produit:
		// prod1 et prod2 sont �gaux puisqu'ils ont le m�me num�ro
		if (prod1.equals(prod2)) {
			System.out.println("Les deux premiers porduit sont �gaux.");
		}
		//********** Question 7 *************
		// test de equals de la classe ProduitTaxeTPS:
		// prod3 et prod4 sont �gaux puisqu'ils ont le m�me prix et le m�me type
		if (prod3.equals(prod4)) {
			System.out.println("Les deux derniers porduit sont �gaux.");
		}
		//********** Question 8 ****************
		// test de compareTo
		// prod1 est plus petit que prod2 puisque le prix de prod1 est plus
		// petit que le prix de prod2
		if (prod1.compareTo(prod2) < 0) {
			System.out.println("Le prix du prod1 est plus petit que celui de prod2");

		} else {
			System.out.println("Le prix du prod1 n'est pas  plus petit que celui de prod2");
		}
		// trier le tableau tabProduit et afficher son contenu
		trier(tabProduit);
		for (int i = 0; i < args.length; i++) {
			System.out.println(tabProduit[i]);
		}
		clavier.close();
	}
/*
 * Trier le tableau tab de type Produit. Utiliser comapareTo() pour
 * comparer les cases du tableau.
 */
	public static void trier(Produit[] tab) {
		Produit temp;
		int posMin;
		for (int i = 0; i < tab.length; ++i) {
			posMin = i;
			for (int j = i + 1; j < tab.length; ++j) {
				if (tab[j].compareTo(tab[posMin]) < 0) {
					posMin = j;
				}
			}
			if (posMin != i) {
				temp = tab[i];
				tab[i] = tab[posMin];
				tab[posMin] = temp;
			}
		}
	}

}
