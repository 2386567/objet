package taitamoh.tp01;

/**
 * Cette classe représente un point sur un plan cartésien
 * @author Taita, Mohamed Abdoulaye 
 */

public class Point {
    private int x;
    private int y;
    private char nom;


public Point(){
    this.x = 0;
    this.y = 0;
    this.nom = 'O';
}   
public Point(int x, int y, char nom){
this.x = x;
this.y = y;
this.nom = nom;
System.out.println("("+x+","+y+")");

} 
public int getX(){
return x;
} 
public void setX(int x){
this.x = x;
} 
public int getY(){
    return y;
} 
public void setY(int y){
    this.y = y;
} 
public char getNom(){
    return nom;
} 
public void setNom(char nom){
    this.nom = nom;
} 
public String coordonnees(){
    String coordonnees;
   coordonnees = nom + "(" + x + ", " + y + ")";
   return coordonnees;
} 
private String numeroQuandrant(){
    String numeroQuadrant="";
if (x > 0 && y > 0) {
   numeroQuadrant = ("1ier quadrant");
}else if (x < 0 && y > 0) {
    numeroQuadrant = ("2ième quadrant");   
}else if (x < 0 && y < 0) {
    numeroQuadrant = ("3ième quadrant");
}else if (x > 0 && y < 0) {
    numeroQuadrant = ("4ième quadrant");
}else {
    numeroQuadrant=("sur axe(s)");
}
return numeroQuadrant;
} 
public void afficher(){
    System.out.println("Point " + coordonnees());
    System.out.println("Position dans le plan cartesien: " + numeroQuandrant() );
} 
public double distance(Point autrePoint){
double distance;
distance = Math.sqrt(Math.pow(autrePoint.x - this.x, 2) + Math.pow(autrePoint.y - this.y, 2));
return (int) (distance * 100 ) / 100.0;
} 
public void deplacer(int dx, int  dy){
this.x+=dx;
this.y+=dy;
} 
public boolean estAligne(Point autrePoint1, Point autrePoint2){
    boolean estAligne;
    if (autrePoint2 ==  null) {
        estAligne = true;
    }
int aire;
aire = this.x * (autrePoint1.y - autrePoint2.y) + autrePoint1.x * (autrePoint2.y - this.y) + autrePoint1.x * (autrePoint2.y - this.y)+
autrePoint2.x * (this.y - autrePoint1.y);

return aire == 0;
} 
} 

