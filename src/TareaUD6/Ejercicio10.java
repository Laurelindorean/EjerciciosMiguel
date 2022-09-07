package TareaUD6;

import java.util.Random;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el tamaño de nuestro array");
		int tamaño = Utils.pedirNumero();
		System.out.println("Rellenaremos nuestro array con numeros Aleatorios");
		System.out.println("Introduce el rango minimo: ");
		int valorMin = Utils.pedirNumero();
		System.out.println("Introduce el rango máximo: ");
		int valorMax = Utils.pedirNumero();
		int[] miArray = arrayRandom(tamaño, valorMin, valorMax);
		int[] miArrayPrimo = arrayPrimo(miArray);
		int mayor = Utils.numMayor(miArrayPrimo);
		System.out.println("El número más grande del array es " + mayor);
		
		
	}

	/*
	 * 10) Crea un array de números de un tamaño pasado por teclado, el array
	 * contendrá números aleatorios primos entre los números deseados, por último
	 * nos indicar cual es el mayor de todos. Haz un método para comprobar que el
	 * número aleatorio es primo, puedes hacer todos lo métodos que necesites.
	 */
	static int[] arrayRandom(int tamaño, int valorMin, int valorMax) {
		int[] miArrayRandom = new int[tamaño];
		int[] numPrimos;
		
		for (int i = 0; i < miArrayRandom.length; i++) {
			miArrayRandom[i] = Utils.enteroRandom(valorMin, valorMax);
			//System.out.println("Los números aleatorios són " + i + " : " + miArrayRandom[i]);
		}
		return miArrayRandom;
		

	}

	static int[] arrayPrimo(int[] array) {
		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (Utils.esPrimo(array[i])) {
				newArray[i] = array[i];
				System.out.println("Los numeros primos aleatorios son " + newArray[i]);
			}
		}
		return newArray;
	}

	

}
