package taitamoh.exemplesclasses.exoCompo;

import java.util.GregorianCalendar;// pour utiliser la classe GregorianCalendar

public class DateNaissance {
	// constantes privees
	private static final int MIN_ANNEE = 1900;
	private static final int MIN_MOIS = 1;
	private static final int MAX_MOIS = 12;
	private static final int MIN_JOUR = 1;

	// Attributs
	private int jour;
	private int mois;
	private int annee;

	// constructeur par defaut
	public DateNaissance() {
		jour = 1;
		mois = 1;
		annee = 1900;
	}

	// constructeur avec 3 parametres
	public DateNaissance(int an, int ms, int jr) {
		if (dateValide(an, ms, jr)) {
			annee = an;
			mois = ms;
			jour = jr;

		}
		// ou bien modiferDate(an, ms, jr);
	}

	// Methode accesseur qui retourne l'annee
	public int getAnnee() {
		return annee;
	}

	// Methode accesseur qui retourne le mois
	public int getMois() {
		return mois;
	}

	// Methode accesseur qui retourne le jour
	public int getJour() {
		return jour;
	}

	// Methode mutateur qui modifie l'ann�e
	public void setAnnee(int an) {
		if (dateValide(an, mois, jour)) {
			this.annee = an;
		}
	}
	// Methode mutateur qui modifie le mois
	public void setMois(int ms) {
		if (dateValide(annee, ms, jour)) {
			mois = ms;
		}
	}
	// Methode mutateur qui modifie le jour
	public void setJour(int jr) {
		if (dateValide(annee, mois, jr)) {
			jour = jr;
		}
	}
	// Methode publique qui modifie la date: l'annee, le mois et le jour
	public void modifierDate(int an, int ms, int jr) {
		if (dateValide(an, ms, jr)) {
			annee = an;
			mois = ms;
			jour = jr;

		}
	}
	// Methode publique qui affiche la date
	public void afficherDate() {
		String message = jour + "/" + mois + "/" + annee;
		System.out.println(message);
	}
    // Methode privee qui recoit les 3 elements de la date en parametres: l'annee, le moi et le jour.
	// Elle retourne vrai si ces  3 elements forment une date valide et false sinon.
	private boolean dateValide(int an, int ms, int jr) {
		boolean valide = false;
		
		////crée un objet GregorianCalendar initialisé à la date courante
		GregorianCalendar dateAujourdhui = new GregorianCalendar();
		// obtenir l'annee courante
		int anneeCourante = dateAujourdhui.get(GregorianCalendar.YEAR);
		if (an >= MIN_ANNEE && an <= anneeCourante) {
			if (ms >= MIN_MOIS && ms <= MAX_MOIS) { 
				if (jr >= MIN_JOUR && jr <= determinerJourMaxMois(ms, an)) {
					valide = true;
				}
			}

		}
		return valide;
	}
	// Methode privee qui calcule et retourne le nombre maximum de jours dans un mois.
	private int determinerJourMaxMois(int ms, int an) {
		int[] tabMaxJours = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int nbJoursMois;
		GregorianCalendar calendar = new GregorianCalendar();
		nbJoursMois = tabMaxJours[ms - 1];
		// si c'est le mois de fevrier, verifier s'il s'agit d'une annee bissextile
		if (ms == 2 && calendar.isLeapYear(an)) {
			++nbJoursMois;
		}
		return nbJoursMois;
	}
} 