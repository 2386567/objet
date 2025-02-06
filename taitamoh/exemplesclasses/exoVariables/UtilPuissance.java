package exemplesclasses.exoVariables;

public class UtilPuissance {
    private UtilPuissance(){

    }      
    public static double calculerCarre(double nombre){
      return nombre*nombre;
}
public static long calculerCarre(int nombre){
    return nombre*nombre;
}  
public static double calculerCube(double nombre){    
    return Math.pow(nombre, 3);
}
}  
