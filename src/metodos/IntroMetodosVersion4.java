package metodos;

import java.util.Scanner;

public class IntroMetodosVersion4 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.print("a = ");
		double a = lector.nextDouble();
		System.out.print("b = ");
		double b = lector.nextDouble();
		System.out.print("c = ");
		double c = lector.nextDouble();
		
		calcularRaicesCuadraticas(a,b,c);
		calcularRaicesCuadraticas(2,3,1);
		
		lector.close();
	} //Cierre del main
	
	//Definición del método
	public static void calcularRaicesCuadraticas(double a, double b, double c) {
		//El cuerpo del metodo		
		double discriminante = Math.pow(b, 2) - 4 * a * c;
		
		double x1 = (-b + Math.sqrt(discriminante))/(2 * a);
		double x2 = (-b - Math.sqrt(discriminante))/(2 * a);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
	}
	
	
	
} //Cierre de la clase
