package propuestos;

import java.util.Scanner;

/*1. Realiza un programa con tres variables de tipo entero a, b y c. El programa deberá mostrar por pantalla el valor
menor y mayor.*/

public class propuesto1 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce a:");
		a=sc.nextInt();
		System.out.println("Introduce b:");
		b=sc.nextInt();
		System.out.println("Introduce c:");
		c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("el mayor es a");
			if (b>c) {
				System.out.println("el siguiente mas grande es b\nel menor es c");
			}else {
				System.out.println("el siguiente mas grande es c\nel menor es b");
			}
		}else if (b>a && b>c) {
			System.out.println("el mayor es b");
			if (a>c) {
				System.out.println("el siguiente mas grande es a\nel menor es c");
			}else {
				System.out.println("el siguiente mas grande es c\nel menor es a");
			}
		}else if (c>b && c>a) {
			System.out.println("el mayor es c");
			if (b>a) {
				System.out.println("el siguiente mas grande es b\nel menor es a");
			}else {
				System.out.println("el siguiente mas grande es a\nel menor es b");
			}
		}
	}

}
