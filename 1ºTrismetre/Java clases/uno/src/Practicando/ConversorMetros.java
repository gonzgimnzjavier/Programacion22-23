package Practicando;

import java.util.Scanner;

public class ConversorMetros {
	
	public static double MetrosAKilometros(double m) {
		
		double k=m/1000;
		return k;
	}
	
	public static double KilometrosAMetros(double k) {
		
		double m=k*1000;
		return m;
	}
	
	public static void main(String[] args) {
		
		double metros;
		double kilometros;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce metros: ");
		metros=sc.nextDouble();
		System.out.println("En kilometros son: "+MetrosAKilometros(metros));
		
		System.out.println("Introduce kilometros: ");
		kilometros=sc.nextDouble();
		System.out.println("En metros son: "+KilometrosAMetros(kilometros));
	}

}
