package fr.algorithmie;

/**
 * Exercice FirstLast
 * 
 * @author DIGINAMIC
 *
 */
public class FirstLast {

	/**
	 * Méthode exécutable
	 * 
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {

		// Déclaration du tableau
		int[] tab = { 1, 3, 5, 1 };

		// déclaration de la variable firstLast qui va contrôler le tableau. Par
		// défaut on l'initialise à false.
		boolean firstLast = false;

		// On teste le cas true uniquement: vaut true si le tableau est de
		// longueur strictement supérieure à 1 et que le premier et le dernier
		// élément du tableau ont la même valeur
		if (tab.length > 0 && tab[0] == tab[tab.length - 1]) {
			firstLast = true;
		}

		System.out.println(firstLast);
	}

}