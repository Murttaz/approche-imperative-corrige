package fr.algorithmie;

public class RechercheMin {

	/**
	 * Méthode exécutable
	 * 
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {

		// Déclaration du tableau
		int[] tab = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// On initialise la variable min avec la valeur contenue à l'index 0 dans la
		// tableau
		int min = Integer.MAX_VALUE;

		// On boucle à partir de l'index 1
		for (int i = 1; i < tab.length; i++) {

			// Si l'élément d'index i du tableau est inférieur à la valeur de la variable
			// min,
			// alors nous avons un nouveau min et il faut modifier la valeur de min en
			// conséquence.
			if (tab[i] < min) {
				min = tab[i];
			}
		}
		System.out.println(min);
	}
}