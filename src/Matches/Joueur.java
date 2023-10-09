package Matches;

import java.util.*;

public class Joueur {
    public int propositionJoueur() {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int nbPlayer = 0;
        boolean ok = false;

        System.out.println("Joueur, choisissez un chiffre entre 1 et 3 : ");
            
        while (!ok) {
            nbPlayer = sc.nextInt();
            if (nbPlayer < 1 || nbPlayer > 3) {
                System.out.println("Veuillez choisir un nombre entre 1 et 3");
            } else {
                ok = true;
            }
        }
        return nbPlayer;
        
    }
}

