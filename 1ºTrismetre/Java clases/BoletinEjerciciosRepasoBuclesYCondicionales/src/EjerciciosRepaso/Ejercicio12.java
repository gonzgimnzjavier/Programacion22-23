package EjerciciosRepaso;

//Pedir un número y calcular su factorial.

import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		n=sc.nextInt();
		for(int i=n-1; i>=1; i--) {
			 n*=i;
		}System.out.println("El factorial es "+n);
	}

}
