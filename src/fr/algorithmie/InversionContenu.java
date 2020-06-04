package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] arrayCopy = new int[17];
		int f = array.length - 1;
		while (f >= 0) {
			for (int r = 0; r <= arrayCopy.length - 1; r++) {
				arrayCopy[r] = array[f];
				System.out.print(arrayCopy[r] + ";");
				f--;
			}
		}
		System.out.println(" ");
		for (f = 0; f <= array.length - 1; f++) {
			System.out.print(array[f] + ";");
		}
	}

}
