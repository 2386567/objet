package sandbox.exemplesclasses;
public class Rectangle {

	// Attributs(ou champs d'instances) de la classe Rectangle
	private int longueur;
	private int largeur;

	// Construire un rectangle à partir de longueur et de largeur
	public Rectangle(int longueur, int largeur) {
		setLongueur(longueur);
		setLargeur(largeur);
	}

	// Construire un rectangle de type carré
	public Rectangle(int cote) {
		setLargeur(cote);
		setLongueur(cote);
	}

	// Méthode mutateur qui modifie la longueur du rectangle par par la longueur
	// reçue en paramètre 
	public void setLongueur(int longueur) {
		if (longueur > 0) {
			this.longueur = longueur;
		}
	}

	// Méthode mutateur qui modifie la largeur du rectangle par  la largeur
	// reçue en paramètre 
	public void setLargeur(int largeur) {
		if (largeur > 0) {
			this.largeur = largeur;
		}
	}

	// Méthode accesseur qui retourne la longueur du rectangle
	public int getLongueur() {
		return longueur;
	}

	// Méthode accesseur qui retourne la largeur du rectangle
	public int getLargeur() {
		return largeur;
	}

	// Méthode publique qui calcule et retourne le périmètre du rectangle
	public int perimRectangle() {
		int perim;
		perim = (longueur + largeur) * 2;
		return perim;
	}

	// Méthode publique qui calcule et retourne l'aire du rectangle
	public int aireRectangle() {
		return longueur * largeur;
	}

	// Méthode publique qui dessine un rectangle à la console en utilisant
	// un caractère reçu en paramètre
	public void dessineRectangle(char symbole) {
		
		for (int i = 0; i < longueur; i++) {
			for (int j = 0; j < largeur; j++) {
				System.out.print(symbole);
			}
			System.out.println();
		}
	}
	// Méthode publique qui affiche les caractéristiques du rectangle
	public void afficher() {
		
		if (estCarre()) {
			System.out.println("Ce rectange est un carré");
			System.out.println(String.format("%-13s %5d", "côté:", getLongueur()));
		}else {
			System.out.println(String.format("%-13s %5d", "Longueur:", getLongueur()));
			System.out.println(String.format("%-13s %5d", "Largeur:", getLargeur()));
		}
		System.out.println(String.format("%-13s %5d", "L'aire:", aireRectangle()));
		System.out.println(String.format("%-13s %5d", "Le périmètre:", perimRectangle()));
		System.out.println();
	}

	// Méthode qui retourne true si l'aire du rectangle en cours (this) est plus grande
	// que l'aire du rectangle fourni en paramètre.
	public boolean estPlusGrand(Rectangle autreRectangle) {
		return this.aireRectangle() > autreRectangle.aireRectangle();

	}

	// Méthode qui retourne true si le rectangle est un carré: largeur = longueur
	public boolean estCarre() {
		return longueur == largeur;

	}
}
