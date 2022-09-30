package metodos;

import java.util.Scanner;

public class IntroMetodos {

	public static void main(String[] args) {
		
		calcularRaicesCuadraticas(); //Llamada del método
		
	} //Cierre del main
		
	// modificador de acceso + tipo de dato que va a devolver el metodo + nombre del metodo + los parentesis () y/o lista de parametros de entrada
	//Definición del método
	public static void calcularRaicesCuadraticas() {
		//El cuerpo del metodo
		Scanner lector = new Scanner(System.in);
		
		System.out.print("a = ");
		double a = lector.nextDouble();
		System.out.print("b = ");
		double b = lector.nextDouble();
		System.out.print("c = ");
		double c = lector.nextDouble();
		
		double discriminante = Math.pow(b, 2) - 4 * a * c;
		
		double x1 = (-b + Math.sqrt(discriminante))/(2 * a);
		double x2 = (-b - Math.sqrt(discriminante))/(2 * a);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
	}
	
	
	
} //Cierre de la clase
