package fr.algorithmie;

// Import de la classe Scanner
import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		
		// Cr�ation d'une variable saisie de type Scanner
		Scanner saisie = new Scanner(System.in);
		
		// Cr�ation d'un tableau allant contenir les 10 nombres
		int[] numbers = new int[10];
						
		// Demande � l'utilisateur de saisir 10 nombres
		System.out.println("Veuillez saisir 10 nombres et appuyer sur la touche Return :");
		
		// Stockage des nombres dans le tableau numbers
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = saisie.nextInt();
		}
		
		// Affichage du plus grand des 10 nombres
		int nbMax = numbers[0]; // valeur maximale du tableau, initialis�e au premier �l�ment du tableau
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > nbMax) {
				nbMax = numbers[i];
			}
		}
		System.out.println(nbMax);

	}

}
