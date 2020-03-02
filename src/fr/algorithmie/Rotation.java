package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		
		int[] array = {2, -5, 10, 8, -1, 6}; // tableau d'entiers
		
		// Initialisation d'une variable allant prendre pour valeur la derni�re valeur du tableau
		int lastValue = array[array.length-1];
		
		// Rotation � droite des �l�ments du tableau
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i-1];
		}
		array[0] = lastValue;
		int i = 0; // index de parcours du tableau
	    while (i < array.length) {
	    	System.out.println(array[i]);
	    	i++;
	    }

	}

}
