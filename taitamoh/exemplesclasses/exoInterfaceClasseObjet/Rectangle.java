package taitamoh.exemplesclasses.exoInterfaceClasseObjet;

public class Rectangle implements Comparable<Rectangle> {
	private int longueur;
	private int largeur;

	public Rectangle(int longueur, int largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public int getLongueur() {
		return longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public int perimRectangle() {
		return (longueur + largeur) * 2;
	}

	public int aireRectangle() {
		return longueur * largeur;
	}

	public void dessineRectangle() {
		System.out.println("Représentation graphique du rectangle:");
		for (int i = 0; i < longueur; i++) {
			for (int j = 0; j < largeur; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	@Override
	public int compareTo(Rectangle autreRectangle) {
		int aire1 = this.aireRectangle();
		int aire2 = autreRectangle.aireRectangle();

		if (aire1 < aire2) {
			return -1;
		} else if (aire1 > aire2) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Rectangle autre = (Rectangle) obj;
		return this.aireRectangle() == autre.aireRectangle();
	}

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(4, 5);
		Rectangle rect2 = new Rectangle(5, 4);
		Rectangle rect3 = new Rectangle(3, 2);

		System.out.println("rect1.equals(rect2): " + rect1.equals(rect2)); // true
		System.out.println("rect1.equals(rect3): " + rect1.equals(rect3)); // false

		System.out.println("rect1.compareTo(rect2): " + rect1.compareTo(rect2)); // 0
		System.out.println("rect1.compareTo(rect3): " + rect1.compareTo(rect3)); // 1
		System.out.println("rect3.compareTo(rect1): " + rect3.compareTo(rect1)); // -1
	}
}
