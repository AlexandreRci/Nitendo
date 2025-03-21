package nintendo.model;

import java.util.List;

public class Client {
    private String nom;
    private String prenom;
    private List<Achat> listeAchat;
    
    
	public Client(String nom, String prenom, List<Achat> listeAchat) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.listeAchat = listeAchat;
	}


	public String getNom() {
		return nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public List<Achat> getListeAchat() {
		return listeAchat;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public void setListeAchat(List<Achat> listeAchat) {
		this.listeAchat = listeAchat;
	}


	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + "]";
	}

}