package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		
		int[] array = {2, -5, 10, 8, -1, 6}; // tableau d'entiers
		boolean control = true; // initialisation d'une variable booléenne de contrôle du tableau
		
		/*
		 * Calcul de la valeur booléenne qui contrôle le tableau de la sorte :
		 * - elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le
		 * 	dernier élément vaut 6
		 * - elle vaut false dans les autres cas
		 * 
		 */
		if (array.length >= 1 && (array[0] == 6 || array[array.length-1] == 6)) {
			control = true;
		}
		else {
			control = false;
		}
		System.out.println(control);

	}

}
