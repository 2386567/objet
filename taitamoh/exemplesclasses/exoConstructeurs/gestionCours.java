package taitamoh.exemplesclasses.exoConstructeurs;

public class gestionCours{
public static void main(String[] args) {
    cours zc6 = new cours ("420-ZC6-MO","algorithmie et programmation",1,6);
    cours zh5=  new cours ("420-ZH5-MO","Base de données",3,5);
    // Afficher informations du cours zc6
    zc6.afficher();
    zh5.afficher();
}  
}