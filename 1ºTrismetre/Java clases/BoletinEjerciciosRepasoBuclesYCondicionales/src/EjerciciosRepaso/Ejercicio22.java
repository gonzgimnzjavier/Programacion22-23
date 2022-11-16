package EjerciciosRepaso;

import java.util.Scanner;

/*Pedir 5 calificaciones de alumnos y decir al final si hay
algún suspenso.*/

public class Ejercicio22 {
	
	public static void main(String[] args) {
		
		int n;
		
		int suspensos=0;
		
		int contador=1;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		
		System.out.println("Introduce la nota del "+contador+"º alumno:");
		n=sc.nextInt();
		contador++;
		
		if(n<5) {
			suspensos++;
			System.out.println("SUSPENSO\n");
		}else {
			System.out.println("APROBADO\n");
		}
		
		}while(contador!=6);
		System.out.println("Hay "+suspensos+" suspensos.");
		
	}

}
