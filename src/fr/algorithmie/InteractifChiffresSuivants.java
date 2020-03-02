package fr.algorithmie;

// Import de la classe Scanner
import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		
		// Création de la variable saisie de type Scanner
		Scanner saisie = new Scanner(System.in);
		
		// On demande à l'utilisateur de saisir une valeur au clavier
		System.out.println("Veuillez saisir un nombre et appuyer sur la touche Return :");
		
		// Stockage de la valeur saisie par l'utilisateur dans la variable nb
		int nb = saisie.nextInt();
		
		// Fermeture de la saisie
	    saisie.close();
			
		// Affichage des 10 nombres suivant la valeur saisie par l'utilisateur
	    int i = 1; // index de parcours du tableau
	    while (i <= 10) {
	    	System.out.println(nb + i);
	    	i++;
	    }

	}

}
