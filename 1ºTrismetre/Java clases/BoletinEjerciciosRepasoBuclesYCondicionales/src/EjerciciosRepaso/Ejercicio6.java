package EjerciciosRepaso;

/*Pedir números hasta que se teclee un 0, mostrar la suma de
todos los números introducidos.*/

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
	int n;
	
	int suma=0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce numero:");
	do {
	n=sc.nextInt();
	if(n!=0)
	System.out.println("Intduce un nuevo numero o 0 para salir:");
		int sumatorio=suma+=n;
		if(n==0) {
			System.out.println("La suma total es de: "+sumatorio);
		}
	}while(n!=0);
}
}
