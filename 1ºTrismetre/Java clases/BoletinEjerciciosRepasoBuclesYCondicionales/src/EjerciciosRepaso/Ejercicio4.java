package EjerciciosRepaso;

import java.util.Scanner;

/*Pedir números hasta que se teclee uno negativo, y mostrar
cuántos números se han introducido.*/

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int numero;
	
	int contador=0;
	
	
	
	System.out.println("Introduce un numero positivo:");
	do {
	numero=sc.nextInt();
	if(numero>0) {
	System.out.println("Introduzca un nuevo numero positivo para continuar \no negativo para mostrar el total de numeros introducidos;");
	contador++;}
	} while(numero>=0);
	System.out.println("Has introducido "+contador +" numeros positivos.");
	}
}
