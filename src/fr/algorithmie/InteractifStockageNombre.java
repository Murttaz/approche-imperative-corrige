package fr.algorithmie;

import java.util.Scanner;

/**
 * @author DIGINAMIC
 *
 */
public class InteractifStockageNombre {

	/**
	 * Méthode exécutable
	 * 
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		// On initialise le scanner qui va nous servir à interagir avec l'utilisateur
		Scanner scan = new Scanner(System.in);

		// On initialise un tableau de longueur 0
		int[] tab = new int[0];

		// On initialise notre condition de fin de programme
		boolean sortie = false;

		// Tant que la sortie n'a pas été décidée par l'utilisateur on continue la
		// boucle
		while (!sortie) {

			// On affiche les options du programme à l'utilisateur
			System.out.println("Options:");
			System.out.println("1 - Pour saisir une valeur");
			System.out.println("2 - Pour afficher les valeurs saisies");
			System.out.println("3 - Pour quitter le programme.");

			// On enregistre sa saisie dans menu
			int menu = scan.nextInt();

			// On teste la valeur de cmd
			switch (menu) {
			// Si la valeur est 1
			case 1:

				// On demande à l'utilisateur de saisir une valeur
				System.out.println("Saisissez une valeur");
				int valeur = scan.nextInt();

				// On va devoir créer un tableau temporaire plus grand d'une case que le tableau
				// précédent
				int[] tmp = new int[tab.length + 1];

				// On stocke toutes les valeurs du tableau précédent dans le nouveau tableau
				for (int i = 0; i < tmp.length - 1 && tab.length > 0; i++) {
					tmp[i] = tab[i];
				}

				// Puis en fin de tableau (case complémentaire), on stocke la valeur saisie
				tmp[tmp.length - 1] = valeur;

				// On affecte enfin le tableau tmp au tableau tab
				tab = tmp;
				break;
			case 2:

				// On affiche toutes les valeurs stockées dans le tableau tab
				for (int i = 0; i < tab.length; i++) {
					System.out.print(tab[i] + " ");
				}
				System.out.println();
				break;
			case 3:

				// On positionne sortie à true
				sortie = true;
				break;
			default:

				// On ne fait rien dans tous les autres cas
				break;
			}
		}

		// On ferme le scanner
		scan.close();
	}
}