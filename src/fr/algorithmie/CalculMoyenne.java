package fr.algorithmie;

/**
 * Exercice CalculMoyenne
 * 
 * @author DIGINAMIC
 *
 */
public class CalculMoyenne {

	/**
	 * Méthode exécutable
	 * 
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {

		// Déclaration du tableau
		int[] tab = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Déclarations des variables somme et moyenne
		int somme = 0;
		float moyenne = 0.0f;

		// On calcule la somme de tous les éléments via une boucle
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}

		// Puis on calcule la moyenne en divisant la somme précédente par le nombre
		// d'éléments du tableau
		moyenne = (float) somme / (float) tab.length;

		// Affichage de la moyenne
		System.out.println(moyenne);
	}

}