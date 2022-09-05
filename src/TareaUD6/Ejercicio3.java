package TareaUD6;

public class Ejercicio3 {
	/*
	 * 3) Crea una aplicación que nos pida un número por teclado y con un método se
	 * lo pasamos por parámetro para que nos indique si es o no un número primo,
	 * debe devolver true si es primo sino false. Un número primo es aquel solo
	 * puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, ya que 25 es
	 * divisible entre 5, sin embargo, 17 si es primo.
	 */
	public boolean esPrimo(int numero) {
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

}
