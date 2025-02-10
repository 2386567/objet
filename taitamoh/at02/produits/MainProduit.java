package taitamoh.at02.produits;
public class MainProduit {

	public static void main(String[] args) {

		// Question 4
		Produit prod1= new Produit("chaise blanche en similicuir",100);
		// Question 5
		System.out.println("La taxe TPS de prod1: " +Taxes.getTaxesTps());
		// Question 6
		System.out.println("La taxe TVQ de prod1: " +Taxes.getTaxesTvq());
		// Question 7
        System.out.println("Le total des taxes de prod1: " +Taxes.getTotalTaxes());
		// Question 8
		prod1.setPrix(200);
		// Question 9
		prod1.afficher();

	}

}
