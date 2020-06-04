package fr.algorithmie;

public class RechercheMax {

	/**
	 * Méthode exécutable
	 * 
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {

		// Déclaration du tableau
		int[] tab = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// On initialise la variable max avec la valeur contenue à l'index 0 dans la
		// tableau
		int max = tab[0];

		// On boucle à partir de l'index 1
		for (int i = 1; i < tab.length; i++) {

			// Si l'élément d'index i du tableau est supérieur à la valeur de la variable
			// max,
			// alors nous avons un nouveau max et il faut modifier la valeur de max en
			// conséquence.
			if (tab[i] > max) {
				max = tab[i];
			}
		}

		// Affichage du résultat final une fois la boucle terminée
		System.out.println(max);
	}

}
