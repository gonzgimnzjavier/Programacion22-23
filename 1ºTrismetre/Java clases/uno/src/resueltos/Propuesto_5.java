package resueltos;

import java.util.Scanner;

/*codigo para calcular el perimetro 
 * y el area de un cuadrado.
 * pidiendo primero su lado(entero)
 */

public class Propuesto_5 {
	public static void main(String[] args) {
		
		Scanner IntroduceLado= new Scanner(System.in);
		int lado=0;
		System.out.println("Introduce valor entero (lado): ");
		lado=IntroduceLado.nextInt();
		int perimetro=4*lado;
		int area=lado*lado;
		System.out.println("El area es: "+area);
		System.out.println("El perimetro es: "+perimetro);
		
		
		
	}

}
