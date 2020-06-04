package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

/**
 * @author DIGINAMIC
 *
 */
public class InteractifPlusMoins {

	/**
	 * Méthode exécutable
	 * 
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {

		// On initialise le scanner qui va nous servir à interagir avec l'utilisateur
		Scanner scan = new Scanner(System.in);

		// On génère un nombre aléatoire entre 1 et 100 qu'on stocke dans secretNb
		int secretNb = new Random().nextInt(100) + 1;

		// On affiche la règle du jeu.
		System.out.println("Vous devez trouver un nombre compris entre 1 et 100 choisi au hasard par le programme.");

		// On initialise le nombre de coups à 0
		int nbCoups = 0;

		// On initialise la condition de fin de jeu
		boolean trouve = false;

		// On rentre dans une boucle infinie tant que l'utilisateur n'a pas trouvé le
		// nombre secret
		do {

			// On affiche un message invitant l'utilisateur à saisir une valeur au clavier
			System.out.println("Choisissez un nombre entre 1 et 100:");

			// On attend la saisie de l'utilisateur et on la stocke dans nb
			int nb = scan.nextInt();

			// Si ce nombre est le nombre secret alors on positionne la variable trouve à
			// true
			if (nb == secretNb) {
				trouve = true;
			} else {
				// Sinon on compare la saisie de l'utilisateur au nombre secret pour lui
				// afficher
				// un message d'aide
				if (nb > secretNb) {
					System.out.println("C'est moins !");

				} else {
					System.out.println("C'est plus !");
				}
			}
			// Quelle que soit la saisie effectuée par l'utilisateur on ajoute 1 au nombre
			// de coups
			nbCoups++;

		} while (!trouve);

		// Lorsqu'on sort de la boucle, on affiche le nombre de coups
		System.out.println("Bravo, vous avez trouvé en " + nbCoups + " coups");

		// On ferme le scanner
		scan.close();
	}

}