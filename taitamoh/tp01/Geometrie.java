package taitamoh.tp01;
import taitamoh.tp01.outils.OutilsTriangle;
/**
 * Cette classe contient le programme principale qui permettra de
 *  tester les différentes autres classes: OutilsTriangle,Cercle et 
 * Point
 * @author Taita, Mohamed Abdoulaye 
 * 
 */
public class Geometrie {

	public static void main(String[] args) {
		// Test de la classe Point
		// Question 1
			Point pointA = new Point(2, 4, 'A');
	        Point pointB = new Point(3, -2, 'B');  
			Point pointC = new Point(-3, 3, 'C');

		// Question 2
		  
		   Point pointD = new Point();
		   pointD.setNom('D');
			
		// Question 3
		    System.out.println("Coordonnee x de " + pointA.getNom() + " : " + pointA.getX());
		// Question 4
		    System.out.println("Coordonnee y de " + pointA.getNom() + " : " + pointA.getY());
		// Question 5
			System.out.println(pointA.coordonnees());
		// Question 6
		    pointA.afficher();
		// Question 7
			System.out.println("Distance entre les points A et C: " + pointA.distance(pointC));
		// Question 8
			System.out.println("Distance entre les points B et C: " + pointB.distance(pointC));
		// Question 9
			pointD.afficher();
		// Question 10
			pointD.setX(-4);
		// Question 11
			pointD.setY(-6);
		// Question 12
		    System.out.println("Nouvelles caractéristiques de D: ");
		    pointD.afficher();
		// Question 13
		pointD.setX(1);
		pointD.setY(-3);
		 System.out.println("Nouvelles caractéristiques de D: ");
		    pointD.afficher();
		// Question 14
		    Point pointE = new Point(4, 2, 'E');
			Point pointF = new Point(0, -2, 'F');
			Point pointG = new Point(2, 0, 'G');
			
		// Question 15
		if (pointE.estAligne(pointF, pointG)) {
			System.out.println("Les points sont alignés");
		}else{
			System.out.println("Les points ne sont pas alignés");
		}
		// Test de la classe Cercle
		// Question 1
			pointA.setX(2);
			pointA.setY(4);
			Cercle cercle1 = new Cercle(pointA, 5);
		// Question 2
			cercle1.afficher();
		// Question 3
			Cercle cercle2 = new Cercle(2);
		// Question 4
			cercle2.afficher();
		// Question 5
			Cercle cercle3 = new Cercle('E', 2, 3, 8);
		// Question 6
		    cercle3.afficher();
		// Question 7
		pointA.setX(0);
		pointA.setY(5);
		// Question 8
			cercle1.afficher();
		// Question 9
		if (cercle2.estSurCercle(pointG)) {
			System.out.println("Le point G est sur le cercle 2");
		}else{
			System.out.println("Le point G n'est pas sur le cercle 2");
		}
		// Test de la classe OutilsTriangle
		
		// Question 1
			System.out.println("Le perimetre du triangle ABC est : " + OutilsTriangle.perimetreTriangle(pointA, pointB, pointC));
		// Question 2
			System.out.println("Le perimetre du triangle ABC est : " + OutilsTriangle.perimetreTriangle(2, 4, 3, -2, -3, 3));
		// Question 3
			System.out.println("Le perimetre du triangle EFG : " + OutilsTriangle.perimetreTriangle(pointE, pointF, pointG));
		// Question 4
		   System.out.println("La marge d'erreur est : " + OutilsTriangle.DELTA);
		// Question 5
			if (OutilsTriangle.estIsocele(pointA, pointB, pointC)) {
				System.out.println("Ce triangle est isocèle");
			}else{
				System.out.println("Ce triangle n'est pas isocèle");
			}
		// Question 6
		  Point pointH = new Point(2, 4, 'H');
		  if (OutilsTriangle.estIsocele(pointH, pointG, pointE)) {
			System.out.println("Ce triangle est isocèle");
		}else{
			System.out.println("Ce triangle n'est pas isocèle");
		}
		  
		// Question 7
		Point pointI = new Point(0, 2, 'I');
		if (OutilsTriangle.estInscrit(pointF, pointG, pointI, cercle2)){
			System.out.println("Ce triangle est inscrit dans le cercle");
		}else{
			System.out.println("Ce triangle n'est pas inscrit dans le cercle");
		}
		// Question 8
			pointF.setX(2);
			pointF.setY(1);
			pointG.setX(4);
			pointG.setY(3);
			pointH.setX(4);
			pointH.setY(7);
			System.out.println("Coordonnées du sommet F : " + "(" + pointF.getX() + " ," + pointF.getY() + ")" );
            System.out.println("Coordonnées du sommet G : " + "(" + pointG.getX() + " ," + pointG.getY() + ")" );
			System.out.println("Coordonnées du sommet H : " + "(" + pointH.getX() + " ," + pointH.getY() + ")" );

	
			
		}

	}
