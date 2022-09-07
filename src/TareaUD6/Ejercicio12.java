package TareaUD6;

import java.util.Random;

public class Ejercicio12 {
	public static final int VALOR_MIN = 1;
	public static final int VALOR_MAX = 300;
	/*
	 * 12) Crea un array de números de un tamaño pasado por teclado, el array
	 * contendrá números aleatorios entre 1 y 300 y mostrará aquellos números que
	 * acaben en un dígito que nosotros le indiquemos por teclado (debes controlar
	 * que se introduce un numero correcto), estos deben guardarse en un nuevo
	 * array. Por ejemplo, en un array de 10 posiciones le indicamos mostrar los
	 * números acabados en 5, podría salir 155, 25, etc.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce el tamaño de nuestro array:");
		int size = Utils.pedirNumero();
		int[] arrayAleatorio = Ejercicio10.arrayRandom(size, VALOR_MIN, VALOR_MAX);
		System.out.println("Nuestro Array inicial: ");
		Utils.imprimirArray(arrayAleatorio);
		System.out.println("Introduce un digito entre 0-9 con el que quieres que terminen los numeros del nuevo array:");
		int digito = Utils.pedirNumero();
		int[] arrayConDigito;
		if (digitoCorrecto(digito)) {
			arrayConDigito = arrayControlado(arrayAleatorio, digito);
			System.out.println("El array nuevo es: ");
			Utils.imprimirArray(arrayConDigito);
		}
		
		

		/*int array[] = generarArrayNumRandom(1, 300, 10,3);
		Utils.imprimirArray(array);*/

	
		
	}

	static int[] arrayControlado(int[] array, int num) {
		int[] nuevoArray = new int[array.length];
		for (int i = 0; i < nuevoArray.length; i++) {
			if(array[i]%10 == num) {
				nuevoArray[i] = array[i];
			}
		}
		return nuevoArray;
	}

	static boolean digitoCorrecto(int num) {

		if (num >= 0 && num < 10) {
			return true;
		} else {
			System.out.println("Error. Tienes que introducir un digito del 0 al 9");
			return false;
		}

	}
	/*static int[] generarArrayNumRandom(int rangoInf, int rangoSup, int size, int digitoFinal) {
		Random numRandom = new Random();
		int arrayNum[] = new int[size];

		for (int i = 0; i < size; i++) {
			do {
				arrayNum[i] = numRandom.nextInt(rangoSup - rangoInf) + rangoInf;
			} while (!(arrayNum[i] % 10 == digitoFinal));
		}

		return arrayNum;
	}*/

}
