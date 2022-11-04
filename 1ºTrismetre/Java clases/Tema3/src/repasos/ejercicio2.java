package repasos;

import java.util.Scanner;

public class ejercicio2 {
	
	public static void main(String[] args) {
		
		int aleatorio= (int) (Math.random()*100);
		
		int numero=0;
		
		int contador=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Intenta adivinar el numero \n");
		
		while(aleatorio!=numero) {
		
		System.out.println("introduce un numero entre 1 y 100:");
		numero=sc.nextInt();
		
		if(aleatorio<numero) {
			System.out.println("el numero es menor \n");
			contador++;
		}else if(aleatorio>numero) {
			System.out.println("el numero es mayor\n");
			contador++;
			
		}
		}
		contador++;
		System.out.println("CORRECTO has tardado "+contador+" intentos");
		
	}

}
