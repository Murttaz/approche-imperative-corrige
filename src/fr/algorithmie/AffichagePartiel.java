package fr.algorithmie;

/**
 * @author DIGINAMIC
 *
 */
public class AffichagePartiel {

	/**
	 * Méthode exécutable
	 * 
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {

		// Déclaration du tableau
		int[] tab = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Combiner une boucle et un test de manière à n’afficher que les entiers
		// supérieurs à 3
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > 3) {
				System.out.print(tab[i] + " ");
			}
		}

		// Saut de ligne
		System.out.println();

		// Combiner une boucle et un test de manière à n’afficher que les entiers pairs
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 2 == 0) {
				System.out.print(tab[i] + " ");
			}
		}

		// Saut de ligne
		System.out.println();

		// Combiner une boucle et un test de manière à n’afficher que les valeurs
		// correspondant aux index pairs
		for (int i = 0; i < tab.length; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		// Saut de ligne
		System.out.println();

		// Combiner une boucle et un test de manière à n’afficher que les entiers
		// impairs
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 2 == 1) {
				System.out.print(tab[i] + " ");
			}
		}

	}

}