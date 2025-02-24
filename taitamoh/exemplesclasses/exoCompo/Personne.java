package taitamoh.exemplesclasses.exoCompo;

/**
 * 
 *completez les deux constructeurs et la metode setDateNaissance() 
 *
 */
public class Personne {
	// attributes d'instance
	private String nom;
	private int poids;
	private DateNaissance dateNaissance;

	// constructeur avec 5 parametres
	public Personne(String unNom, int unPoids, int an, int ms, int jr) {
		// A completer
		nom=unNom;
		poids=unPoids;
		setDateNaissance(an, ms, jr);
	}

	// constructeur avec 3 parametres
	public Personne(String nom, int poids, DateNaissance dateNaissance) {
		//A completer
		this.nom=nom;
		this.poids=poids;
		this.dateNaissance=dateNaissance;
	}

	// accesseur de  nom
	public String getNom() {
		return nom;
	}

	// accesseur de poids
	public int getPoids() {
		return poids;
	}

	// accesseur de dateNaissance
	public DateNaissance getDateNaissance() {
		return dateNaissance;
	}

	// mutateur de nom
	public void setNom(String unNom) {
		nom = unNom;
	}

	// mutateur de poids
	public void setPoids(int unPoids) {
		poids = unPoids;
	}

	// mutateur de  date de dateNaissance
	public void setDateNaissance(int an, int ms, int jr) {
		// A completer
		dateNaissance=new DateNaissance(an,ms,jr);
	}

	//  affiche les caracteristiques d'un personne
	public void afficherPersonne() {
		System.out.print("Je m'appelle " + nom + " je p�se " + poids + " kgs et je suis n�(e) le ");
		dateNaissance.afficherDate();

	}
}
