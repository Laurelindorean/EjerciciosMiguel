package TareaUD6;

import java.util.Scanner;

public class Ejercicio11 {
	/*
	 * 11) Crea dos arrays de números con la dimensión pasada por teclado. Uno de
	 * ellos estará rellenado con números aleatorios y el otro apuntara al array
	 * anterior, reasigna los valores del segundo array con valores aleatorios.
	 * Después, crea un método que tenga como parámetros, los dos arrays y devuelva
	 * uno nuevo con la multiplicación de la posición 0 del array1 con el del array2
	 * y así sucesivamente. Por último, muestra el contenido de cada array
	 */
	public static void main(String[] args) {
		System.out.println("Dime el tamaño del Array A");
		int size = Utils.pedirNumero();
		System.out.println("Array A:");
		int[] arrayA = Ejercicio10.arrayRandom(size, 1, 100);
		Utils.imprimirArray(arrayA);
		int[] arrayB = arrayA;
		System.out.println("Array B sin modificar:");
		Utils.imprimirArray(arrayB);
		arrayB = Ejercicio10.arrayRandom(size, 1, 100);
		System.out.println("Array B modificado:");
		Utils.imprimirArray(arrayB);
		int[] arrayDefinitivo = arrayFinal(arrayA, arrayB);
		System.out.println("Array Con valores de Array A y B multiplicados:");
		Utils.imprimirArray(arrayDefinitivo);

	}

	static int[] arrayFinal(int[] arrayA, int[] arrayB) {
		int[] arrayMultiplicado = new int[arrayA.length];
		for (int i = 0; i < arrayMultiplicado.length; i++) {
			arrayMultiplicado[i] = arrayA[i] * arrayB[i];
		}
		return arrayMultiplicado;
	}

}
