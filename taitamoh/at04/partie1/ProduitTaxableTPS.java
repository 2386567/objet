package taitamoh.at04.partie1;
import java.util.Scanner;

import taitamoh.at01.produit;
public class ProduitTaxableTPS extends Produit{
    protected static final double TPS = 0.05;
    private char type;
    private String categorie;
    private static final char LIVRE ='l';
    private static final char BEBE = 'b';

    public char getType(){
        return type;
    }

    public void setType(char type){
        if (type == 'l' || type == 'b' || type == '\u0000') {
             this.type = type;
        }
    }

     public ProduitTaxableTPS(int numero, String description, double prix, char type){
        super(numero, description, prix);
        setType(type);
     }

     public ProduitTaxableTPS(){
       this(0, "inconnu", 0, '\u0000');
       
     }
      public void lireType(Scanner cl){
        boolean valide = false;
        char t;
        do{
            System.out.print("Entrez le type du produit l pour livre ou b pour bébé  : ");
            t = cl.next().charAt(0);
            t = Character.toLowerCase(t);
            if (t == LIVRE || t == BEBE){
        setType(t);
        valide = true;
    }else{
        System.out.println("entrez b ou l");
    }
}while(!valide);

    }

    @Override
    public double calculerPrixVente(){
        double prixBase = super.calculerPrixVente();
          return prixBase + (prixBase * TPS);
    }

    @Override
    public String toString(){
        String base ="" ;
        if (type != '\u0000') {
            base = "\nType de produit : " + type;
        }
       
      return super.toString() + base + "\nPrix incluant les taxes :  " + String.format("%.2f$",calculerPrixVente());  
    }
    @Override
    public void lireRenseignements(Scanner clavier) {
        System.out.println("Entrez les renseignements du produit");
        lireNumero(clavier);
        lireDescription(clavier);
        lirePrix(clavier);
        }

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        ProduitTaxableTPS p1 = new ProduitTaxableTPS();
        System.out.println("Produit1 (par défaut) : ");
        System.out.println(p1.toString());
        System.out.println();

        ProduitTaxableTPS p2 = new ProduitTaxableTPS(1, "Livre", 20.0, 'l');
        System.out.println("Produit 2 :");
        System.out.println(p2.toString());
        System.out.println();

        System.out.println("Entrez un type de produit pour p1: ");
        p1.lireType(clavier);
        System.out.println("p1 après modification du type :");
        System.out.println(p1.toString());
        System.out.println();

        System.out.println("Prix de vente du produit avec TPS : " + p2.calculerPrixVente() + "$");
        System.out.println();

        System.out.println("Affichage du prodit 2: ");
        System.out.println(p2.toString());
    }

}