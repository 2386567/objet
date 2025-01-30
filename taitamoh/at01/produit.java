package taitamoh.at01;

public class produit {
    private String description;
    private double prix;
    private double prixProduit;

    public produit(String descript, double prixProduit) {
        this.description = descript;
        this.prix = prixProduit;
    }

    public String getDescription() {
        return description;
    }

    public double getPrix() {
        return prix;
    }

    public void setDescription(String descript) {
        this.description = descript;
    }

    public void setPrix(double prixProduit) {
        this.prix = prixProduit;
    }

    public double prixApresRabais(double pourcentageRabais) {
        return prix - (prix * pourcentageRabais / 100);

    }

    public void afficher() {
        System.out.println("Description " + description);
        System.out.println("Prix : " + prix + "$");
    }
}
