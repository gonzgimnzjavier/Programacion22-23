package EjerciciosRepaso;

/*Dadas 6 notas, escribir la cantidad de alumnos aprobados,
condicionados (=4) y suspensos.*/

import java.util.Scanner;

public class Ejercicio19 {
	
	public static void main(String[] args) {
		
		int contador=1;
		
		int nota;
		
		int aprobados=0;
		
		int suspensos=0;
		
		int condicionados=0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		
		System.out.println("Introduce la "+contador+"º nota:");
		nota=sc.nextInt();
		contador++;
		if(nota>=5) {
			aprobados++;
		}else if(nota==4) {
			condicionados++;
		}else {
			suspensos++;
		}
		}while(contador!=7);
		System.out.println("El numero de aprobados es: "+aprobados+"\n");
		System.out.println("El numero de suspensos es: "+suspensos+"\n");
		System.out.println("El numero de condicionados es: "+condicionados);
	}

}
