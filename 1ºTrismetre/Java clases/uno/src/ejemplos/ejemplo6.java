package ejemplos;

import java.util.Scanner;

/*programa que calcula la longitud de una 
 * circunferencia de radio r*/



public class ejemplo6 {
	
	final static double PI = 3.141592;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double radio=0;
		double longitud;
		double area;
		System.out.println("introduce el radio: ");
		radio= sc.nextDouble();
		
		longitud = 2*PI*radio;
		//area=PI*radio*radio;
		area = PI*Math.pow(radio, 2);
		
		System.out.println("la longitud es: " +longitud);
		System.out.println("el área es: " +area);
		
	
	}
}
