package taitamoh.tp03;
/**
 * sous classe de la super classe 
 * courrier contenant l'option d'envoi
 * par Colis.
 * @author Mohamed Abdoulaye Taita
 */
public class Colis extends Courrier {
    private static final double TARIF_BASE = 7.59;
    private static final double TARIF_UNITAIRE = 0.35;
    private double largeur;
    private double hauteur;
    private String adrDestinataire;
    private String adrExpediteur;
    
    

    public Colis(int poids, int optionEnvoi, String adrDestinataire, String adrExpediteur, double hauteur, double largeur){
        super(poids, optionEnvoi);
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.adrDestinataire = adrDestinataire;
        this.adrExpediteur = adrExpediteur;
       
    }

    private double dimensionCumulee(){
        return hauteur + largeur;
    }

    @Override 
    public double calculerTarif(){
        double tarif= 0;
        double dimension = dimensionCumulee();
        double poids = 0;

        if (dimension > 200) {
            tarif = TARIF_BASE + TARIF_UNITAIRE * poids;
        }else{
            tarif = TARIF_BASE + TARIF_UNITAIRE * poids + 55;
        }

        if (getOptionEnvoi() == ENVOI_RAPIDE) {
            tarif *= 2;
        }
        return tarif;
    }

    @Override
    public String toString(){
        int type = getOptionEnvoi();
        String optionEnvoiStr;
    
        if (getOptionEnvoi() == ENVOI_REGULIER) {
           optionEnvoiStr = "régulier";
        }else{
           optionEnvoiStr = "rapide";
        }

        return "Colis: " + "\nAdresse de l'expéditeur : " + adrExpediteur
        + "\nAdresse du destinataire : " + adrDestinataire
        + "\nPoids : " + getPoids()
        + "\nOption d'envoi : " + optionEnvoiStr
        + "\nTarif : " + String.format("%.2f$", calculerTarif())  
        + "\nLargeur : " + largeur
        + "\nHauteur : " + hauteur 
        + "\nDimension cumulee : " + dimensionCumulee();
    
    }
}
