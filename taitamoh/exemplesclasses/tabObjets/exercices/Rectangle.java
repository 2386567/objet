package taitamoh.exemplesclasses.tabObjets.exercices;


public class Rectangle {

	// Attributs(ou champs d'instances) de la classe Rectangle
	private int longueur;
	private int largeur;

	// Construire un rectangle a partir de longueur et de largeur
	public Rectangle(int longueur, int largeur) {
		setLongueur(longueur);
		setLargeur(largeur);
	}

	// Construire un rectangle de type carre
	public Rectangle(int cote) {
		this(cote, cote);
	}

	// Methode mutateur qui modifie la longueur du rectangle
	public void setLongueur(int longueur) {
		if (longueur > 0) {
			this.longueur = longueur;
		}
	}

	// Methode mutateur qui modifie la largeur du rectangle
	public void setLargeur(int largeur) {
		if (largeur > 0) {
			this.largeur = largeur;
		}
	}

	// Methode accesseur qui retourne la longueur du rectangle
	public int getLongueur() {
		return longueur;
	}

	// Methode accesseur qui retourne la largeur du rectangle
	public int getLargeur() {
		return largeur;
	}

	// Methode publique qui calcule et retourne le perimetre du rectangle
	public int perimRectangle() {
		return (longueur + largeur) * 2;
		
	}

	// Methode publique qui calcule et retourne l'aire du rectangle
	public int aireRectangle() {
		return longueur * largeur;
	}

	// Methode publique qui dessine un rectangle a la console en utilisant
	// un caractere fourni en parametre
	public void dessineRectangle(char symbole) {

		for (int i = 0; i < longueur; i++) {
			for (int j = 0; j < largeur; j++) {
				System.out.print(symbole);
			}
			System.out.println();
		}
	}

	// Methode publique qui affiche les caracteristiques du rectangle
	public void afficher() {

		if (this.estCarre()) {
			System.out.println("Ce rectange est un carre");
			System.out.println(String.format("%-13s %5d", "cot�:", getLongueur()));
		} else {
			System.out.println(String.format("%-13s %5d", "La longueur:", getLongueur()));
			System.out.println(String.format("%-13s %5d", "La largeur:", getLargeur()));
		}
		System.out.println(String.format("%-13s %5d", "L'aire:", aireRectangle()));
		System.out.println(String.format("%-13s %5d", "Le perimetre:", perimRectangle()));
		System.out.println();
	}

	// Methode qui retourne true si l'aire du rectangle en cours (this) est plus
	// grande que l'aire du rectangle fourni en parametre.
	public boolean estPlusGrand(Rectangle autreRectangle) {
		return aireRectangle() > autreRectangle.aireRectangle();

	}

	// Methode qui retourne true si le rectangle est un carre: largeur = longueur
	public boolean estCarre() {
		return longueur == largeur;

	}
}
