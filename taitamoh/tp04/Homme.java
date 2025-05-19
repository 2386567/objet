package taitamoh.tp04;
/**
 * Cette classe permet de recueillir
 * des informations d'un objet Personne
 * de type homme tel que  :  sa taille, 
 * son poids ideal, son nom etc.
 * @author Mohamed Abdoulaye Taita
 */
public class Homme extends Personne {

    public Homme(String nom, int taille, double poids){
        super(nom, taille, poids, "Homme");
    }

    @Override
    public double calculerPoidsIdeal(){
        return taille - FACTEUR1 - ((taille - FACTEUR2) / FACTEUR_HOMME) ; 
    }
}
