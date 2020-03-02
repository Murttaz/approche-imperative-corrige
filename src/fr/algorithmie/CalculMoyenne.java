package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int somme = 0; // somme des �l�ments du tableau, initialis�e � 0
		int moyenne = 0; // moyenne des �l�ments du tableau, initialis�e � 0
		
		// Calcul de la somme des �l�ments du tableau
		for (int i = 0; i < array.length; i++) {
			somme = somme + array[i];
		}
		
		// Calcul de la moyenne des �l�ments du tableau
		moyenne = somme / array.length;
		System.out.println(moyenne);

	}

}
