package taitamoh.tp03;

import java.util.*;
/**
 *  Super classe abstraite contenant
 * tout les types de courrier 
 * @author Mohamed Abdoulaye Taita
 */
public abstract class Courrier {
    protected int poids;
    private int optionEnvoi;
    protected static final int ENVOI_REGULIER = 1;
    protected static final int ENVOI_RAPIDE = 2;

    public Courrier(int poids, int optionEnvoi){
          this.poids = poids;
          this.optionEnvoi = optionEnvoi;
          setOptionEnvoi(optionEnvoi);
          setPoids(poids);
    }

    public void setPoids(int poids){
        boolean valide = false;

        if (this instanceof Colis) {
        valide = poids >= 500 && poids <=50000;
        }else if(this instanceof Lettre){
            valide = poids >= 0 && poids <= 500; 
        }else if (this instanceof Prospectus) {
            valide = poids >=0 && poids <=200;
        }

        if (valide) {
            this.poids = poids;
        }
    }

    public int getPoids(){
        return poids;
    }

    public void setOptionEnvoi(int optionEnvoi){
        if (optionEnvoi == ENVOI_REGULIER || optionEnvoi == ENVOI_RAPIDE) {
            this.optionEnvoi = optionEnvoi;
        }
    }

    public int getOptionEnvoi(){
        return optionEnvoi;
    }

    public abstract double calculerTarif();
    
    @Override
    public String toString(){
        String optionEnvoiStr;

     if (optionEnvoi == ENVOI_REGULIER) {
        optionEnvoiStr = "régulier";
     }else{
        optionEnvoiStr = "rapide";
     }
     return "Poids : " + poids + "\nOption d'envoi : " + optionEnvoiStr;
    }
}
