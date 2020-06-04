package fr.algorithmie;

/**
 * Exercice InversionContenu
 * 
 * @author DIGINAMIC
 *
 */
public class InversionContenu {

	/**
	 * Méthode exécutable
	 * 
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {

		// Déclaration du tableau
		int[] tab = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Créer un tableau arrayCopy
		int[] arrayCopy = new int[tab.length];

		// Copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse
		for (int i = 0; i < arrayCopy.length; i++) {
			arrayCopy[i] = tab[tab.length - 1 - i];
		}

		// Afficher l’ensemble des éléments des 2 tableaux
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.println("Valeur tableau initial=" + tab[i] + " \t| Valeur arrayCopy=" + arrayCopy[i]);
		}
	}
}