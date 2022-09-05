package TareaUD6;

import java.util.Random;

public class Ejercicio2 {
	/*
	 * 2) Crea una aplicación que nos genere una cantidad de números enteros
	 * aleatorios que nosotros le pasaremos por teclado. 
	 * Crea un método donde pasamos como parámetros entre que números queremos que los genere, podemos
	 * pedirlas por teclado antes de generar los números. Este método devolverá un
	 * número entero aleatorio. Muestra estos números por pantalla.
	 * 
	 */

		public int enteroRandom(int rangoMin, int rangoMax) {
			Random r = new Random();	
			return r.nextInt(rangoMax)+rangoMin;
		}
	
}
