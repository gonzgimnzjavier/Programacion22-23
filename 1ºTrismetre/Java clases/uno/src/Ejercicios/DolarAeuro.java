package Ejercicios;

import java.util.Scanner;

public class DolarAeuro {
	
	public static double DolarAeuro(double d) {
		
		double E=d*1.05;
		return E;
		
	}
	public static double EuroaDolar(double e) {
		
		double D=e*0.96;
		return D;
	}
	public static void main(String[] args) {
		double aux;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce Euros: ");
		aux=sc.nextDouble();
		System.out.println("son: "+EuroaDolar(aux));
		System.out.println("Introduce Dolares: ");
		aux=sc.nextDouble();
		System.out.println("son: "+DolarAeuro(aux));
	
		
	}

}
