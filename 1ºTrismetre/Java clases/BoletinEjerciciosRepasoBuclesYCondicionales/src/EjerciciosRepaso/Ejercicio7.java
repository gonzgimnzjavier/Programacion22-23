package EjerciciosRepaso;

import java.util.Scanner;

/*Pedir números hasta que se introduzca uno negativo, y
calcular la media.*/

public class Ejercicio7 {
	
	public static void main(String[] args) {
		
		int n;
		
		int contador=0;
		
		int suma=0;
		
		Scanner sc= new Scanner(System.in);
		
		
		
		System.out.println("Introduce un numero positivo:");
		do {
		n=sc.nextInt();
		if(n>0)
		System.out.println("Introduce un nuevo numero positivo o negativo para calcular la media:");
		if(n>0) {
			contador++;
		suma+=n;
		}
		}while(n>0);
		System.out.println("La media es "+suma/contador);
		
}
}
