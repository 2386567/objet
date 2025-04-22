package taitamoh.tp03;
/**
 * classe contenant un tbleau contanant les courriers
 * reçus dans le bureau de poste et le nombre 
 * de courrier dans le tableau
 * par prospectus
 * @author Mohamed Abdoulaye Taita
 */
public class ListeCourrier {
    private Courrier [] tabCourrier;
    private int nbCourriers;
    public ListeCourrier(int maxCourriers){
      this.tabCourrier = new Courrier[maxCourriers];
      this.nbCourriers = 0;
    }

    public int getNbcourriers(){
        return nbCourriers;
    }

    public Courrier [] getTabCourriers(){
        return tabCourrier;
    }

    public boolean ajouteCourrier(Courrier unCourrier){
        boolean ajout = false;
        if (nbCourriers < tabCourrier.length) {
            tabCourrier[nbCourriers] = unCourrier;
            nbCourriers++;
            ajout = true;
        }
        return ajout;

    }

    public double calculerSommeTarifCourrier(){
        double somme = 0.0;

        for (int i = 0; i < nbCourriers; i++) {
            somme += tabCourrier[i].calculerTarif();
        }
        return somme;
    }

    public void afficherCourrier(int typeCourrier){
        for (int i = 0; i < nbCourriers; i++) {
             Courrier c = tabCourrier[i];
             boolean afficherCourrier = false;

             switch (typeCourrier) {
                case 1:
                if (c instanceof Lettre && !(c instanceof Colis)) {
                    afficherCourrier = true;
                }
    
                  break;
                case 2:
                if (c instanceof Colis){    
                   afficherCourrier = true;
                }
                  break;
                case 3:
                if (c instanceof Prospectus) {
                    afficherCourrier = true;
                }
                  break;
                case 4:
                afficherCourrier = true;
                  break;  
                
                default:
                    System.out.println("Type de courrier non reconnu");
                  break;
             }
             if (afficherCourrier) {
                System.out.println(c);
             }

        }
        
    }
    public boolean estVide(){
        return nbCourriers == 0;
     }

     public boolean estPlein(){
        return nbCourriers == tabCourrier.length;
     }
     public int taille(){
        return nbCourriers;
     }
}
