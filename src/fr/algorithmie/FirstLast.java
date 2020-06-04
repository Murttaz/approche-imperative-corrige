package fr.algorithmie;

public class FirstLast {

	/*
	 * Calcul de la valeur bool�enne qui contr�le le tableau de la sorte : - elle
	 * vaut true si le tableau est de longueur strictement sup�rieure � 1 et que le
	 * premier et le dernier �l�ment du tableau ont la m�me valeur - elle vaut false
	 * dans les autres cas
	 * 
	 */
	public static void main(String[] args) {
		// Déclaration tableau d'entiers
		int[] tab1 = { 3, 6, 8, 4, 8, 3 };
		boolean marqueur = false;

		// Si détection tableau 1er et dernier éléments égaux, marqueur = true
		if ((tab1.length > 0) && (tab1[0] == tab1[tab1.length - 1] && tab1[tab1.length - 1] == tab1[0])) {
			marqueur = true;
		}
		// Inutile de faire un esle, le marqueur est false par défaut
		System.out.println("Etat du boolean : " + marqueur);

	}

}
