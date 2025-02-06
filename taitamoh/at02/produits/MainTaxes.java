package taitamoh.at02.produits;
import taitamoh.at02.produits.taxes;
public class MainTaxes {
public static void main(String[] args) {
	taxes.calculerTotalTaxes(0);
	//question 1
	double montant1=100.0;
	//question 2
	System.out.println("La valeur de la taxe TPS sur montant1 : " + taxes.calculerTaxeTps(montant1));
	//question 3
	System.out.println("La valeur de la taxe TVQ sur montant1 : " + taxes.calculerTaxeTvq(montant1));
	//question 4
	System.out.println("La valeur totale des taxes sur montant1 : " + taxes.calculerTotalTaxes(montant1));
	//question 5
	System.out.println("La valeur du taux de TPS: " + taxes.TAUX_TPS);
	//question 6
	System.out.println("La valeur du taux TVQ: " + taxes.TAUX_TVQ);
	//question 7
	// On ne peut pas le faure,car ce n'est pas une méthode statique.
	//question 8
	taxes uneTaxe = new taxes(500);
	//question 9
	System.out.println("La valeur de la taxe TPS sur uneTaxe : " + taxes.getTaxeTPS());
	//question 10
	System.out.println("La valeur de la taxe TVQ sur uneTaxe : " + taxes.getTaxesTvq());
	//question1 11
	System.out.println("La valeur totale des taxes sur uneTaxe : " + uneTaxe.getTotalTaxes());
	//question1 12
	uneTaxe.afficherTaxes();
}
}
