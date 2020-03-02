package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		
		// Choix d'un nombre aléatoire entre 1 et 100
		int secretNb = new Random().nextInt(100) + 1;
		
		// Création d'une variable saisie de type Scanner
		Scanner saisie = new Scanner(System.in);
						
		// Demande à l'utilisateur de trouver le nombre
		System.out.println("Veuillez saisir un nombre compris entre 1 et 100 et appuyer sur la touche Return :");
						
		// Stockage de la valeur saisie par l'utilisateur dans une variable nb
		int nb = saisie.nextInt();
		
		// Initialisation à 1 du nombre de coups tentés par l'utilisateur
		int N = 1;
		
		/*
		 * Le programme répond à l'utilisateur s'il est au-dessus ou en-dessous du nombre
		 * ou s'il a trouvé le nombre et lui affiche alors le nombre d'essais effectués
		 * pour trouver ce nombre
		 */
		if (nb == secretNb) { // l'utilisateur trouve le nombre du premier coup
			saisie.close(); // fermeture de la saisie
			System.out.println("Bravo, vous avez trouvé en 1 coup");
		}
		else { // l'utilisateur ne trouve pas le nombre du premier coup
			do {
				if (nb < secretNb) { // l'utilisateur est en-dessous du nombre à trouver
					System.out.println("Vous êtes en-dessous du nombre à trouver");
					nb = saisie.nextInt();
					N++;
				}
				else if (nb > secretNb) { // l'utilisateur est au-dessus du nombre à trouver
					System.out.println("Vous êtes au-dessus du nombre à trouver");
					nb = saisie.nextInt();
					N++;
				}
				else { // l'utilisateur a trouvé le nombre
					saisie.close(); // fermeture de la saisie
				}
			} while (nb != secretNb); // tant que l'utilisateur ne trouve pas le nombre
			System.out.println("Bravo, vous avez trouvé en " + N + " coups");
		}

	}

}
