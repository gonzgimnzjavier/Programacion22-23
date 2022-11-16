package EjerciciosRepaso;

/*Pedir un número N, introducir N sueldos, y mostrar el sueldo
máximo.*/

import java.util.Scanner;

public class Ejercicio20 {
	
	public static void main(String[] args) {
		
		int n;
		
		int sueldos;
		
		int maximo=0;
		
		int contador=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de sueldos:");
		n=sc.nextInt();
		do {
		System.out.println("Introduce el "+contador+"º sueldo:");
		sueldos=sc.nextInt();
		if(sueldos>maximo) {
			maximo=sueldos;
		}
		contador++;
		}while(contador!=n+1);
		System.out.println("El sueldo maximo es de "+maximo+"€");
	}

}
