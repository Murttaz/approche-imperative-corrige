package fr.algorithmie;

/**
 * Exercice Rotation
 * 
 * @author DIGINAMIC
 *
 */
public class Rotation {

	/**
	 * Méthode exécutable
	 * 
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {

		// Déclaration d'un tableau exemple
		int[] tab = { 12, 4, 8, -1 };

		// Initialisation d'une variable tampon qui stocke l'élément le plus à droite
		int swap = tab[tab.length - 1];

		// décalage de tous les éléments vers la droite
		for (int i = tab.length - 2; i >= 0; i--) {
			tab[i + 1] = tab[i];
		}

		// Stockage à gauche de l'élément anciennement le plus à droite
		tab[0] = swap;

		// Affichage
		for (int valeur : tab) {
			System.out.print(valeur + " ");
		}

	}

}