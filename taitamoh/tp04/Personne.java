package taitamoh.tp04;

/**
 * Cette classe permet de comparer l'écart entre
 * les poids idéals et le poids actuel d'une personne
 * afin de les comparer avec les autres objets
 * de type personne.
 * @author Mohamed Abdoulaye Taita
 */
public abstract class Personne implements PoidsIdeal, Comparable<Personne> {
    protected String nom;
    protected double poids;
    protected int taille;
    protected String sexe;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getPoids() {
        return poids;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int taille() {
        return taille;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String sexe() {

        return sexe;

    }

    public Personne(String nom, int taille, double poids, String sexe) {

        setNom(nom);
        setTaille(taille);
        setPoids(poids);
        setSexe(sexe);

    }

    @Override
    public int compareTo(Personne p) {
       int poidsIdeal;
        double p1 = Math.abs(this.poids - this.calculerPoidsIdeal());
        double p2 = Math.abs(p.poids - p.calculerPoidsIdeal());

        if (p1 < p2) {
            poidsIdeal = 1;
        }else if (p1 > p2) {
            poidsIdeal = -1;
        }else{
            poidsIdeal = 0;
        }
     return  poidsIdeal;

    }

}
