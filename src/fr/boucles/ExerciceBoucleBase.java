package fr.boucles;

/**
 * Affichez tous les nombres de 1 à 10,<br>
 * Affichez 20 fois votre nom et votre prénom,<br>
 * Affichez les éléments pairs de 2 à 100,<br>
 * Affichez les éléments impairs de 1 à 99
 *
 * @author RichardBONNAMY
 *
 */
public class ExerciceBoucleBase {

	/**
	 * Méthode exécutable
	 * 
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {

		// Affichez tous les nombres de 1 à 10
		System.out.println("Tous les nombres de 1 à 10:");
		System.out.println("---------------------------");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}

		// Sauts de ligne
		System.out.println();
		System.out.println();

		// Affichez 20 fois votre nom et votre prénom
		System.out.println("Affichez 20 fois votre nom et votre prénom:");
		System.out.println("-------------------------------------------");
		for (int i = 1; i <= 20; i++) {
			System.out.println("Luc MARCEL");
		}

		// Sauts de ligne
		System.out.println();
		System.out.println();

		// Affichez les éléments pairs de 2 à 100
		System.out.println("Affichez les éléments pairs de 2 à 100:");
		System.out.println("---------------------------------------");
		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
		}

		// Sauts de ligne
		System.out.println();
		System.out.println();

		// Affichez les éléments pairs de 2 à 100
		System.out.println("Affichez les éléments impairs de 1 à 99:");
		System.out.println("---------------------------------------");
		for (int i = 1; i <= 99; i += 2) {
			System.out.print(i + " ");
		}
	}

}
