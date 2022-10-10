package Practicando;

import java.util.Scanner;

public class CaF {
	
	public static double CentigradoaFaren(double c) {
		
		double F=(c*9/5)+32;
		return F;
	}
	
	public static double FarenaCentigrados(double f) {
		
		double C=(f-32)*5/9;
		return C;
	}
	public static void main(String[] args) {
		double Celsius;
		double Farenheit;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce Celsius: ");
		Celsius=sc.nextDouble();
		System.out.println("son: "+CentigradoaFaren(Celsius) +" farenheit ");
		
		System.out.println("Introduce Farenheit: ");
		Farenheit=sc.nextDouble();
		System.out.println("son: "+FarenaCentigrados(Farenheit)+" celsius ");
		sc.close();
	
	}

}
