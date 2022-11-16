package EjerciciosRepaso;

import java.util.Scanner;

//Pedir 5 números e indicar si alguno es múltiplo de 3.

public class Ejercicio23 {
	
	public static void main(String[] args) {
		
		int n;
		
		int contador=1;
		
		int multiplos=0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		
		System.out.println("Introduce el "+contador+"º numero:");
		n=sc.nextInt();
		contador++;
		if(n%3==0) {
			multiplos++;
			System.out.println(n+" es multiplo de 3\n");
		}
		}while(contador!=6);
		System.out.println("Has introducido "+multiplos+" multiplos de 3.");
	}

}
