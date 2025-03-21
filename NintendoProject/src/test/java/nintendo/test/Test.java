package nintendo.test;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		
		Console ds = new Console("DS");
		Console play4 = new Console("Play4");
		Console wii = new Console("Wii");
		Console pc = new Console("PC");
		
		Adresse a1 = new Adresse(20, "rue de Paris", "Paris");
		
		Boutique bt = new Boutique("Micromania", a1);
		
		Jeu marioKartDs = new Jeu("Mario Kart", ds, bt);
		Jeu marioKartWii = new Jeu("Mario Kart", wii, bt);
		Jeu marioBros = new Jeu("Mario Bros", ds, bt);
		Jeu farCry = new Jeu("Far Cry 4", play4, bt);
		Jeu eldenRing = new Jeu("Elden Ring", pc, bt);

	}

}
