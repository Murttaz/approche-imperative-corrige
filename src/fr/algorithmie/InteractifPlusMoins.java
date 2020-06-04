package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		int secretNb = new Random().nextInt(100) + 1;
		Scanner saisie = new Scanner(System.in);
		System.out.println(secretNb);
		boolean cond = true;
		int i = 0;
		while (cond) {
			i++;
			int a = saisie.nextInt();
			if (a == secretNb) {

				System.out.println("« Bravo, vous avez\r\n" + "trouvé en " + i + " coup");
				cond = false;
				break;
			} else if (a < secretNb) {
				System.out.println("Ops, il est au-dessus");
			} else {
				System.out.println("Ops, il est au-dessous");
			}

		}
	}

}
