package Matches;
import java.util.*;

public class Jeu {
	int nbAllumettes = 17;
	int nbJoueurs = 2;
	int nbInitialAllumettes = 17;
	
	public void afficherAllumettes() {
        System.out.print("Allumettes restantes : ");
        for (int i = 0; i < nbAllumettes; i++) {
            System.out.print("|");
        }
        System.out.println();
    }
	
	public void commencerJeu() {
        Joueur j = new Joueur();
        Ordinateur o = new Ordinateur();

        while (nbAllumettes > 0) {
            afficherAllumettes(); 

            int nbPlayer = j.propositionJoueur();
            int nbComp = o.propositionOrdinateur();
            
            if (nbPlayer >= 1 && nbPlayer <= 3) {
                nbAllumettes -= nbPlayer;
                if (nbAllumettes <= 0) {
                    nbAllumettes = 0;
                    System.out.println("Le joueur a gagné !");
                    break;
                }
            } else {
                System.out.println("Input invalide");
            }
            if (nbComp >= 1 && nbComp <= 3) {
                nbAllumettes -= nbComp;
                if (nbAllumettes <= 0) {
                    nbAllumettes = 0;
                    System.out.println("L'ordinateur a gagné !");
                    break;
                }
            }
            System.out.println("Vous avez choisi de retirer " + nbPlayer + " allumettes.");
            System.out.println("\nL'ordinateur a choisi de retirer " + nbComp + " allumettes.");
            System.out.println();
           
        }
    }
	
	public void menuJeu() {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu des allumettes !");
        System.out.println("Configurez le jeu :");
        System.out.print("Nombre initial d'allumettes (par défaut 17) : ");
        
        nbInitialAllumettes = scanner.nextInt();
        nbAllumettes = nbInitialAllumettes;
        
        System.out.print("Nombre de joueurs (1 ou 2, par défaut 2) : ");
        nbJoueurs = scanner.nextInt();
        
        while (true) {
            System.out.println("Nouvelle partie !");
            commencerJeu();

            System.out.print("Voulez-vous jouer une autre partie ? (Oui/Non) : ");
            String reponse = scanner.next();
            if (!reponse.equalsIgnoreCase("Oui")) {
                break;
            }
            nbAllumettes = nbInitialAllumettes;
        }
        
        System.out.println("Merci d'avoir joué !");
        
	}
}
