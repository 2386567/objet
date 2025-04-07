package taitamoh.at04.partie1;
import java.util.Scanner;
public class ProduitTaxableTPS extends Produit{
    protected static final double TPS = 0.05;
    private char type;
    private String categorie;
    private static final char LIVRE ='l';
    private static final char BEBE = 'b';

    public char getType(){
        return type;
    }

    public void setType(char t){
        if (t == 'l' || t == 'b' || t == '\u0000') {
             type = t;
        }else{
            type = '\u0000';
        }
    }

     public ProduitTaxableTPS(int numero, String description, double prix, char type){
        super(numero, description, prix);
     }

     public ProduitTaxableTPS(){
        super();
        setType('\u0000');
       
     }
      public void lireType(Scanner cl){
        boolean valide = false;
        char t;
        do{
            System.out.println("Entrez le type du produit l ou b ");
            t = cl.next().charAt(0);
            if (t == LIVRE || t == BEBE){
        setType(t);
        valide = true;
    }else{
        System.out.println("entrez b ou l");
    }
}while(!valide);

    }
}