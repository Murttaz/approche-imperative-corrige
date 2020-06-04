package fr.algorithmie;

// Import de la classe Scanner
import java.util.Scanner;

/**
 * Exercice InteractifChiffresSuivants
 * 
 * @author DIGINAMIC
 *
 */
public class InteractifChiffresSuivants {

	/**
	 * Méthode exécutable
	 * 
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {

		// On initialise le scanner qui va nous servir à interagir avec l'utilisateur
		Scanner entree = new Scanner(System.in);

		// On affiche le message précisant que l'utilisateur doit saisir un nombre
		System.out.println("Saisissez un nombre:");

		// On pose maintenant la question à l'utilisateur. La méthode nextInt() reste en
		// attente
		// tant que l'utilisateur n'a pas saisi un nombre au clavier et appuyé sur la
		// touche "Enter"
		// Une fois que l'utilisateur a appuyé sur Enter le nombre ainsi saisi est
		// stocké dans
		// la variable nb
		int nb = entree.nextInt();

		// On fait une boucle indexée de 1 à 10 et on affiche le résultat de la somme du
		// nombre avec
		// l'index de la boucle
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + nb);
		}

		// On ferme le scanner
		entree.close();
	}
}