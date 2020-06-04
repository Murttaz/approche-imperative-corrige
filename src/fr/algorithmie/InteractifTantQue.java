package fr.algorithmie;

// Import de la classe Scanner
import java.util.Scanner;

/**
 * @author DIGINAMIC
 *
 */
public class InteractifTantQue {

	/**
	 * Méthode exécutable
	 * 
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {

		// On initialise le scanner qui va nous servir à interagir avec l'utilisateur
		Scanner entree = new Scanner(System.in);

		// On initialise la variable qui va nous servir à tester si le nombre est entre
		// 1 et 10 ou non
		boolean conditionArret = false;

		// On déclare la variable nb qui va permettre de stocker la valeur saisie par
		// l'utilisateur
		int nb = 0;
		do {

			// On affiche le message précisant que l'utilisateur doit saisir un nombre
			System.out.println("Saisissez un nombre:");

			// On pose maintenant la question à l'utilisateur. La méthode nextInt() reste en
			// attente tant
			// que l'utilisateur n'a pas saisi un nombre au clavier et appuyé sur la touche
			// "Enter"
			nb = entree.nextInt();

			// On teste ensuite si ce nombre est entre 1 et 10
			if (nb >= 1 && nb <= 10) {
				conditionArret = true;
			}
		}
		// Tant que nous n'avons pas notre condition réalisée nous continuons la boucle
		while (!conditionArret);

		// On affgiche le résultat final
		System.out.println(nb);
		entree.close();
	}

}