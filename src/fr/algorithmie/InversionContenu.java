package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		
		// Cr�ation d'un tableau arrayCopy
		int[] arrayCopy = new int[array.length];
		
		// Copie de tous les �l�ments de array dans arrayCopy dans l'ordre inverse
		for (int i = array.length - 1; i >= 0; i--) {
			arrayCopy[i] = array[i];
		}
		
		// Affichage de l'ensemble des �l�ments des 2 tableaux
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println(" ");
		
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.println(arrayCopy[i]);
		}

	}

}
