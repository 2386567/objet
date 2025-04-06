package taitamoh.at04.partie1;

import java.util.Scanner;

import taitamoh.at01.produit;

public class ProduitBase extends Produit {
    Scanner clavier = new Scanner(System.in);
    private String categorie;
    private static final int MIN_CAR_CATEGORIE = 1;
    private static final int MAX_CAR_CATEGORIE = 100;

    public ProduitBase(int numero, String description, double prix, String categorie) {
        super(numero, description, prix);
        setCategorie(categorie);
    }
    public ProduitBase(){
        super();
        setCategorie("inconnu");
        setDescription("inconnu");
        setPrix(0.0);
        setNumero(0);
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        if (categorie.length() >= MIN_CAR_CATEGORIE && categorie.length() <= MAX_CAR_CATEGORIE) {
            this.categorie = categorie;
        }
    }

    public void lireCategorie(Scanner clavier){
        boolean valide = false;     
        String categorie;
        
        do {
           System.out.print("Entrez la catégorie du produit: "); 
           categorie = clavier.nextLine();
           if (categorie.length() >= 1 && categorie.length() <= 100) {
           setCategorie(categorie);
           valide = true;
           }else{
            System.out.println("La catégorie doit contenir entre 1 et 100 caractères");
           }
         } while (!valide);
    }

    @Override
    public String toString(){
        return super.toString() + "\nCatégorie : " + categorie;
    }

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        ProduitBase prod1 = new ProduitBase();
        System.out.println(prod1.toString());
        System.out.println();

        ProduitBase prod2 = new ProduitBase(2,"Lait",3.25,"produits laits");
        System.out.println(prod2.toString());
        System.out.println();

        System.out.println("Catégorie du produit 2 : " + prod2.getCategorie());
        System.out.println();
        prod2.setCategorie("Produits Laitiers");
        System.out.println("Modification de catégorie : " + prod2.getCategorie());
        System.out.println();

        System.out.println("Prix du produit 2 : " + prod2.calculerPrixVente() + "$");
        System.out.println();

        System.out.println("lecture de la catégorie produit 1 : ");
        prod1.lireCategorie(clavier);
        System.out.println("La catégorie est : " + prod1.getCategorie());
    }
}
