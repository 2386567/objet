package taitamoh.exemplesclasses.exoCompo;


public class TestDate {

	public static void main(String[] args) {
		//creer un objet  date1 qui vaut : 30 janvier 2020
	DateNaissance date1= new DateNaissance(2020,1,30);

		
		//afficher le mois de date1
	System.out.println("Mois: "+date1.getMois());	
		
		// afficher la date au complet 
		date1.afficherDate();
		
		// modifier l'annee de date1 avec 2019. Affichez cette nouvelle valeur.
		date1.setAnnee(2019);
		date1.afficherDate();
		// que se passe t-il si vous modifiez le mois de date avec 13
		
		
		//creer un objet  date2 non valide qui vaut : 30 fevrier 2022. Afficher cette date.
		DateNaissance date2 = new DateNaissance(2022,2,30);
        date2.afficherDate();
		
	}

}
