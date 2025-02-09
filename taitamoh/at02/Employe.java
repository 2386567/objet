package taitamoh.at02;

import taitamoh.at02.outills.Tableau;

public class Employe {
private String nom;
private String prenom;
private int [] notes = new int[4];

public void setNotes(int  [] newNotes){
    if (notes.length>4) {
        System.out.println("le tableau doit comporter 4 notes");
    }
    for (int note:newNotes) {
        if (note<0||note>100) {
        
        }
    }
   this.notes=newNotes; 
}
public Employe(int[] notes,String nom, String prenom){
setNotes(notes);
}
public void afficher(){
    System.out.println("Nom: " + nom);
    System.out.println("Prenom: " + prenom);
    System.out.println("notes: " + notes);
    float moyenne=Tableau.moyenne(notes);
    System.out.println("La moyenne des notes est " + moyenne);
    
    
}
public void notesSousMoyenne(){
    float moyenne=Tableau.moyenne(notes);

    if (moyenne<notes.length) {
        System.out.println("La moyenne des notes est " + moyenne);
        System.out.println("Les notes inférieures a la moyenne : " + moyenne );
    }
}
}

//< >
