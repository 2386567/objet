package taitamoh.tp03;

import java.util.*;

/**
 * Sous classe de courrier contenant l'option
 * d'envoi par courrier
 * @author Mohamed Abdoulaye Taita
 */

public class Lettre extends Courrier {

    private String adrExpediteur;
    private String adrDestinataire;
    
public Lettre(int poids, int optionEnvoi, String adrExpediteur, String adrDestinataire){
    super(poids, optionEnvoi);
    this.adrExpediteur = adrExpediteur;
    this.adrDestinataire = adrDestinataire;
   

}



@Override
public double calculerTarif(){
    double poids = 0;
    double prix = 0 ;

    if (poids <= 30) {
        prix = 1.07;
    }else if (poids <=50) {
        prix = 1.30;
    }else if (poids <= 100 ) {
        prix = 1.94;
    }else if (poids <= 200) {
        prix = 3.19;
    }else if (poids <= 500) {
        prix = 5.47;
    }

    if (getOptionEnvoi() == ENVOI_RAPIDE) {
        prix *= 2;
    }
    return prix;
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

    return "Lettre : " +  "\n Adresse de l'expéditeur : " + adrExpediteur + "\nAdresse du destinataire : " + adrDestinataire +
    "\nPoids : " + poids + "\n Option d'envoi : " +type + "\nTarif : " + String.format("%.2f", calculerTarif() + "$");
}

}
