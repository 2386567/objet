package taitamoh.tp03;
/**
 * sous classe de la super classe 
 * courrier contenant l'option d'envoi
 * par prospectus
 * @author Mohamed Abdoulaye Taita
 */
public class Prospectus extends Courrier{
    private String titre;
    private String region;

    public Prospectus(int poids, int optionEnvoi, String region, String titre){
        super(poids, optionEnvoi);
        this.titre = titre;
        this.region = region;

    }

  

    @Override
    public double calculerTarif(){
        double tarif= 0;
        double poids = 0;
      
        if (poids <=50 ) {
            tarif = 0.35;
        }else if (poids <= 200) {
            tarif = 0.65;
        }

        if (getOptionEnvoi() == 2 ) {
            tarif *=2;
        }
        return tarif;

    }

    @Override
    public String toString(){
        int type = getOptionEnvoi();
        String optionEnvoiStr;
    
        if (type== ENVOI_REGULIER) {
           optionEnvoiStr = "régulier";
        }else{
           optionEnvoiStr = "rapide";
        }
    return "Prospectus : " + "\nPoids : " + poids + "\nOption d'envoi : " + getOptionEnvoi() + "\nTarif : " + String.format("%.2f", calculerTarif() + "$") +
    "\nTitre : " +  titre + "\nRegion : " + region;
    }
}
