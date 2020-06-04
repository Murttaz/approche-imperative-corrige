package fr.algorithmie;

// Import de la classe Scanner
import java.util.Scanner;

/**
 * @author DIGINAMIC
 *
 */
public class InteractifPlusGrand {

	/**
	 * Méthode exécutable
	 * 
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {

		// On initialise le scanner qui va nous servir à interagir avec l'utilisateur
		Scanner entree = new Scanner(System.in);

		// On initialise la variable max avec la valeur la plus petite possible
		int max = Integer.MIN_VALUE;

		// On exécute une boucle de 10 répétitions
		for (int i = 0; i < 10; i++) {

			// On affiche un message invitant l'utilisateur à saisir une valeur au clavier
			System.out.println("Saisisssez un nombre:");

			// On attend la saisie de l'utilisateur et on la stocke dans nb
			int nb = entree.nextInt();

			// Si nb est plus grand que max, alors max vaut désormais nb
			if (nb > max) {
				max = nb;
			}
		}

		System.out.println("La valeur la plus grande saisie est :" + max);
		entree.close();
	}
}