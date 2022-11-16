package EjerciciosRepaso;

/*Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de
1000€.*/

import java.util.Scanner;

public class Ejercicio14 {
	
	public static void main(String[] args) {
		
		int sueldos;
		
		int contador=1;
		
		int suma=0;
		
		int mayorquemil=0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		
		System.out.println("Introduce el "+contador+"º sueldo:");
		sueldos=sc.nextInt();
		if(sueldos>1000) {
			mayorquemil++;
		}
		contador++;
		suma+=sueldos;
		}while(contador<11);
		System.out.println("La suma de los sueldos es "+suma+"€");
		System.out.println("La cantidad de sueldos superiores a 1000€ es de "+mayorquemil);
	}

}
