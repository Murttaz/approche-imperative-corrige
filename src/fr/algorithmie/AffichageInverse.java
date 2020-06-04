package fr.algorithmie;

/**
 * Exercice AffichageInverse
 * 
 * @author DIGINAMIC
 *
 */
public class AffichageInverse {

	/**
	 * Méthode exécutable
	 * 
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {

		// Déclaration du tableau
		int[] tab = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Déclaration d'une variable stockant la longueur du tableau (facultatif)
		int longtab = tab.length;

		// Afficher l’ensemble des éléments du tableau grâce à une boucle
		for (int i = 0; i < longtab; i++) {
			System.out.print(tab[i] + " ");
		}

		// Saut de ligne
		System.out.println();

		// Afficher l’ensemble des éléments dans l’ordre inverse du tableau
		for (int i = longtab - 1; i >= 0; i--) {
			System.out.print(tab[i] + " ");
		}

		// Créer un tableau arrayCopy et copier tous les éléments de array dans
		// arrayCopy
		int[] arrayCopy = new int[tab.length];
		for (int i = 0; i < longtab; i++) {
			arrayCopy[i] = tab[i];
		}

	}

}