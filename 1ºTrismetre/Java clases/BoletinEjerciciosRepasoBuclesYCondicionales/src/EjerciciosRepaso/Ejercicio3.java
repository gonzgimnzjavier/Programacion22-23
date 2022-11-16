package EjerciciosRepaso;

import java.util.Scanner;
/*Leer números hasta que se introduzca un 0. Para cada uno
indicar si es par o impar.*/

public class Ejercicio3 {
public static void main(String[] args) {
		
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Introduce un numero:");
		do {
		numero=sc.nextInt();
		System.out.println("");
		if(numero%2==0 && numero!=0) {
			System.out.println(numero +" es par.\n");
			System.out.println("Introduzca un nuevo numero para continuar o 0 para salir:");
		}else if (numero%2!=0 && numero!=0){
			System.out.println(numero +" es impar.\n");
			System.out.println("Introduzca un nuevo numero para continuar o 0 para salir:");
		}else {
			System.out.println("Saliendo...\n");
			System.out.println("Has salido.");
		}
	}while(numero!=0);
	}

}



