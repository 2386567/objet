public class cours {
    private String code;
    private String titre;
    private int session;
    private int nbHeures;
    public cours(String pCode,String pTitre,int pSession,int pNbHeures){
        code=pCode;
        titre=pTitre;
        session=pSession;
        nbHeures=pNbHeures;
    }
    public void afficher(){
        System.out.println("Informations du cours : " + code);
        System.out.println("*************************************");
        System.out.println("Titre: " + titre);
        System.out.println("Session: " + session);
        System.out.println("Nombre d'heures par semaine: " + nbHeures);
    }
    public int nbHeuresSession(){
         return nbHeures * 15;
    }
}
