package nintendo.test;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Console;
import nintendo.model.Hybride;
import nintendo.model.Jeu;
import nintendo.model.Portable;
import nintendo.model.Salon;

public class Test {

	public static void main(String[] args) {
		
		Console ds = new Portable("DS");
		Console play4 = new Salon("Play4");
		Console wii = new Salon("Wii");
		Console pc = new Hybride("PC");
		
		Adresse a1 = new Adresse(20, "rue de Paris", "Paris");
		
		Boutique bt = new Boutique("Micromania", a1);
		
		Jeu marioKartDs = new Jeu("Mario Kart", ds, bt);
		Jeu marioKartWii = new Jeu("Mario Kart", wii, bt);
		Jeu marioBros = new Jeu("Mario Bros", ds, bt);
		Jeu farCry = new Jeu("Far Cry 4", play4, bt);
		Jeu eldenRing = new Jeu("Elden Ring", pc, bt);

	}

}
