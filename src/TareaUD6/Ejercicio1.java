package TareaUD6;

import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * 1) Crea una aplicación que nos calcule el área de un circulo, cuadrado o
	 * triangulo. Pediremos que figura queremos calcular su área y según lo
	 * introducido pedirá los valores necesarios para calcular el área. Crea un
	 * método por cada figura para calcular cada área, este devolverá un número
	 * real. Muestra el resultado por pantalla. Aquí te mostramos que necesita cada
	 * figura: · Circulo: (radio^2)*PI · Triangulo: (base * altura) / 2 · Cuadrado:
	 * lado * lado
	 */

	public static void pedirOpcion() {
		System.out.println("Indica la figura geometrica que deseas saber el area (Triangulo, Circulo o cuadrado)");
		Scanner sc = new Scanner(System.in);
		String opcion = sc.next();
		switch (opcion.toLowerCase()) {
		case "triangulo":
			System.out.println("Introduce la base del Triangulo:");
			int base = Utils.pedirNumero();
			System.out.println("Introduce la altura del Triangulo");
			int altura = Utils.pedirNumero();
			System.out.println("El area del Triangulo es: " + areaTriangulo(base, altura));
			break;
		case "circulo":
			System.out.println("Introduce el radio del circulo:");
			int radio = Utils.pedirNumero();
			System.out.println("El area del Circulo es: " + areaCirculo(radio));
			break;
		case "cuadrado":
			System.out.println("Introduce el lado del cuadrado: ");
			int lado = Utils.pedirNumero();
			System.out.println("El area del Cuadrado es: " + areaCuadrado(lado));
			break;
		default:
			System.out.println("Error no has introducido un valor correcto");
			break;
		}
	}

	public static double areaCirculo(int radio) {
		return Math.PI * Math.pow(Double.valueOf(radio), 2);
	}

	public static double areaTriangulo(int base, int altura) {
		return (base * altura) / 2;
	}

	public static double areaCuadrado(int lado) {
		return lado * lado;
	}

	
}
