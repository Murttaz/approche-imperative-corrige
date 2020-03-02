package fr.algorithmie;

// Import de la classe Scanner
import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		
		// Création d'une variable saisie de type Scanner
		Scanner saisie = new Scanner(System.in);
				
		// Demande à l'utilisateur de saisir un nombre
		System.out.println("Veuillez saisir un nombre et appuyer sur la touche Return :");
				
		// Stockage de la valeur saisie par l'utilisateur dans une variable nb
		int nb = saisie.nextInt();
				
		// Fermeture de la saisie
		saisie.close();
		
		// Calcul et affichage de la somme de tous les entiers compris entre 1 et ce nombre
		int somme = 0; // initialisation de la valeur de cette somme
		for (int i = 1; i <= nb; i++) {
			somme = somme + i;
		}
		System.out.println(somme);

	}

}
