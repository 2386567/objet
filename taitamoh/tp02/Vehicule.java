package taitamoh.tp02;
/**
* Description de la classe.
*
* @author Taita, Mohamed Abdoulaye
*
*/
import java.util.Scanner;
public class Vehicule {
    private String numeroInventaire;
    private String marque;
    private String modele;
    private  int annee;
    private double prix;

    public String getNumeroInventaire() {
        return numeroInventaire;
    }
    public String getMarque() {
        return marque;
    }
    public String getModele() {
        return modele;
    }
    public int getAnnee() {
        return annee;
    }
    public double getPrix() {
        return prix;
    }
public Vehicule (String numeroInventaire, String marque, String modele, int annee){
    this.numeroInventaire = numeroInventaire;
    this.marque = marque;
    this.modele = modele;
    this.annee = annee;
}
public void setNumeroInventaire(String numeroInventaire){
    this.numeroInventaire = numeroInventaire;

}
public void setMarque(String marque){
    this.marque = marque;
}
public void setModele(String modele){
    this.modele = modele;
}
public void setAnnee(int annee){
    this.annee = annee;
}
public Vehicule (String numeroInventaire, String marque, String modele, int annee, double prix){
    this(numeroInventaire, marque, modele, annee);
    this.numeroInventaire = numeroInventaire;
    this.marque = marque;
    this.modele = modele;
    this.annee = annee;
   this.prix = prix;

}
public Vehicule(){
    this("Inconnu", "Inconnu", "Inconnu", 0, 0);
    numeroInventaire = "Inconnu";
    marque = "Inconnu";
    modele = "Inconnu";
    annee = 0;
    prix = 0;

}
public String toString(){
  return String.format("%s %s %s %d %f", numeroInventaire, marque, modele, annee, prix);

}
public void lireNumeroInventaire(Scanner clavier){
   String numero;
    numero = clavier.next();
this.numeroInventaire = numero;

}
public void lireMarque(Scanner clavier){
    String marque;
    marque = clavier.next();
    this.marque = marque;
}
public void lireModele(Scanner clavier){
    String modele;
    modele = clavier.next();
    this.modele = modele;
}
public void lireAnnee(Scanner clavier){
    int annee;
    annee = clavier.nextInt();
    this.annee = annee;
}
public void lirePrix(Scanner clavier){
    double prix;
    prix = clavier.nextDouble();
    this.prix = prix;
}
public static void main(String[] args) {
    Vehicule v1 = new Vehicule();
    Vehicule v2 = new Vehicule("1234", "Toyota", "Corolla", 2019);
    Vehicule v3 = new Vehicule("5678", "Honda", "Civic", 2020, 25000.00);
    System.out.println(v1.toString());
    System.out.println(v2.toString());  
    System.out.println(v3.toString());

}
}
