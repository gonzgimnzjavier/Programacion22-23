package EjerciciosRepaso;

import java.util.Scanner;

/*Pedir un número N, y mostrar 
 * todos los números del 1 al N.*/

public class Ejercicio8 {
	
	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println(i);
		}
	}

}
