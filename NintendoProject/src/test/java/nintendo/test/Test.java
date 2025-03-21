package nintendo.test;

import nintendo.model.*;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        Console ds = new Portable("DS",100,LocalDate.of(1,11,2004));
        Console play4 = new Salon("Play4",100,LocalDate.of(1,11,2004));
        Console wii = new Salon("Wii",100,LocalDate.of(1,11,2004));
        Console pc = new Hybride("PC",500,LocalDate.of(1,11,2004));

		Boutique boutique = new Boutique("Micromaniac", new Adresse(1,"Mouffetard", "Paris"));


		Jeu marioKartDs = new Jeu("Mario Kart", ds, boutique);
        Jeu marioKartWii = new Jeu("Mario Kart", wii, boutique);
        Jeu marioBros = new Jeu("Mario Bros", ds, boutique);
        Jeu farCry = new Jeu("Far Cry 4", play4, boutique);
        Jeu eldenRing = new Jeu("Elden Ring", pc, boutique);

	}

}
