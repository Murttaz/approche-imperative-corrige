package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		
		int[] array = {4,3,6,1,4};
		boolean control = true; // initialisation d'une variable booléenne de contrôle du tableau
		
		/*
		 * Calcul de la valeur booléenne qui contrôle le tableau de la sorte :
		 * - elle vaut true si le tableau est de longueur strictement supérieure à 1 et que le
		 * 	premier et le dernier élément du tableau ont la même valeur
		 * - elle vaut false dans les autres cas
		 * 
		 */
		if (array.length > 1 && (array[0] == array[array.length-1])) {
			control = true;
		}
		else {
			control = false;
		}
		System.out.println(control);

	}

}
