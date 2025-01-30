package taitamoh.at01;

public class cercle{
private int h;
private int k;
private int rayon;

public int getRayon(){
return rayon;
}

public void setRayon(int r){
    this.rayon=r;
    if (r<0) {
        System.out.println("La valeur du rayon ne peut être négative");
    }
}



public cercle(int h, int k, int rayon){
    this.h=h;
    this.k=k;
    setRayon(rayon);
}
public cercle (int rayon){
  this(0,0,rayon);
}

public void modifier (int h, int k){
   this.h=h;
   this.k=k;
}
public double aire(){
    double rayon=getRayon();
    rayon=Math.PI*Math.pow(rayon, 2);
    return rayon;
}
public double perimetre(){
    return 2*Math.PI*rayon;
}
public void afficher(){
    System.out.println("Coordonnées X du centre : " + this.h);
    System.out.println("Coordonnées Y du centre : " + this.k);
    System.out.println("Le rayon du cercle: " + getRayon());
    System.out.println("Le périmètre du cercle: " + perimetre());
    System.out.println("L'aire du cercle: " + aire() );
    
}
public boolean estSurCercle(int x1, int y1){
        double coordonnées;
        coordonnées=Math.pow(x1 - h,2) + Math.pow(y1-k, 2);
        return coordonnées == Math.pow(rayon, 2);
        
}
}