package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		
		/*
		Création d'un tableau contenant la somme des tableaux array1 et array2
		et calcul de celui-ci si et seulement si les 2 tableaux initiaux sont de taille identique
		*/
		int[] arraySomme = new int[array1.length];
		
		if (array1.length == array2.length) {
			for (int i = 0; i < arraySomme.length; i++) {
				arraySomme[i] = array1[i] + array2[i];
			}
		}

	}

}
