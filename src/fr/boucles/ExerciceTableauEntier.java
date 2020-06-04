package fr.boucles;

/**
 * Classe exécutable ExerciceTableauEntier<br>
 * <br>
 * Déclarez un tableau d’entiers contenant tous les entiers de 1 à 10<br>
 * Affichez le premier élément du tableau<br>
 * Affichez la longueur du tableau en utilisant la propriété length<br>
 * Affichez le dernier élément du tableau en utilisant la propriété length<br>
 * Modifiez la valeur de l’élément d’index 4 et donnez lui la valeur 8.<br>
 * <br>
 * 
 * @author DIGINAMIC
 *
 */
public class ExerciceTableauEntier {

	/**
	 * Méthode exécutable
	 * 
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {

		// Déclaration du tableau d'entiers
		int[] entiers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// Affichage du premier élément du tableau
		System.out.println("Le premier élément du tableau est : " + entiers[0]);

		// Affichage de la longueur du tableau en utilisant la propriété length
		System.out.println("La longueur du tableau est : " + entiers.length);

		// Affichage du dernier élément du tableau en utilisant la propriété length
		System.out.println("Le dernier élément du tableau est : " + entiers[entiers.length - 1]);

		// Modifiez la valeur de l’élément d’index 4 et donnez lui la valeur 8
		entiers[4] = 8;
	}

}
