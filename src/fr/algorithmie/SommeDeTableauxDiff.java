package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};
		
		int minLength = 0; // initialisation de la plus petite longueur des 2 tableaux
		
		// Calcul de la plus petite longueur des 2 tableaux
		if (array1.length < array2.length) {
			minLength = array1.length;
		}
		else {
			minLength = array2.length;
		}
		
		// Création d'un tableau qui contient la somme des 2 précédents tableaux
		int[] arraySomme = new int[minLength];
		for (int i = 0; i < minLength; i++) {
			arraySomme[i] = array1[i] + array2[i];
		}

	}

}
