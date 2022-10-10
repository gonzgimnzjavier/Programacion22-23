package ejemplos;

import java.util.Scanner;

public class ejemplo5 {

	public static void main(String[] args) {
		
		Scanner pilla= new Scanner(System.in); 
		
		int dividendo=0;
		int divisor=0;
		int cociente;
		int resto;
		
		
		
		
		
		
		
		//entradas
		System.out.println("introduce dividendo: ");
		dividendo= pilla.nextInt();
		System.out.println("introduce divisor: ");
		divisor= pilla.nextInt();
		//algoritmo
		cociente= dividendo/divisor; 
		resto=dividendo%divisor;
		//salidas
		System.out.println("El cociente es: " +cociente);
		System.out.println("El resto es: " +resto);
		System.out.println(dividendo+" entre "+divisor+" da de cociente "+cociente + " y de resto " +resto);
	}	
}
