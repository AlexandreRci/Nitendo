package nintendo.model;

public class Boutique {
	
	protected String nom;
	protected String adresse;
	
	
	public Boutique(String nom, String adresse) {
		this.nom = nom;
		this.adresse = adresse;
	}


	public String getNom() {
		return nom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String toString() {
		return "Boutique [nom=" + nom + ", adresse=" + adresse + "]";
	}

	
}

