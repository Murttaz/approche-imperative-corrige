package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int length = array.length;
		
		// Affichage de l'ensemble des �l�ments du tableau
		for (int i = 0; i < length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println(" ");
		
		// Affichage de l'ensemble des �l�ments dans l'ordre inverse du tableau
		int i = length - 1;
		while (i >= 0) {
			System.out.println(array[i]);
			i--;
		}
		
		// Cr�ation d'un tableau arrayCopy
		int[] arrayCopy = new int[length];
		
		// Copie de tous les �l�ments de array dans arrayCopy
		for (int j = 0; j < length; j++) {
			arrayCopy[j] = array[j];
		}

	}

}
