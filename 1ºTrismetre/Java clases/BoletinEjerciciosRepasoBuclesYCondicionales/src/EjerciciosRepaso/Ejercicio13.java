package EjerciciosRepaso;

/*Pedir 10 números. Mostrar la media de los números positivos,
la media de los números negativos y la cantidad de ceros.*/

import java.util.Scanner;

public class Ejercicio13 {
	
	public static void main(String[] args) {
		
		int n;
		
		int pedirdiez=1;
		
		int contadorpos=0;
		
		int sumapos=0;
		
		int sumaneg=0;
		
		int contadorneg=0;
		
		int contadorcer=0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		
		System.out.println("Introduce el "+pedirdiez +"º numero:");
		n=sc.nextInt();
		pedirdiez++;
		if(n>0) {
			contadorpos++;
			sumapos+=n;
		}else if(n<0) {
			contadorneg++;
			sumaneg+=n;
		}else if(n==0) {
			contadorcer++;
		}
		}while(pedirdiez<11);
		System.out.println("La media de los positivos es "+sumapos/contadorpos);
		System.out.println("La media de los negativos es "+sumaneg/contadorneg);
		System.out.println("El total de 0 es "+contadorcer);
	}

}
