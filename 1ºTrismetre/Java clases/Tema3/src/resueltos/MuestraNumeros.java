package resueltos;

import java.util.Scanner;

//Mostrar por pantalla todos los numeros entre dos
public class MuestraNumeros {
	public static void main(String[] args) {
		int suma=0;
		int cuenta=0;
		
		int inicio,fin;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero para empezar: ");
		inicio = sc.nextInt();
		System.out.println("Dame un numero para acabar: ");
		fin =sc.nextInt();
		
		int j=inicio;
		
		do {
			suma+=j;			//suma=suma+j
			cuenta++;
			j++;
		}while(j<=fin);
		System.out.println("la suma es: "+suma);
		System.out.println("has contado: "+cuenta);
		System.out.println("la media es: ");
		
	}

}
