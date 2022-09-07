package TareaUD6;

import java.util.Random;

public class Ejercicio9 {

	/*
	 * 9) Crea un array de números donde le indicamos por teclado el tamaño del
	 * array, rellenaremos el array con números aleatorios entre 0 y 9. Al final
	 * muestra por pantalla el valor de cada posición y la suma de todos los
	 * valores. Tareas a realizar: Haz un método para rellenar el array(que tenga
	 * como parámetros los números entre los que tenga que generar) y otro para
	 * mostrar el contenido y la suma del array.
	 */
	public static void main(String[]args) {
		System.out.println("Introduce el tamaño de nuestro array");
		introducirValores(Utils.pedirNumero());
	}
	
	
	static void introducirValores(int tamaño) {
		int[] miArrayRandom = new int[tamaño];
		Random r = new Random();
		for(int i = 0; i < miArrayRandom.length; i++) {
			miArrayRandom[i]=r.nextInt(9)+1;
		}
		sumaArray(miArrayRandom);
		
	}
	static void sumaArray(int[] array) {
		int suma = 0;
		for(int i = 0; i < array.length; i++) {
			System.out.println("El valor del array en la posicion " + (i+1) + " : " + array[i]);
			suma +=array[i];
		}
		System.out.println("La suma de los valores del array es : " + suma);
	}
}
