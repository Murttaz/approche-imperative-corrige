package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {

		int[] array = { 52, 58, 8745, 2, -8548, 56, 6 };

		/*
		 * On calcule une valeur booléenne qui contrôle le tableau de la sorte : o elle
		 * vaut true si le tableau a au moins 1 élément et si le premier élément ou le
		 * dernier élément vaut 6. o elle vaut false dans les autres cas
		 */
		boolean b = array.length > 0 && ((array[0] == 6) || (array[array.length - 1] == 6));

		System.out.println(b);
	}

}
