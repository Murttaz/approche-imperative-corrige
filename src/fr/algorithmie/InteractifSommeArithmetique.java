package fr.algorithmie;

// Import de la classe Scanner
import java.util.Scanner;

/**
 * @author DIGINAMIC
 *
 */
public class InteractifSommeArithmetique {

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

		// On pose maintenant la question à l'utilisateur.
		int nb = entree.nextInt();

		// On déclare une variable qui va permettre de stocker la somme arithmétique
		int sommeArithm = 0;

		// On fait une boucle indexée de 1 au nombre sélectionné et on ajoute l'index à
		// la somme
		for (int i = 1; i <= nb; i++) {
			sommeArithm += i;
		}

		// On affiche le résultat final
		System.out.println("Somme arithmérique=" + sommeArithm);

		// On ferme le scanner
		entree.close();
	}

}