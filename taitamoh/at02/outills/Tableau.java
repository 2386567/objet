package taitamoh.at02.outills;

public class Tableau {
   private Tableau(){
    
}
public static float moyenne(int tabNotes []){
    int note;
    if (tabNotes.length==0) {
        note = 0;
    }
    int somme=0;
    for (int notes : tabNotes) {
        somme+=notes;
    }
        return somme/tabNotes.length;
}
}
