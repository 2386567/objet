package taitamoh.at01;

import java.util.Scanner;

public class MainProduit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        produit prod1 = new produit("Hilroy Feuilles mobiles lignées 200 Feuilles et un prix de ", 2.47);
        produit prod2 = new produit("Hilroy Cahiers d'exercices Canada 32 pages et un prix de ", 1.86);
        System.out.println("Accès à la description de prod1: " + prod1.getDescription());
        System.out.println("Accès au prix de prod1: " + prod1.getPrix());
        prod1.setPrix(3.25);
        prod1.setDescription("Hilroy Feuilles mobiles carreaux 250 Feuilles");
        prod1.afficher();
        double prixApresRabais = prod1.prixApresRabais(20.0);
        System.out.println("Prix après rabais de 20.0% de prod1: " + prixApresRabais);
        double totalPrix = prod1.getPrix() + prod2.getPrix();
        System.out.println("Le total des prix de prod1 et de prod2:  " + totalPrix);

    }

}
