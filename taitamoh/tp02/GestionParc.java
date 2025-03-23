package taitamoh.tp02;
import java.util.Scanner;
/**  
* 
* représente une liste de véhicules implémentée à l'aide d'un tableau d’objets
de type Vehicule. Elle contient des méthodes permettant d'effectuer des opérations sur cette liste telles
que l'ajout, la suppression et la recherche d'un véhicule.
*
* @author Taita, Mohamed Abdoulaye
*
*/
public class GestionParc {
    public static Scanner clavier = new Scanner(System.in);
    public static void main(String[] args){
        ListeVehicules liste = new ListeVehicules(400);
        initialiserListeVehicules(liste);
        int choix;
      do{
            System.out.println("****** Gestion du parc automobile ******");
            System.out.println("1- Ajouter un nouveau véhicule");
            System.out.println("2- Supprimer un véhicule");
            System.out.println("3- Rechercher un véhicule par son numéro d'inventaire");
            System.out.println("4- Afficher la liste des véhicules");
            System.out.println("5- Afficher la moyenne des prix des véhicules");
            System.out.println("6- Quitter");
            System.out.print("Faites votre choix:");
            choix=clavier.nextInt();
            switch (choix) {
                case 1: 
                    ajouterVehicule(liste);
                    break;
                case 2:
                supprimerVehicule(liste);
                break;
                case 3: 
                rechercherVehicule(liste);
                break;
                case 4: 
                afficherVehicules(liste);
                break;
                case 5: 
                moyenneVehicules(liste);
                break;
                case 6:
                System.out.println("Bonne journée!");
                   break;
                default: 
                System.out.println("Choix invalide");

                    break;
            }
      }while (choix != 6) ;


    }
    public static void initialiserListeVehicules(ListeVehicules liste){
        liste.ajouter(new Vehicule("2024001", "Hyundai", "Elantra", 2019, 12500.00));
        liste.ajouter(new Vehicule("2024002", "Toyota", "Corolla", 2018, 10500.00));
        liste.ajouter(new Vehicule("2024003", "Honda", "Civic", 2024));

}
public static void afficherVehicules(ListeVehicules listeVehicules){
    if (listeVehicules == null) {
        System.out.println("Il n'y a aucun véhicule à afficher.");
    }else{
    System.out.println(String.format("%s %s %10s %10d %2f", "Numéro", "Marque", "Modèle", "Année", "Prix"));
    for (int i = 0; i < listeVehicules.taille(); i++) {
        Vehicule v1 = listeVehicules.tabVehicules[i];
        System.out.println(String.format("%s %s %10s %10d %2f", v1.getNumeroInventaire(),v1.getMarque(),v1.getModele(),v1.getAnnee(),v1.getPrix()));
    }
    }
}
public static void ajouterVehicule(ListeVehicules listeVehicules){
    String numeroInventaire = clavier.next();
    String marque;
    int annee;
    String modele;
    double prix;
    if (listeVehicules.estPlein()) {
        System.out.println("Impossible d'ajouter des véhicules, le parc est plein.");
    }
     System.out.println("Entrez le numéro d'inventaire");
        if (listeVehicules.indexDe(numeroInventaire) != -1) {
        System.out.println("Ajout impossible. Il existe déjà un véhicule avec ce numéro.");
    }else{
        System.out.print("Entrez le numéro d'inventaire du véhicule: " + numeroInventaire);
        numeroInventaire = clavier.next();
        System.out.print("Entrez la marque du véhicule: ");
        marque = clavier.next();
        System.out.println("Entrez le modèle du véhicule: ");
        modele = clavier.next();
        System.out.println("Entrez l'année du véhicule:");
        annee = clavier.nextInt();
        System.out.println("Entrez le prix du véhicule: ");
        prix = clavier.nextDouble();
        Vehicule v1 = new Vehicule(numeroInventaire, marque, modele, annee, prix);
        listeVehicules.ajouter(v1);
        System.out.println("Le véhicule de numéro d'inventaire " + numeroInventaire + " a été ajouté avec succès.");
    }
}
public static void supprimerVehicule(ListeVehicules listeVehicules){
    System.out.print("Entrez le numéro d'imventaire du véhicule a supprimer: ");
    String numeroInventaire = clavier.next();
    int indice = listeVehicules.indexDe(numeroInventaire);
 
    if (indice == -1) {
            System.out.println("Il n'y a aucun véhicule avec ce numéro d'inventaire.");
        }else{
    
    System.out.println("Voulez-vous vraiment supprimer le véhicule de numéro d'inventaire" +  numeroInventaire + "(O/N)?");
        String confirmation = clavier.next();
    if(confirmation.equals("O")){
         listeVehicules.supprimer(numeroInventaire);
         System.out.println("Le véhicule de numéro d'inventaire " + numeroInventaire + "a été supprimé");
    }else{
        System.out.println("La suppression du véhicule de numéro d'inventaire" + numeroInventaire + "a été annulée");
    }
}
}
public static void rechercherVehicule(ListeVehicules listeVehicules){
    String numeroInventaire = clavier.next();
    int indice = listeVehicules.indexDe(numeroInventaire);
    System.out.println("Entrez le numéro du véhicule à rechercher: ");

    if (indice == -1) {
        System.out.println("Il n’y a aucun véhicule avec le numéro d'inventaire " + numeroInventaire +".");
    }else{
       System.out.println("Véhicule trouvé: ");
        System.out.println(listeVehicules.tabVehicules[indice].toString());
    }
}
public static void moyenneVehicules(ListeVehicules listeVehicules){
    double somme = 0.0;
    double moyenne;
    if(listeVehicules.taille()==0){
    System.out.println("Il n'y a aucun véhicule");
    }else{
    for (int i = 0; i < listeVehicules.taille(); i++) {
        somme += listeVehicules.tabVehicules[i].getPrix();
    }
    moyenne = somme / listeVehicules.taille();
    System.out.println("Le prix moyen des véhicules est: " + moyenne);
}
}
}