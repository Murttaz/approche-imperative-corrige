package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		
		// Création d'une variable saisie de type Scanner
		Scanner saisie = new Scanner(System.in);
								
		// Affichage du menu
		System.out.println("Menu :\n1. Ajouter un nombre\n2. Afficher les nombres existants");
		
		// Demande à l'utilisateur de choisir une option dans le menu
		System.out.println("Veuillez choisir une option dans le menu en saisissant 1 ou 2 et appuyer sur la touche Return :");
		
		// Stockage de la valeur saisie par l'utilisateur dans une variable option
		int option = saisie.nextInt();
		
		/*
		 *  - Si l’utilisateur sélectionne l’option 1, le programme demande un nombre à l’utilisateur
		 *  puis l’ajoute à un tableau
		 *  - Si l’utilisateur sélectionne l’option 2, le programme affiche le contenu du tableau
		 */
		int nb = 0; // initialisation du nombre à demander à l'utilisateur
		
		// Création du tableau allant contenir les valeurs
		int[] array = new int[5];
		
		int i = 0; // initialisation d'un index de parcours du tableau
		
		do {
			if (option == 1) {
				System.out.println("Veuillez saisir un nombre :");
				nb = saisie.nextInt();
				array[i] = nb;
				i++;
				System.out.println("Veuillez choisir de saisir un autre nombre en tapant 1 ou de revenir au menu en tapant 2 :");
				option = saisie.nextInt();
				if (option == 1) {
					System.out.println("Veuillez saisir un nombre :");
					nb = saisie.nextInt();
					array[i] = nb;
					i++;
				}
				else if (option == 2) {
					System.out.println("Menu :\n1. Ajouter un nombre\n2. Afficher les nombres existants");
					System.out.println("Veuillez choisir une option dans le menu en saisissant 1 ou 2 et appuyer sur la touche Return :");
					option = saisie.nextInt();
				}
			}
		} while (i < array.length);
		
		if (option == 2) {
			int j = 0;
			while (j < array.length) {
				System.out.println(array[j]);
				j++;
			}
		}
		
		// Fermeture de la saisie
		saisie.close();
		/*
		// Si le tableau est plein, on agrandit le tableau
		
		// Création d'un nouveau tableau de taille supérieure
		int[] newArray = new int[array.length+5];
		
		// On remplit ce tableau avec les éléments de l'ancien
		for (int j = 0; j < array.length; j++) {
			newArray[j] = array[j];
		}
		
		int j = array.length; // initialisation d'un index de parcours du nouveau tableau
		do {
			if (option == 1) {
				System.out.println("Veuillez saisir un nombre :");
				nb = saisie.nextInt();
				newArray[j] = nb;
				j++;
			}
			else if (option == 2) {
				System.out.println(newArray);
			}
		} while (j < newArray.length);
		*/
		
		
		/*
		if (option == 1) {
			System.out.println("Veuillez saisir un nombre :");
			nb = saisie.nextInt();
			//saisie.close(); // fermeture de la saisie
			array[0] = nb;
		}
		else if (option == 2) {
			//saisie.close(); // fermeture de la saisie
			System.out.println(array);
		}
		*/

	}

}
