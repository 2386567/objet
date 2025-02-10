package taitamoh.at02.produits;
public class Taxes {
    public static final double TAUX_TPS=0.05;
    public static final double TAUX_TVQ=0.09975;
    private static double taxeTps;
    private static double taxeTvq;
    private static double totalTaxes;
   
    

public static double getTaxesTps(){
return taxeTps;
}
public static double getTaxesTvq(){ 
    return taxeTvq;
}    
public static double getTotalTaxes(){
    return totalTaxes;
}  
public static double calculerTaxeTps(double montant){
    taxeTps=montant*TAUX_TPS;
    return taxeTps;
}  
public static double calculerTaxeTvq(double montant){
    taxeTvq=montant*TAUX_TVQ;
    return taxeTvq;
}  
public static double calculerTotalTaxes(double montant){
totalTaxes= calculerTaxeTps(montant)+calculerTaxeTvq(montant);
return totalTaxes;
}  
public Taxes (double montant){
    calculerTaxeTps(montant);
    calculerTaxeTvq(montant);
    calculerTotalTaxes(montant);
}  
public void afficherTaxes(){
    System.out.println("Le montant de la TPS : " + taxeTps);
    System.out.println("Le montant de la TVQ : " + taxeTvq);
    System.out.println("Le total de la taxes : " + totalTaxes);
} 
} 