package javaPOO;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TareaUD5 {

	public static void main(String[] args) {

		/*
		 * pedirTexto(); int num1 = pedirNumero(); pedirTexto(); int num2 =
		 * pedirNumero(); ejercicio1(num1, num2);
		 */
		// ejercicio2();
		// ejercicio3();
		// ejercicio4();
		// ejercicio5();
		// ejercicio6();
		// ejercicio7();
		// ejercicio8();
		// ejercicio9();
		// ejercicio10();
		// ejercicio11();
		//ejercicio12();
		CalculadoraInversa();
	}

	public static void ejercicio1(int num1, int num2) {
		/*
		 * 1) Declara 2 variables numéricas (con el valor que desees), he indica cual es
		 * mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores
		 * para comprobar que funciona.
		 */
		if (num1 < num2) {
			System.out.println("El " + num2 + " es mayor que el " + num1);
		} else if (num1 > num2) {
			System.out.println("El " + num1 + " es mayor que el " + num2);
		} else {
			System.out.println("Los números son iguales");
		}

	}

	/*
	 * 2) Declara un String que contenga tu nombre, después muestra un mensaje de
	 * bienvenida por consola. Por ejemplo: si introduzco “Fernando”, me aparezca
	 * “Bienvenido Fernando”.
	 */
	static void ejercicio2() {
		System.out.println("Introduce tu nombre");
		String nombre = pedirString();
		System.out.println("Bienvenido/a " + nombre);
	}
	/*
	 * 3) Modifica la aplicación anterior, para que nos pida el nombre que queremos
	 * introducir (recuerda usar JOptionPane).
	 */

	static void ejercicio3() {
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		JOptionPane.showMessageDialog(null, "Bienvenido/a " + nombre);
	}

	/*
	 * 4) Haz una aplicación que calcule el área de un circulo (pi*R). El radio se
	 * pedirá por teclado (recuerda pasar de String a double con
	 * Double.parseDouble). Usa la constante PI y el método pow de Math.
	 */
	static void ejercicio4() {
		System.out.println("Indica el radio del circulo");
		String radio = pedirString();
		double area = Math.PI * Math.pow(Double.parseDouble(radio), 2);
		System.out.println("El area del circulo es " + area);
	}

	/*
	 * 5) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si
	 * no lo es, también debemos indicarlo.
	 */
	static void ejercicio5() {
		System.out.println("Introduce un número y te diré si es divisible entre 2");
		int numero = pedirNumeroEntero();
		if (esDivisible(numero, 2)) {
			System.out.println("El número " + numero + " es divisible entre 2");
		} else {
			System.out.println("El número " + numero + " no es divisible entre 2");
		}
	}

	/*
	 * 6) Lee un número por teclado que pida el precio de un producto (puede tener
	 * decimales) y calcule el precio final con IVA. El IVA sera una constante que
	 * sera del 21%
	 */
	static void ejercicio6() {
		final double IVA = 0.21;
		double precioSinIVA = Double
				.parseDouble(JOptionPane.showInputDialog("Introduce un precio y te lo calcularé con IVA"));
		double precioFinal = precioSinIVA + (precioSinIVA * IVA);
		JOptionPane.showMessageDialog(null, "El precio total con IVA incluido es " + precioFinal);

	}

	/*
	 * 7) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
	 */
	static void ejercicio7() {
		int contador = 0;
		while (contador <= 100) {
			System.out.println(contador);
			contador++;
		}
	}

	/*
	 * 8) Haz el mismo ejercicio anterior con un bucle for
	 */
	static void ejercicio8() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
	}

	/*
	 * 9) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
	 * Utiliza el bucle que desees.
	 */
	static void ejercicio9() {
		System.out.println("Los numeros divisibles entre 2 son: ");
		for (int i = 0; i <= 100; i++) {
			if (esDivisible(i, 2)) {
				System.out.println(i);
			}
		}
		System.out.println("Los numeros divisibles entre 3 son: ");
		for (int i = 0; i <= 100; i++) {
			if (esDivisible(i, 3)) {
				System.out.println(i);
			}
		}
	}

	/*
	 * 10) Realiza una aplicación que nos pida un número de ventas a introducir,
	 * después nos pedirá tantas ventas por teclado como número de ventas se hayan
	 * indicado. Al final mostrara la suma de todas las ventas. Piensa que es lo que
	 * se repite y lo que no.
	 * 
	 */
	static void ejercicio10() {
		System.out.println("Introduce el número de ventas que quieres hacer");
		int ventas = pedirNumeroEntero();
		double sumaVentas = 0;
		System.out.println("Introduce el valor de cada venta");
		for (int i = 0; i < ventas; i++) {
			System.out.println("Valor venta " + (i + 1));
			sumaVentas = pedirNumeroDecimal() + sumaVentas;
		}
		System.out.println("El valor total de las ventas es " + sumaVentas);
	}

	/*
	 * 11) Crea una aplicación que nos pida un día de la semana y que nos diga si es
	 * un día laboral o no. Usa un switch para ello.
	 */
	static void ejercicio11() {
		String dia = JOptionPane.showInputDialog("Introduce un día de la semana y te diré si es laborable");

		switch (dia.toLowerCase()) {
		case "domingo":
			JOptionPane.showMessageDialog(null, dia + " es festivo");
			break;
		case "lunes":
			JOptionPane.showMessageDialog(null, dia + " es laborable");
			break;
		case "martes":
			JOptionPane.showMessageDialog(null, dia + " es laborable");
			break;
		case "miercoles":
			JOptionPane.showMessageDialog(null, dia + " es laborable");
			break;
		case "jueves":
			JOptionPane.showMessageDialog(null, dia + " es laborable");
			break;
		case "viernes":
			JOptionPane.showMessageDialog(null, dia + " es laborable");
			break;
		case "sabado":
			JOptionPane.showMessageDialog(null, dia + " es laborable");
			break;
		default:
			JOptionPane.showMessageDialog(null, "el valor no es correcto");
		}

	}

	/*
	 * 12) Escribe una aplicación con un String que contenga una contraseña
	 * cualquiera. Después se te pedirá que introduzcas la contraseña, con 3
	 * intentos. Cuando aciertes ya no pedirá mas la contraseña y mostrara un
	 * mensaje diciendo “Enhorabuena”. Piensa bien en la condición de salida (3
	 * intentos y si acierta sale, aunque le queden intentos).
	 */
	static void ejercicio12() {
		String psw = JOptionPane.showInputDialog("Introduce una contraseña nueva");
		String pswAux;
		int intentos = 3;
		do {
			pswAux = JOptionPane.showInputDialog("Introduce tu contraseña. Intentos restantes " + intentos);
			if (pswAux.compareTo(psw) == 0) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				intentos = 0;
			} else {
				JOptionPane.showMessageDialog(null, "La contraseña no es correcta. Intentalo de nuevo");
				intentos--;
				if (intentos == 0) {
					JOptionPane.showMessageDialog(null, "Lo siento ya no te quedan más intentos");
				}
			}
		} while (intentos != 0);
	}

	/*
	 * 13) Crea una aplicación llamada CalculadoraInversa, nos pedirá 2 operandos
	 * (int) y un signo aritmético (String), según este último se realizara la
	 * operación correspondiente. Al final mostrara el resultado en un cuadro de
	 * dialogo. Los signos aritméticos disponibles son: +: suma los dos operandos.
	 * -: resta los operandos. *: multiplica los operandos. /: divide los operandos,
	 * este debe dar un resultado con decimales (double) ^: 1º operando como base y
	 * 2º como exponente. %: módulo, resto de la división entre operando1 y
	 * operando2
	 */
	static void CalculadoraInversa() {
		int num1 = Integer.valueOf(JOptionPane.showInputDialog("Introduce un numero"));
		int num2 = Integer.valueOf(JOptionPane.showInputDialog("Introduce otro numero"));
		String signo = JOptionPane.showInputDialog("Introduce el simbolo aritmetico que desees: (+,-,*,/,%,^)");
		switch (signo) {
		case "+":
			JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case "-":
			JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case "*":
			JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case "/":
			JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + (num1 / num2));
			break;
		case "%":
			JOptionPane.showMessageDialog(null, num1 + " % " + num2 + " = " + ((double) num1 % (double) num2));
			break;
		case "^":
			JOptionPane.showMessageDialog(null, num1 + " ^ " + num2 + " = " + (Math.pow((double)num1, (double)num2)));
		}
	}

	// Metodos Auxiliares
	static int pedirNumeroEntero() {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		return numero;
	}

	static double pedirNumeroDecimal() {
		Scanner sc = new Scanner(System.in);
		double numero = sc.nextDouble();
		return numero;
	}

	static String pedirString() {
		Scanner sc = new Scanner(System.in);
		String palabra = sc.next();
		return palabra;
	}

	static void texto() {
		System.out.println("Introduce un número y te diré cual es mayor");
	}

	static boolean esDivisible(double num1, double num2) {
		return (num1 % num2) == 0;
	}

}
