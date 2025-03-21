package nintendo.model;

import java.time.LocalDate;

public class Achat {
	
	private Jeu jeu;
	private LocalDate date;
	private String prix;
	
	
	public Achat(Jeu jeu, LocalDate date, String prix) {
		super();
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
	}


	public Jeu getJeu() {
		return jeu;
	}


	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public String getPrix() {
		return prix;
	}


	public void setPrix(String prix) {
		this.prix = prix;
	}


	@Override
	public String toString() {
		return "Achat [jeu=" + jeu + ", date=" + date + ", prix=" + prix + "]";
	}
	

}
