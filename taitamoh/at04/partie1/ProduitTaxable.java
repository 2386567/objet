package taitamoh.at04.partie1;

import java.util.Scanner;

public class ProduitTaxable extends ProduitTaxableTPS {
    protected static final double TVQ = 0.09975;

    public ProduitTaxable(int numero, String description, double prix){
        super(numero,description,prix,'\u0000');
    }
    public ProduitTaxable(){
        this(0,"inconnu", 0);
    }

    @Override
    public double calculerPrixVente(){
        double prixTPS = super.calculerPrixVente();
        return prixTPS + (prixTPS * TVQ); 
    }

    public static void main(String[] args) {
         Scanner clavier = new Scanner(System.in);

         ProduitTaxable p1 = new ProduitTaxable();
         System.out.println("P1 (par défaut)");
         System.out.println(p1.toString());
         System.out.println();

         ProduitTaxable p2 = new ProduitTaxable(1, "Produit générique", 100.0);
         System.out.println("p2 (avec paramètres)");
         System.out.println(p2.toString());
         System.out.println();

         System.out.println("Prix p2 avec TVQ et TPS: " + p2.calculerPrixVente());
    }

}
