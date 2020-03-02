package fr.algorithmie;

// Import de la classe Scanner
import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		
		// Création d'une variable saisie de type Scanner
		Scanner saisie = new Scanner(System.in);
		
		// Demande à l'utilisateur de saisir un nombre
		System.out.println("Veuillez saisir un nombre compris entre 1 et 10 et appuyer sur la touche Return :");
		
		// Stockage de la valeur saisie par l'utilisateur dans une variable nb
		int nb = saisie.nextInt();
		
		// Affichage du nombre s'il est compris entre 1 et 10
		if ((nb >= 1) && (nb <= 10)) {
			saisie.close(); // fermeture de la saisie
			System.out.println(nb);
		}
		else {
			// Tant que le nombre n’est pas compris entre 1 et 10, le programme redemande un nombre à l’utilisateur
			do {
				System.out.println("Veuillez saisir un nombre compris entre 1 et 10 et appuyer sur la touche Return :");
				nb = saisie.nextInt();
			} while ((nb < 1) || (nb > 10));
			saisie.close(); // fermeture de la saisie
			System.out.println(nb);
		}

	}

}
