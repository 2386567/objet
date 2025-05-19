package taitamoh.tp04;
/**
 * Cette classe permet de recueillir
 * des informations d'un objet Personne
 * de type Femme tel que : sa taille, 
 * son poids ideal, son nom etc.
 * @author Mohamed Abdoulaye Taita
 */
public class Femme extends Personne{


    public Femme(String nom, int taille, double poids){
        super(nom, taille, poids, "Femme");
    }

    @Override
    public double calculerPoidsIdeal(){
        return taille - FACTEUR1 - ((taille - FACTEUR2) / FACTEUR_FEMME) ; 
    }
}

