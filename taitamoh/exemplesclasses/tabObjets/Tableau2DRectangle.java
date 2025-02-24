package taitamoh.exemplesclasses.tabObjets;

import taitamoh.exemplesclasses.tabObjets.exercices.Rectangle;

public class Tableau2DRectangle {

	public static void main(String[] args) {
		Rectangle[][] tab2DRectangle1 = new Rectangle[3][2];

		Rectangle[][] tab2DRectangle2 = { { new Rectangle(8, 2), new Rectangle(7, 5) },
				{ new Rectangle(10, 3), new Rectangle(3, 1) }, { new Rectangle(5, 3), new Rectangle(5, 2) } };
		affichertabRectangle(tab2DRectangle2);
	}

	public static void affichertabRectangle(Rectangle[][] tabRectangle) {
		for (int ligne = 0; ligne < tabRectangle.length; ligne++) {
			for (int colonne = 0; colonne < tabRectangle[ligne].length; colonne++) {
				tabRectangle[ligne][colonne].afficher();
			}
		}

	}

}
