package Boletin2;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		double a;
		double b;
		double c; 
		double x1;
		double x2;
		Scanner IntroduceValorA= new Scanner(System.in);
		Scanner IntroduceValorB= new Scanner(System.in);
		Scanner IntroduceValorC= new Scanner(System.in);
		System.out.println("Introduce el valor de \"a\":");
		a=IntroduceValorA.nextDouble();
		System.out.println("Introduce el valor de \"b\":");
		b=IntroduceValorB.nextDouble();
		System.out.println("Introduce el valor de \"c\":");
		c=IntroduceValorC.nextDouble();
		if (Math.pow(b, 2.0)-(4*a*c) >0){
		x1=(-b+Math.sqrt(Math.pow(b, 2.0)-(4*a*c)))/(2*a);
		x2=(-b-Math.sqrt(Math.pow(b, 2.0)-(4*a*c)))/(2*a);
		System.out.println("\"x1\" es igual a :" +"\n" +x1);
		System.out.println("\"x2\" es igual a :" +"\n" +x2);
		System.out.println("dos raices reales");
		}
		else if(Math.pow(b, 2.0)-(4*a*c) ==0){
			x1=(-b+Math.sqrt(Math.pow(b, 2.0)-(4*a*c)))/(2*a);
			x2=(-b-Math.sqrt(Math.pow(b, 2.0)-(4*a*c)))/(2*a);
			System.out.println("\"x1\" es igual a :" +"\n" +x1);
			System.out.println("\"x2\" es igual a :" +"\n" +x2);
			System.out.println("una raiz repetida");
		}
		else {
			x1=(-b+Math.sqrt(Math.pow(b, 2.0)-(4*a*c)))/(2*a);
			x2=(-b-Math.sqrt(Math.pow(b, 2.0)-(4*a*c)))/(2*a);
			System.out.println("\"x1\"no tiene soluciones reales" +"\n");
			System.out.println("\"x2\" no tiene soluciones reales" +"\n");
		}
	}
}

