package taitamoh.at02.produits;

public class Produit {

	private  String description;
	private double prix;
	private Taxes taxesPrix;
	private double prixTotal;

	public Produit(String description, double prix) {
		setDescription(description);
		setPrix(prix);
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
		taxesPrix=new Taxes (prix);
		prixTotal=Taxes.getTotalTaxes();
	}
	public Taxes getTaxesprix(){
		return taxesPrix;
	}	
	public double getPrixTotal(){
		return prixTotal;
	}


	public double prixApresRabais(double pourcentage) {
		return prix - (pourcentage / 100) * prix;
	}

	public void afficher() {
		System.out.println(String.format("%-13s %-50s", "Description: ", description));
		System.out.println(String.format("%-13s %.2f$ ", "Prix: ", prix));
		taxesPrix.afficherTaxes();
        System.out.println(String.format("%-13s %.2f$ ", "Prix incluant les taxes: ", prixTotal));
	}
}
