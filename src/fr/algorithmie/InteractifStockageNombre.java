package fr.algorithmie;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		Vector monTableauDynamique = new Vector(1); // tableau dynamique de type vector
		int decisionUser = 0;
		int nb = 0;
		Scanner saisie = new Scanner(System.in);

		do {
			System.out.println("/---Menue du programme---\\");
			System.out.println("Option 1 :\n\tAjoute un nombre au tableau");
			System.out.println("Option 2 :\n\tAffiche les nombres du tableau");
			System.out.println("Option 0 :\n\tSortir du programme");
			System.out.println("Quel est votre choix ?");
			decisionUser = saisie.nextInt();

			switch (decisionUser) {
			case 1:
				System.out.println("Choisir un chiffre");
				nb = saisie.nextInt();
				monTableauDynamique.addElement(nb); // ajoute un élement,augmente la taille dynamiquement
				break;
			case 2:
				System.out.println("Votre tableau :");
				Enumeration vEnum = monTableauDynamique.elements(); // récupère tout les élements du tableau

				while (vEnum.hasMoreElements()) // affiche chaque éléments jusqu'a la fin
					System.out.print(vEnum.nextElement() + " ");
				System.out.println();
				break;
			}

		} while (decisionUser != 0);
		System.out.println("Fin du programme");
	}

}
