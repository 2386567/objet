package taitamoh.at04.partie1;

public class ProduitBase extends Produit {
    private String categorie;
    private static final int MIN_CAR_CATEGORIE = 1;
    private static final int MAX_CAR_CATEGORIE = 100;

    public ProduitBase(int numero, String description, double prix, String categorie) {
        super(numero, description, prix);
        setCategorie(categorie);
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        if (categorie.length() >= MIN_CAR_CATEGORIE && categorie.length() <= MAX_CAR_CATEGORIE) {
            this.categorie = categorie;
        }
    }
}
