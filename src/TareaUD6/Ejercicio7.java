package TareaUD6;

import java.util.Scanner;

public class Ejercicio7 {

	/*
	 * 7) Crea un aplicación que nos convierta una cantidad de euros introducida por
	 * teclado a otra moneda, estas pueden ser a dolares, yenes o libras. El método
	 * tendrá como parámetros, la cantidad de euros y la moneda a pasar que sera una
	 * cadena, este no devolverá ningún valor, mostrara un mensaje indicando el
	 * cambio (void). El cambio de divisas son: 0.86 libras es un 1 € 1.28611 $ es
	 * un 1 € 129.852 yenes es un 1 €
	 */

	static void cambioMoneda(double euros, String moneda) {
		double cambio;
		switch (moneda.toLowerCase()) {
		case "dolar":
			cambio = euros * 1.28611;
			System.out.println("El cambio a dolar corresponde a " + cambio + "$");
			break;
		case "yen":
			cambio = euros * 129.852;
			System.out.println("El cambio a yenes corresponde a " + cambio + " yenes");
			break;
		case "libra":
			cambio = euros * 0.86;
			System.out.println("El cambio a libras corresponde a " + cambio + " libras");
			break;
		default:
			System.out.println("Error. Debes introducir una de estas monedas: Dolar, Yen o Libra");
			break;
		}
	}

	static String pedirMoneda() {
		Scanner sc = new Scanner(System.in);
		System.out.println("A que moneda deseas cambiar tus euros?");
		return sc.next();
	}
}
