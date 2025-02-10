package taitamoh.at02;

import taitamoh.at02.outills.Tableau;

public class MainTableau {
    public static void main(String[] args) {
//Tableau tab = new Tableau(); car tableau est une méthode statique
int [] notes = {50,48,90,60,43,96};
float moyenne=Tableau.moyenne(notes);
Employe Belanger = new Employe(notes, "Belanger", "Claude");
Belanger.afficher();
Belanger.notesSousMoyenne();
}
}