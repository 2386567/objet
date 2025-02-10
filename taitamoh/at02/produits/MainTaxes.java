package taitamoh.at02.produits;


public class MainTaxes {
public static void main(String[] args) {

	Taxes.calculerTotalTaxes(0);
	//question 1
	double montant1=100.0;
	//question 2
	System.out.println("La valeur de la taxe TPS sur montant1 : " + Taxes.calculerTaxeTps(montant1));
	//question 3
	System.out.println("La valeur de la taxe TVQ sur montant1 : " + Taxes.calculerTaxeTvq(montant1));
	//question 4
	System.out.println("La valeur totale des taxes sur montant1 : " + Taxes.calculerTotalTaxes(montant1));
	//question 5
	System.out.println("La valeur du taux de TPS: " + Taxes.TAUX_TPS);
	//question 6
	System.out.println("La valeur du taux TVQ: " + Taxes.TAUX_TVQ);
	//question 7
	// On ne peut pas le faure,car ce n'est pas une méthode statique.
	//question 8
	Taxes uneTaxe = new Taxes(500);
	//question 9
	System.out.println("La valeur de la taxe TPS sur uneTaxe : " + Taxes.getTaxesTps());
	//question 10
	System.out.println("La valeur de la taxe TVQ sur uneTaxe : " + Taxes.getTaxesTvq());
	//question1 11
	System.out.println("La valeur totale des taxes sur uneTaxe : " + Taxes.getTotalTaxes());
	//question1 12
	uneTaxe.afficherTaxes();
}
}
