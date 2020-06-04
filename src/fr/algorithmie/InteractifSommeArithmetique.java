package fr.algorithmie;

// Import de la classe Scanner
import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		/*
		 * Exercice 13 : Somme arithmétique intéractive Ecrire un programme qui demande
		 * un nombre à l’utilisateur puis calcule la somme de tous les entiers compris
		 * entre 1 et ce nombre. Exemple si l’utilisateur saisit 5, le programme
		 * affiche: 15
		 */
		int nombre = 0;
		int resultat = 0;
		Scanner saisie = new Scanner(System.in);

		System.out.print("Entrez un nombre : ");
		nombre = saisie.nextInt();

		saisie.close();

		for (int i = 1; i <= nombre; i++) {

			resultat += i;

		}

		System.out.println("La somme de tous les entiers compris entre 1 et " + nombre + " est : " + resultat);
	}

}
