package taitamoh.exemplesclasses.exoCompo;


public class TestPersonne {

	public static void main(String[] args) {
		// 1- Utilisez le constructeur a 5 parametres pour construire une premiere
		// personne
		Personne personne1=new Personne("Rene Lavallee", 72, 1982,05,11);
		// avec les caracteristiques suivantes:nom: Rene Lavallee Poids:72
		// dateNaissance: 1982/05/11
		// Affichez les informations de cette premiere personne
        personne1.afficherPersonne();
		
		// 2- Utilisez le constructeur a 3 parametres pour construire une deuxieme
		// personne
		Personne personne2=new Personne("Alain Roi",85,2000,03,25);
		// avec les caracteristiques suivantes:nom: Alain Roi Poids:85
		// dateNaissance:2000/03/25
		// Affichez les informations de cette deuxieme personne
        personne2.afficherPersonne();
		

		// 3- Affichez seulement l'ann�e de naissance de la deuxieme personne
		System.out.println("Année : "+personne2.getDateNaissance().getAnnee());

		// 4- Affichez seulement le mois de naissance de la deuxieme personne
		System.out.println("Année : "+personne2.getDateNaissance().getMois());

		
		// 5- Affichez seulement le jour de naissance de la deuxieme personne
	   System.out.println("Année : "+personne2.getDateNaissance().getJour());
	
		
		// 6- Affichez seulement la date de naissance complete de la deuxieme personne
		System.out.println("Année : "+personne2.getDateNaissance());
		
		// 7- Modifiez le jour de naissance de la deuxieme personne a 3
       personne2.getDateNaissance().setJour(3);

		// 8- Modifiez le mois de naissance de la deuxieme personne a 12
	   personne2.getDateNaissance().setMois(12);

		// 9- Modifiez l'ann�e de naissance de la deuxieme personne a 2003
	   personne2.getDateNaissance().setAnnee(2003);	
		
		// 10- Affichez toutes les caracteristiques de la deuxieme personne
		personne2.afficherPersonne();
		
		// 11- Modifiez le mois de naissance de la deuxieme personne a -1
		personne1.getDateNaissance().setMois(-1);
		// Affichez toutes les caracteristiques de la deuxieme personne pour verifier si
		// le changement a ete effectue
		personne2.afficherPersonne();
		
	}

}