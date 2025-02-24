package taitamoh.exemplesclasses.tabObjets.exercices;

import java.util.Scanner;

public class Exercice2 {
	public static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		// Appelez initialiserTabRectangle pour initialiser (remplir) tabRectangle
		initialiserTabRectangle(tabRectangle);
		// Appelez afficherTabRectangle pour afficher les elements de tabRectangle
		afficherTabRectangle(tabRectangle);
		// Affichez l’aire totale des rectangles: appelez aireTotale(tabRectangle)
        System.out.println("L'aire totale" + aireTotale(tabRectangle));
	}

	// Initialise les elements du tableau fourni en parametre avec des données
	// entrees au clavier.
	public static void initialiserTabRectangle(Rectangle[] tabRectangle) {
		int larg, longu;
		Rectangle [] tabRectangle = new Rectangle[3];
		for (int i = 0; i < tabRectangle.length; i++) {
			System.out.print("Entrez la longueur du rectangle #" + (i + 1) + ": ");
			longu = clavier.nextInt();
			System.out.print("Entrez la largeur du rectangle #" + (i + 1) + ": ");
			larg = clavier.nextInt();
			// à completer
			tabRectangle[i]=new Rectangle(longu, larg);
			
		}
	}

	// Affiche les éléments du tableau
	public static void afficherTabRectangle(Rectangle[] tabRectangle) {
		// à completer
		for (int j = 0; j < tabRectangle.length; j++) {
			tabRectangle[j].afficher();
		}
	}

	// Retourne l'aire totale des rectangles du tableau fourni en paramètre
	public static int aireTotale(Rectangle[] tabRectangle) {
		// à completer
		int sommeAire=0;
		for (int i = 0; i < tabRectangle.length; i++) {
			sommeAire += tabRectangle[i].aireRectangle();
		}
		return sommeAire;
	}
}
