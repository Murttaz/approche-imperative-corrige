package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		
		// Choix d'un nombre al�atoire entre 1 et 100
		int secretNb = new Random().nextInt(100) + 1;
		
		// Cr�ation d'une variable saisie de type Scanner
		Scanner saisie = new Scanner(System.in);
						
		// Demande � l'utilisateur de trouver le nombre
		System.out.println("Veuillez saisir un nombre compris entre 1 et 100 et appuyer sur la touche Return :");
						
		// Stockage de la valeur saisie par l'utilisateur dans une variable nb
		int nb = saisie.nextInt();
		
		// Initialisation � 1 du nombre de coups tent�s par l'utilisateur
		int N = 1;
		
		/*
		 * Le programme r�pond � l'utilisateur s'il est au-dessus ou en-dessous du nombre
		 * ou s'il a trouv� le nombre et lui affiche alors le nombre d'essais effectu�s
		 * pour trouver ce nombre
		 */
		if (nb == secretNb) { // l'utilisateur trouve le nombre du premier coup
			saisie.close(); // fermeture de la saisie
			System.out.println("Bravo, vous avez trouv� en 1 coup");
		}
		else { // l'utilisateur ne trouve pas le nombre du premier coup
			do {
				if (nb < secretNb) { // l'utilisateur est en-dessous du nombre � trouver
					System.out.println("Vous �tes en-dessous du nombre � trouver");
					nb = saisie.nextInt();
					N++;
				}
				else if (nb > secretNb) { // l'utilisateur est au-dessus du nombre � trouver
					System.out.println("Vous �tes au-dessus du nombre � trouver");
					nb = saisie.nextInt();
					N++;
				}
				else { // l'utilisateur a trouv� le nombre
					saisie.close(); // fermeture de la saisie
				}
			} while (nb != secretNb); // tant que l'utilisateur ne trouve pas le nombre
			System.out.println("Bravo, vous avez trouv� en " + N + " coups");
		}

	}

}
