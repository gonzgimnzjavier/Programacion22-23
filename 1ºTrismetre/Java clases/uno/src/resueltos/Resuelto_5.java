package resueltos;

import java.util.Scanner;

public class Resuelto_5 {

	
		
		/*true
		 * verdadero. Si la edad es menor o igual a 28
		 * y los ingresos superan los 28.000 (euros).
		 */
		
		
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int edad;
		int nivel_de_estudios;
		int ingresos;
		boolean jasp;
		
		System.out.println("edad: ");
		edad=sc.nextInt();
		System.out.println("nivel: ");
		nivel_de_estudios=sc.nextInt();
		System.out.println("ingresos: ");
		ingresos=sc.nextInt();
		
		
		    jasp =   (  (edad<=28) &&  (nivel_de_estudios>3) &&  (ingresos>28000)  );
		    System.out.println("eres jasp? "+jasp);
		
		
		
	}
}
