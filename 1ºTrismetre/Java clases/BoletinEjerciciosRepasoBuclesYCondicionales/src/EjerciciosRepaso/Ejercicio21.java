package EjerciciosRepaso;

import java.util.Scanner;

/*Pedir 10 números, y mostrar al final si se ha introducido
alguno negativo.*/

public class Ejercicio21 {
	public static void main(String[] args) {
		int n;
		
		int contador=1;
		
		int negativo=0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Introduce el "+contador+"º numero:");
		n=sc.nextInt();
		contador++;
		if(n<0) {
			negativo++;
		System.out.println(n+" es negativo\n");
		}
	}while(contador!=11);
		System.out.println("El numero de negativos es: "+negativo);
	}

}

