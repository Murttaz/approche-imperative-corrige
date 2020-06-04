package fr.boucles;

/**
 * Classe exécutable ExerciceBouclesEtTests<br>
 * <br>
 * Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7,
 * -1, 17, 2, 3, 0, 14, -4} ; <br>
 * Afficher l’ensemble des éléments du tableau grâce à une boucle <br>
 * Afficher l’ensemble des éléments dans l’ordre inverse du tableau <br>
 * Combiner une boucle et un test de manière à n’afficher que les entiers
 * supérieurs à 3 <br>
 * Combiner une boucle et un test de manière à n’afficher que les entiers pairs
 * <br>
 * Combiner une boucle et un test de manière à n’afficher que valeurs des index
 * pairs <br>
 * Combiner une boucle et un test de manière à n’afficher que les entiers
 * impairs <br>
 * <br>
 * 
 * @author RichardBONNAMY
 *
 */
public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		// Déclaration du tableau
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Afficher l’ensemble des éléments du tableau grâce à une boucle
		System.out.println("Elements du tableau:");
		System.out.println("--------------------");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		// Sauts de ligne
		System.out.println();
		System.out.println();

		// Afficher l’ensemble des éléments dans l’ordre inverse du tableau
		System.out.println("Elements du tableau dans l'ordre inverse:");
		System.out.println("-----------------------------------------");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

		// Sauts de ligne
		System.out.println();
		System.out.println();

		// Combiner une boucle et un test de manière à n’afficher que les entiers
		// supérieurs à 3
		System.out.println("Elements du tableau supérieurs à 3:");
		System.out.println("-----------------------------------");
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 3) {
				System.out.print(array[i] + " ");
			}
		}

		// Sauts de ligne
		System.out.println();
		System.out.println();

		// Combiner une boucle et un test de manière à n’afficher que les entiers pairs
		System.out.println("Elements du tableau pairs:");
		System.out.println("--------------------------");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}

		// Sauts de ligne
		System.out.println();
		System.out.println();

		// Combiner une boucle et un test de manière à n’afficher que les entiers pairs
		System.out.println("Elements du tableau d'index pairs:");
		System.out.println("----------------------------------");
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}

		// Sauts de ligne
		System.out.println();
		System.out.println();

		// Combiner une boucle et un test de manière à n’afficher que les entiers pairs
		System.out.println("Elements du tableau impairs:");
		System.out.println("----------------------------");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
