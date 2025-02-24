package taitamoh.exemplesclasses.tabObjets.exercices;
public class Exercice1 {

	public static void main(String[] args) {
		// declarer et initialiser un tableau de 3 rectangles
		Rectangle [] tabRectangle = new Rectangle[3];
		
		// afficher la largeur du rectangle d'indice 2
		System.out.println("La largeur du dernier rectangle: " + tabRectangle[2].getLargeur() );
		
		// modifier la longeur du  premier rectangle , la nouvelle longueur est 50
		tabRectangle[1].setLongueur(50);
		// afficher le perimetre du premier rectangle
		System.out.println("perimetre du premier rectangle: " + tabRectangle[1].perimRectangle()  );
		
		// afficher les caracteristiques du premier rectangle
		tabRectangle[1].afficher();
		//Quel Rectangle a la plus grande superficie entre le premier et le deuxieme
		if (tabRectangle[1].estPlusGrand(tabRectangle[2])) {
			System.out.println("Le premier rectangle est le plus grand");
		}else{
			System.out.println("Le deuxième rectangle est le plus grand");
		}
		
	}

}