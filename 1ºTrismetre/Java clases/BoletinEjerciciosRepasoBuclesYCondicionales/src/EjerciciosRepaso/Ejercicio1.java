package EjerciciosRepaso;

import java.util.Scanner;

/*Leer un número y mostrar su cuadrado, repetir el proceso
hasta que se introduzca un número negativo.*/

public class Ejercicio1 {
	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero positivo:");
		do {
		numero=sc.nextInt();
		if(numero>=0) {
		System.out.println("El numero introducido es " +numero +" y su cuadrado es "+(int)Math.pow(numero, 2) +"\n");
		System.out.println("Introduce un numero negativo para salir o positivo si desea continuar:");
		}else {
			System.out.println("Saliendo...");
			System.out.println("Has salido");
		}
		}while(numero>=0);
	}

}
