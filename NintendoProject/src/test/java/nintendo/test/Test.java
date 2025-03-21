package nintendo.test;

import nintendo.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import nintendo.model.Achat;
import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Hybride;
import nintendo.model.Jeu;
import nintendo.model.Portable;
import nintendo.model.Salon;

public class Test {

    public static void main(String[] args) {

        Console ds = new Portable("DS",100,LocalDate.of(2004,11,04));
        Console play4 = new Salon("Play4",100,LocalDate.of(2004,11,04));
        Console wii = new Salon("Wii",100,LocalDate.of(2004,11,04));
        Console pc = new Hybride("PC",500,LocalDate.of(2004,11,04));

		Adresse a1 = new Adresse(20, "rue de Paris", "Paris");
		Boutique bt = new Boutique("Micromania", a1);


		Jeu marioKartDs = new Jeu("Mario Kart", ds, bt);
		Jeu marioKartWii = new Jeu("Mario Kart", wii, bt);
		Jeu marioBros = new Jeu("Mario Bros", ds, bt);
		Jeu farCry = new Jeu("Far Cry 4", play4, bt);
		Jeu eldenRing = new Jeu("Elden Ring", pc, bt);


		List<Achat> listeAchat1 = new ArrayList();
		List<Achat> listeAchat2 = new ArrayList();

		Achat achat1 = new Achat(farCry, LocalDate.parse("2019-05-05"), "20");
		Achat achat2 = new Achat(eldenRing, LocalDate.parse("2019-03-05"), "20");
		Collections.addAll(listeAchat1,achat1,achat2);
		listeAchat2.add(achat2);

		Client c1 = new Client("Abid","Jordan",listeAchat1);
		Client c2 = new Client("Polka","Judy",listeAchat2);

	}

}
