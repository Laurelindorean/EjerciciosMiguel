package TareaUD6;

public class Ejercicio5 {
	
	/*
	 * 5) Crea una aplicación que nos convierta un número en base decimal a binario.
	 * Esto lo realizara un método al que le pasaremos el numero como parámetro,
	 * devolverá un String con el numero convertido a binario. Para convertir un
	 * numero decimal a binario, debemos dividir entre 2 el numero y el resultado de
	 * esa división se divide entre 2 de nuevo hasta que no se pueda dividir mas, el
	 * resto que obtengamos de cada división formara el numero binario, de abajo a
	 * arriba.
	 */
	public static void main(String[]args) {
		System.out.println("Escribe un numero");
		System.out.println(numeroBinario(Utils.pedirNumero()));
	}
	
	public static String numeroBinario(int numero) {
		System.out.println("El numero es " + numero);
		int resto=0;
		String binario = "";
		
		int i=0;
		while(numero>=2) {
			resto = numero%2;
			numero = numero/2;	
			binario += Integer.toString(resto);
		}
		binario += Integer.toString(numero);
		//invertimos la cadena de texto
		StringBuilder palabraInvertida = new StringBuilder(binario);
		binario = palabraInvertida.reverse().toString();
		
		return "El codigo binario es " + binario;
	}

}
