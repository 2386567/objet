package taitamoh.tp01;

public class Cercle {
    private int rayon;
    private Point centre;
    
    public int getRayon(){
        return rayon;
    }
    public void setRayon(int r){
     if (r < 0){ 
        System.out.println("La valeur du rayon ne peut être négative");
    } else{
        rayon = r;
        }   
    }   
     public Cercle(Point centre, int rayon){
        this.centre = centre;
          setRayon(rayon);
      
    }
    public Cercle(int rayon){
     this(new Point(0, 0, 'O'), rayon);
    }
    public Cercle (char nom, int x, int y, int rayon){
        this(new Point(x, y, nom), rayon);
    }
    public double aire(){
       double aire;
       aire = Math.PI * Math.pow(rayon, 2) ;
       return aire;
    }
    public double perimetre(){
    double perim;
    perim = 2 * Math.PI * rayon ;
    return perim;
}
public void deplacer(int dx, int dy){
    deplacer(dx, dy);
}
public void afficher(){
    System.out.println("Nom du centre : " + centre.getNom());
    System.out.println("Coordonnées X du centre : " + centre.getX());
    System.out.println("Coordonnées Y du centre : " + centre.getY());
    System.out.println("Le rayon du cercle: " + rayon);
    System.out.println("Le périmètre du cercle: " + perimetre());
    System.out.println("L'aire du cercle: " + aire());
}
public boolean estSurCercle(Point point){
    double distanceAuCarre;
    double rayonCarre;
    boolean resultat;
    int x;
    int y;
    int centreX; 
    int centreY;
    x = point.getX();
    y = point.getY();
    centreX = centre.getX();
    centreY = centre.getY();
   distanceAuCarre = Math.pow(x - centreX, 2) + Math.pow(y - centreY, 2); 
    rayonCarre = Math.pow(rayon, 2);

    if (distanceAuCarre == rayonCarre) {
        resultat = true;
    }else{
        resultat = false;
    }
    return resultat;
}
}
//><,|