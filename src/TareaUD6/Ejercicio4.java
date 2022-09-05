package TareaUD6;

public class Ejercicio4 {
	/*
	 * 4) Crea una aplicación que nos calcule el factorial de un número pedido por
	 * teclado, lo realizara mediante un método al que le pasamos el número como
	 * parámetro. Para calcular el factorial, se multiplica los números anteriores
	 * hasta llegar a uno. Por ejemplo, si introducimos un 5, realizara esta
	 * operación 5*4*3*2*1=120.
	 */
	
	public static void main(String[]args) {
		System.out.println("dime un numero");
		int num = Utils.pedirNumero();
		System.out.println("El factorial es " + factorialRecursivo(num));
	}

	
	public static long factorial(long numero) {
		long i = numero;
		while(i>1) {
			i--;
			  numero = numero * i;				 
		}
		return numero;
	}
	
	static int factorialRecursivo(int numDado){
		int num = Math.abs(numDado);
        if ( num <= 1 ) {
            return 1;
        } else {
            return num*factorialRecursivo(num-1);
        }
   }
	
}
