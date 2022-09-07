package TareaUD6;

public class Ejercicio8 {
	/*
	 * 8) Crea un array de 10 posiciones de números con valores pedidos por teclado.
	 * Muestra por consola el indice y el valor al que corresponde. Haz dos métodos,
	 * uno para rellenar valores y otro para mostrar.
	 * 
	 */
	public static void main(String[] args) {
		rellenarArray();
	}

	static void rellenarArray() {
		
		int[] miArray = new int[10];

		System.out.println("Introduce un valor para cada posicion:");
		for (int i = 0; i < miArray.length; i++) {
			System.out.println("Posicion " + (i + 1));
			miArray[i] = Utils.pedirNumero();
		}
		pintarArray(miArray);

	}

	static void pintarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("El valor del array en la posición " + (i + 1) + " : " + array[i]);
		}
	}

}
