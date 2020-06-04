package fr.algorithmie;

/**
 * @author DIGINAMIC
 *
 */
public class FirstLast6 {

	/**
	 * Méthode exécutable
	 * 
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {

		// Déclaration du tableau
		int[] tab = { 4, 3, 6, 1, 6 };

		// Déclaration du booléen de résultat: on l'initialise à false et on ne teste
		// que le cas true
		boolean firstLast6 = false;

		// Réalisation du test true: si le tableau a au moins 1 élément ET (si le
		// premier élément OU le dernier élément vaut 6)
		if (tab.length >= 1 && (tab[0] == 6 || tab[tab.length - 1] == 6)) {
			firstLast6 = true;
		}

		System.out.println(firstLast6);
	}
}