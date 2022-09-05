package TareaUD6;

public class Ejercicio6 {
	/*
	 * 6) Crea una aplicación que nos cuente el número de cifras de un número entero
	 * positivo (hay que controlarlo) pedido por teclado. Crea un método que realice
	 * esta acción, pasando el número por parámetro, devolverá el número de cifras.
	 */
	

	 static int devolverEntero(int numero) {
		int cifra = 0;
		while (numero < 0) {
			System.out.println("El número debe ser positivo");
			System.out.println("Introduce un nuevo numero");
			numero = Utils.pedirNumero();
		}
		while (numero > 0) {
			numero = numero / 10;
			cifra++;
		}
		return cifra;

	}
	 
	 static int sacadaDePolla(int numero) {
		 return Integer.toString(Math.abs(numero)).length();
	 }

}
