package taitamoh.tp03;
import java.util.*;
/**
 * classe qui permettra de gérer
 * les différents type de courriers
 * @author Mohamed Abdoulaye Taita
 */
public class GestionCourrier {
    public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);
    int choix = 0 ;
    double somme;
        ListeCourrier liste = new ListeCourrier(9);
        initialiserListeCourrier(liste);
        while (choix != 4){
            System.out.println("GESTION DES COURRIERS");
            System.out.println("1. Afficher les courriers");
            System.out.println("2. Ajouter un courrier");
            System.out.println("3. Afficher la somme de tous les tarifs des courriers");
            System.out.println("4. Quitter");
            System.out.println("Entrez votre choix: ");

            if (clavier.hasNextInt()) {

                choix = clavier.nextInt();
                clavier.nextLine();

                switch (choix) {
                    case 1:
                    afficherCourrier(liste);
                        
                        break;
                    case 2:
                    ajouterCourrier(liste);
                    
                        break;
                    case 3:
                    somme = liste.calculerSommeTarifCourrier();
                    System.out.print("Somme total tarif : %.2f$\n".formatted(somme));
                        break;
                    case 4:
                    System.out.println("Quitter");   
                        break; 
                
                    default: 
                    System.out.println("Choix invalide");
                        break;
                }
            }else{
                System.out.println("Choix pas valide");
            }
             
    }
    }

    public static void initialiserListeCourrier(ListeCourrier liste){
        liste.ajouteCourrier(new Lettre(25,2,"60 rue des Tulipes H7Y3S5","32 rue des Lilas H3B4J5"));
        liste.ajouteCourrier(new Lettre(55,1,"41 rue des Pinçons H8B2T6","38 rue des Oiseaux H5R3B2"));
        liste.ajouteCourrier(new Lettre(36, 2, "12 rue Dagenais H6D5A4","9 rue Delhi G2X3R2"));
        liste.ajouteCourrier(new Colis(550, 1, "24 rue Drapeau H1D3F5", "45 rue Renaissance H8Y3S5", 100.0, 50.0));
        liste.ajouteCourrier(new Colis(750, 2, "8 rue Péloquin H2B6G5", "13 rue Judith H6R3C4", 150.0, 90.0));
        liste.ajouteCourrier(new Prospectus(30, 2, "Resto FuPam", "H7X"));
        liste.ajouteCourrier(new Prospectus(50, 1, "Gym Fitness", "H2B"));

    }

    public static void afficherCourrier(ListeCourrier liste){
        Scanner clavier = new Scanner(System.in);
        int choix;
        

       System.out.println("AFFICHER LES COURRIERS");
       System.out.println("Entrez: ");
       System.out.println("1. pour afficher toutes les lettres,");
       System.out.println("2. pour afficher tous les colis,");
       System.out.println("3. pour afficher tous les prospectus");
       System.out.println("4. pour afficher tous les courriers:");
       System.out.println("Quel est votre choix?");
       choix = clavier.nextInt();

       if (choix >= 1 && choix <=4 ) {
          liste.afficherCourrier(choix);
       }else{
        System.out.println("Choix invalide");
       }


    }

    public static void ajouterCourrier(ListeCourrier liste){
        Scanner clavier = new Scanner(System.in);
        int choix;
        Courrier nouveauC = null;
        String adDest;
        String adExpd;
        int poidsLettre;
        int poidsColis;
        double hauteur;
        double largeur;
        int typeEnvoi;
        int poidsProspectus;
        String regionP;
        String titreP;
        boolean ajout = false;

       System.out.println("AJOUT D’UN COURRIER");
       System.out.println("Entrez: ");
       System.out.println("1. pour Lettre");
       System.out.println("2. pour Colis");
       System.out.println("3. pour Prospectus");
       System.out.println("Quel est votre choix?");
       choix = clavier.nextInt();
 
       if (choix >=1 && choix <= 3) {
        if (!liste.estPlein()){
            System.out.print("Entrez l'adresse du destinaitre: ");
            clavier.nextLine();
            adDest = clavier.nextLine();

            System.out.print("Entrez l'adresse de l'expéditeur: ");
            adExpd = clavier.nextLine();

            if (choix == 1) {
                System.out.print("Entrez le poids en grammes: ");
                poidsLettre = clavier.nextInt();
                clavier.nextLine();

                System.out.print("Choissisez le type d'envoi (express ou régulier): ");
                typeEnvoi = clavier.nextInt();

                nouveauC = new Lettre(poidsLettre, typeEnvoi, adExpd, adDest);

            }else if (choix == 2) {
                System.out.print("Entrez le poids en grammes: ");
                poidsColis = clavier.nextInt();
                clavier.nextLine();

                System.out.print("Choissisez le type d'envoi (express ou régulier): ");
                typeEnvoi = clavier.nextInt();

                clavier.nextLine();

                System.out.print("Entrez la Hauteur du colis en cm: ");
                hauteur = clavier.nextDouble();

                System.out.print("Entrez la Largeur du colis en cm: ");
                largeur = clavier.nextDouble();


                nouveauC = new Colis(poidsColis, typeEnvoi, adDest, adExpd, hauteur, largeur);

            }else if (choix == 3) {
                System.out.print("Entrez le poids propectus en gramme: ");
                poidsProspectus = clavier.nextInt();

                System.out.print("Choissisez le type d'envoi (express ou régulier): ");
                typeEnvoi = clavier.nextInt();

                clavier.nextLine();

                System.out.print("Entrez la région de livraison: ");
                regionP = clavier.next();

                System.out.print("Entrez le titre du prospectus: ");
                titreP = clavier.next();


                nouveauC = new Prospectus(poidsProspectus,typeEnvoi, regionP, titreP);

            }

            ajout = liste.ajouteCourrier(nouveauC);

            if (ajout) {
                System.out.println("Le courrier a été ajoute avec succes");
            }else{
                System.out.println("choix invalide");
            }
  
        }else{
            System.out.println("Impossible d'ajouter le courrier, la liste est plein");
        }
       }
      

    }


}
