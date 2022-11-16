package EjerciciosRepaso;

/*Realizar un juego para adivinar un número. Para ello pedir un
número N, y luego ir pidiendo números indicando “mayor” o
“menor” según sea mayor o menor con respecto a N. El proceso
termina cuando el usuario acierta.*/

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		int aleatorio= (int) (Math.random()*100);
		
		int numero;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		numero=sc.nextInt();
		if(aleatorio<numero) {
			System.out.println("el numero es menor\n");
		}else if(aleatorio>numero) {
			System.out.println("el numero es mayor\n");
		}else {
			System.out.println("CORRECTO el numero es: "+aleatorio);
		}
		}while(aleatorio!=numero);
	}

}
