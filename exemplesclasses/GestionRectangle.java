package sandbox.exemplesclasses;

//Cette classe contient les méthodes pour tester la classe Rectangle
public class GestionRectangle {

	public static void main(String[] args) {
		//déclarer 2 variables de la classe rectangle
		Rectangle rect1, rect2;
		
		// Construire un rectangle de longueur 7 et de largeur 4
		rect1 = new Rectangle(7, 4);
		
		// Afficher la référence (adresse mémoire) stockée danss rect1
		System.out.print("la référence du rectangle 1: ");
		System.out.println(rect1);// affiche Rectangle@6d06d69c

		// afficher la longueur de rect1
		System.out.print("la longueur du rectangle 1: ");
		System.out.println(rect1.getLongueur());
		
		// Modifier la longueur de rect1. La nouvelle longueur est 10
		rect1.setLongueur(10);
		
		// Afficher l'aire de rect1
		System.out.print("l'aire du rectangle 1: ");
		System.out.println(rect1.aireRectangle());
		
		// Afficher le perimetre de rect1
		System.out.print("le périmètre du rectangle 1: ");
		System.out.println(rect1.perimRectangle());
		
		// dessiner rect1 à la console en utilisant  le symbole *
		System.out.println("Représentation graphique du rectangle 1 utilisant le symbole *:");
		rect1.dessineRectangle('*');
		
		// afficher les caractéristiques de rect1
		System.out.println("Caractéristiques du rectangle 1");
		rect1.afficher();
		
		System.out.println("***************************************");
		
		//contruire un rectangle carré de côté 3
		rect2 = new Rectangle (3);
		
		//afficher la longueur de rect2
		System.out.println("la longueur du rectangle 2: ");
		rect2.getLongueur();
		
		//Afficher  les caractéristiques de rect2
		System.out.println("Caractéristiques du rectangle 2");
		rect2.afficher();
		
		//Afficher si rect 2 est un carré
		System.out.println("rect2 est carré?");
		System.out.println(rect2.estCarre());

	}

}
