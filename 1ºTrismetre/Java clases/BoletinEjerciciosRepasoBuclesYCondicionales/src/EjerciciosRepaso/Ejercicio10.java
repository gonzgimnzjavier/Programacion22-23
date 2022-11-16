package EjerciciosRepaso;

import java.util.Scanner;

//Pedir 15 números y escribir la suma total.

public class Ejercicio10 {
	
	public static void main(String[] args) {
		int n = 0;
		
		int contador=1;
		
		int suma=0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			if(contador<16) {
				System.out.println("Introduce el "+contador +"º numero:");
				n=sc.nextInt();
				contador++;
			}
			suma+=n;
		}while(contador<16);
		System.out.println("La suma total es: "+suma);
	}

}
