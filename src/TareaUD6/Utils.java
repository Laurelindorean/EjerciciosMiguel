package TareaUD6;

import java.util.Random;
import java.util.Scanner;

public class Utils {
	public static int pedirNumero() {
		Scanner sc = new Scanner(System.in);
		if (!sc.hasNextInt()) {
			System.out.println("Error. Tienes que introducir un numero entero");
		}
		return sc.nextInt();

	}

	public static boolean esPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		int contador = 0;
		for (int i = (int) Math.sqrt(numero); i > 1; i--) {
			if (numero % i == 0) {
				contador++;
			}
		}
		return contador < 1;
	}

	static int enteroRandom(int rangoMin, int rangoMax) {
		Random r = new Random();
		return r.nextInt(rangoMax - rangoMin + 1) + rangoMin;
	}

	static int numMayor(int[] array) {
		int mayor = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > mayor) {
				mayor = array[i];
			}
		}
		return mayor;
	}

	static void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
