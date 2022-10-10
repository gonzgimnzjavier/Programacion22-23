package Ejercicios;

import java.util.Scanner;

public class EjMetodos {
	
	
	//vamos a preparar un metodo que haga la conversion de 
	//metros a Kilometros 
	public static double metrosAKilometros(double m) {
		
		double k = m/1000;
		return k;
		
	}
	public static double KilometrosAMetros(double k) {
		double m=k*1000;
		return m;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("por favor introduzca numero de metros:");
		double metros,kilometros;
		metros=sc.nextDouble();
		
		kilometros=metrosAKilometros(metros);
		
		System.out.println("en kilometros son: "+kilometros);
		
		System.out.println("introduce kilometros: " );
		kilometros=sc.nextDouble();
		metros=KilometrosAMetros(kilometros);
		System.out.println("en metros son: "+metros);
		
	}

}
