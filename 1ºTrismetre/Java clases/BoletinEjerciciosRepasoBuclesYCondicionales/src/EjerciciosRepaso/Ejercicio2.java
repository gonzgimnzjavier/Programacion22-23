package EjerciciosRepaso;
/*Leer un número e indicar si es positivo o negativo. 
El proceso se repetirá hasta que se introduzca un 0.*/

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Introduce un numero:");
		do {
		numero=sc.nextInt();
		System.out.println("");
		if(numero<0) {
			System.out.println(numero +" es negativo.\n");
			System.out.println("Introduzca un nuevo numero para continuar o 0 para salir:");
		}else if (numero>0){
			System.out.println(numero +" es positivo.\n");
			System.out.println("Introduzca un nuevo numero para continuar o 0 para salir:");
		}else {
			System.out.println("Saliendo...\n");
			System.out.println("Has salido.");
		}
	}while(numero!=0);
	}

}
