package EjerciciosRepaso;

/*Pide un número (que debe estar entre 0 y 10) y mostrar la
tabla de multiplicar de dicho número.*/

import java.util.Scanner;

public class Ejercicio16 {
	
	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		n=sc.nextInt();
		
		if(n>=0 && n<=10) {
			for(int i=0; i<=10; i++) {
				System.out.println(n+"x"+i +"="+n*i);
			}
		}
	}

}
