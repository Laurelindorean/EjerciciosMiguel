package TareaUD6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio1 ej1 = new Ejercicio1();
		//ej1.pedirOpcion();
		Ejercicio2 ej2 = new Ejercicio2();
		/*System.out.println("introduce un numero minimo:");
		int rangoMin = Utils.pedirNumero();
		System.out.println("introduce un numero maximo:");
		int rangoMax = Utils.pedirNumero();
		System.out.println("El numero aleatorio es: " + ej2.enteroRandom(rangoMin, rangoMax));*/
		Ejercicio3 ej3 = new Ejercicio3();
		/*System.out.println("Introduce un numero y te dire si es primo o no");
		int numeroPrimo = Utils.pedirNumero();
		if(ej3.esPrimo(numeroPrimo)) {
			System.out.println("El número " + numeroPrimo + " es primo");
		}else {
			System.out.println("El número " + numeroPrimo + " no es primo");
		}*/
		Ejercicio4 ej4 = new Ejercicio4();
		/*System.out.println("Introduce un numero por teclado y te calcularé el factorial: ");
		int numero = Utils.pedirNumero();
		System.out.println("El factorial del " + numero + " es " + ej4.factorial(numero));*/
		Ejercicio6 ej6 = new Ejercicio6();
		/*System.out.println("Introduce un numero y te dire cuantas cifras tiene:");
		int numero = Utils.pedirNumero();
		System.out.println(ej6.devolverEntero(numero));
		System.out.println("Introduce un numero y te dire cuantas cifras tiene:");
		int numero2 = Utils.pedirNumero();
		System.out.println(ej6.sacadaDePolla(numero2));*/
		Ejercicio7 ej7 = new Ejercicio7();
		System.out.println("Cuantos euros quieres cambiar?");
		int euros = Utils.pedirNumero();
		String moneda = ej7.pedirMoneda();
		ej7.cambioMoneda(euros, moneda);
		
		
		
		
	}

}
