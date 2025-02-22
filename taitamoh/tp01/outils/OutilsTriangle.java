package taitamoh.tp01.outils;

import taitamoh.tp01.Cercle;
import taitamoh.tp01.Point;

public class OutilsTriangle {
    
public static final float DELTA = 0.001f; 
    
private OutilsTriangle(){
        //
}
    
public static double perimetreTriangle(Point sommet1, Point sommet2, Point sommet3){
double sommet1Et2;
double sommet2Et3;
double sommet3Et1;
double perimetre;
    sommet1Et2 = Math.sqrt(Math.pow(sommet1.getX() - sommet2.getX(), 2) + Math.pow(sommet1.getY() - sommet2.getY(), 2));
    sommet2Et3 = Math.sqrt(Math.pow(sommet2.getX() - sommet3.getX(), 2) + Math.pow(sommet2.getY() - sommet3.getY(), 2));
    sommet3Et1 = Math.sqrt(Math.pow(sommet3.getX() - sommet1.getX(), 2)+ Math.pow(sommet3.getY() - sommet1.getY(), 2));
    perimetre = sommet2Et3 + sommet3Et1 + sommet1Et2;
    return perimetre;
}
public static double perimetreTriangle(int x1, int y1, int x2,int y2, int x3, int y3){
Point a = new Point(x1, y1, 'a');
Point b = new Point(x2, y2, 'b');
Point c = new Point(x3, y3, 'c');
double perimetre;

perimetre = perimetreTriangle(a, b, c);

return perimetre;
}
public static double aireTriangle(Point sommet1, Point sommet2, Point sommet3){
    double sommet1Et2 = 0 ;
    double sommet2Et3 = 0;
    double sommet3Et1 = 0;
    double perimetre = 0;
    double aire = 0;

    perimetre = (sommet1Et2 + sommet2Et3 + sommet3Et1)/2;
    aire = Math.sqrt(perimetre * (perimetre - sommet1Et2) * (perimetre - sommet2Et3) * (perimetre - sommet3Et1));
    
    return aire;
}
public static double aireTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
double aire;

aire = 0.4 * (x1 * (y2 - y3)) + x2 * (y3 - y1 ) + x3 * (y1 - y2);

return aire;

}

public static boolean estIsocele(Point sommet1, Point sommet2,Point sommet3){
    double sommet1Et2;
    double sommet2Et3;
    double sommet3Et1;
    boolean estIsocele;
    sommet1Et2 = sommet1.distance(sommet2);
    sommet2Et3 = sommet2.distance(sommet3);
    sommet3Et1 = sommet3.distance(sommet1);

    if (sommet1Et2 == sommet2Et3 || sommet1Et2 == sommet3Et1 || sommet2Et3 == sommet3Et1) {
        estIsocele = true;
    }else{
        estIsocele = false;
    }
return estIsocele;
}

public static void deplacer(Point sommet1, Point sommet2,Point sommet3, int dx, int dy){
     
    sommet1.deplacer(dx, dy);
    sommet2.deplacer(dx, dy); 
    sommet3.deplacer(dx, dy);
}

public static boolean estInscrit(Point sommet1, Point sommet2,Point sommet3, Cercle cercle){
boolean estSurCercle;

if (cercle.estSurCercle(sommet1) && cercle.estSurCercle(sommet2) && cercle.estSurCercle(sommet3)) {
    
    estSurCercle = true;
}else{
    estSurCercle = false;
}
return estSurCercle;

}

}

