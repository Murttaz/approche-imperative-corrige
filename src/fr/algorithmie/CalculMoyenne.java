package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		// Variables
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int compteur = 0;
		double total = 0;

		// La moyenne
		while (array.length > compteur) {
			total = total + array[compteur];
			compteur++;
		}

		System.out.println("Total :" + total);
		double moyenne = total / array.length;
		System.out.println("Nombre d'éléments :" + array.length);
		System.out.println("Moyenne :" + moyenne);

	}

}
