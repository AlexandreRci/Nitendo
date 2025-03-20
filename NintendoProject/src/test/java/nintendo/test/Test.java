package nintendo.test;

import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		
		Console ds = new Console("DS");
		Console play4 = new Console("Play4");
		Console wii = new Console("Wii");
		Console pc = new Console("PC");
		
		Jeu marioKartDs = new Jeu("Mario Kart", ds);
		Jeu marioKartWii = new Jeu("Mario Kart", wii);
		Jeu marioBros = new Jeu("Mario Bros", ds);
		Jeu farCry = new Jeu("Far Cry 4", play4);
		Jeu eldenRing = new Jeu("Elden Ring", pc);

	}

}
