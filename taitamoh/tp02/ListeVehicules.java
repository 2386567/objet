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
public class ListeVehicules {
    Vehicule[] tabVehicules;
    int nbVehicules;
    public ListeVehicules(int maxVehicules){
        tabVehicules = new Vehicule[maxVehicules];
        nbVehicules = 0;
    }
    public int taille(){
        return nbVehicules;
    }
    public boolean estVide(){
        boolean nbVehicules = false;
        int vehicules = 0;
        if (vehicules==0){
            nbVehicules = true;
        }else{
            nbVehicules = false;
        }
        return nbVehicules;
    }
public boolean estPlein(){
 return nbVehicules == tabVehicules.length;

}

public Vehicule obtenirVehicule(int indice){
    Vehicule vehicules = null;
if (indice >0 && indice < nbVehicules){
   vehicules = tabVehicules[indice];
}else{
vehicules = null;

}
return vehicules;
}

public boolean ajouter(Vehicule vehicule){
    boolean ajouter = false;
    if (nbVehicules < tabVehicules.length){
        tabVehicules[nbVehicules] = vehicule;
        nbVehicules++;
        ajouter = true;
    }else{
        ajouter = false;
    }
    return ajouter;
}


public void afficher(){
    for (int i = 0; i < nbVehicules; i++){
        if (tabVehicules[i] != null) {
        System.out.println(tabVehicules[i].toString());
        }
    }
}


public int indexDe( String numeroVehicule){
    int index = -1;
    for (int i = 0; i < nbVehicules; i++){
        if (tabVehicules[i].getNumeroInventaire().equals(numeroVehicule)){
            index = i;
        }
    }
    return index;

}

public boolean supprimer (String numeroVehicule){
    boolean supprimer = false;
    int indice = indexDe(numeroVehicule); 
        if (indice == -1) {
            supprimer = false;
        }
        
    for (int i = indice ; i < nbVehicules - 1; i++) {
        tabVehicules[i] = tabVehicules[i + 1];
        }
        tabVehicules[nbVehicules-1] =null;
        return supprimer;
    }
    



public static void main(String[] args) {
    ListeVehicules liste = new ListeVehicules(5);
    Vehicule v1 = new Vehicule("2024001", "Hundai", "Elantra", 2019, 12500.00);
    Vehicule v2 = new Vehicule("2024002", "Toyota", "Corolla", 2018, 10500.00);
    String indice1 = "2024001";
    String indice2 = "-1";
    liste.ajouter(v1);
    liste.ajouter(v2);
    liste.afficher();

    int index = liste.indexDe(indice1);
    System.out.println("Véhicule v1 à l'index : " + indice1);
    
    System.out.println("Véhicule v2 à l'index : " + indice2);
    

    index = liste.indexDe(indice2);

    if (index != -1) {
        System.out.println("Véhicule v1 à l'index : " + index);
    }else{
    System.out.println("Véhicule non trouvé");
    }

    System.out.println("Supprimer le produit avec l'index : 2024001");
    liste.supprimer(indice1);
    System.out.println("Nouvelles liste");
    liste.afficher();
   
}

}


