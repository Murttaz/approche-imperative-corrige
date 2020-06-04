package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		int[] array = { 0, 2, 4, 6 };
		int[] arrayRetation = new int[array.length];

		// rotation à droite des éléments
		for (int i = 0; i < array.length; i++) {
			arrayRetation[(i + 1) % array.length] = array[i];
			arrayRetation[0] = array[array.length - 1];
			System.out.println("le min est :" + arrayRetation[i]);
		}

	}
}