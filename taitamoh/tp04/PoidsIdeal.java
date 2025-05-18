package taitamoh.tp04;

/**
 * Cette interface contient les attributs et méthodes
 * pour calculer le poids ideal d'une personne.
 * 
 * @author Mohamed Abdoulaye Taita
 */
public interface PoidsIdeal {
    public static final int FACTEUR1 = 100;
    public static final int FACTEUR2 = 150;
    public static final float FACTEUR_FEMME = 2.5f;
    public static int FACTEUR_HOMME = 4;

    public abstract void calculerPoidsIdeal();

}
