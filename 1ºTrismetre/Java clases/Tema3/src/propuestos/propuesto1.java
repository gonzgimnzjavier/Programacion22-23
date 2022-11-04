package propuestos;

import java.util.Scanner;

public class propuesto1 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor de a:");
		a=sc.nextInt();
		System.out.println("Introduce el valor de b:");
		b=sc.nextInt();
		System.out.println("Introduce el valor de c:");
		c=sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				if(b>c) {
					System.out.println("El mayor es a \nel siguiente es b \nel menor es c");
				}else {
					System.out.println("El mayor es a \nel siguiente es c \nel menor es b");
				}
				
			}else if(c>a) {
				System.out.println("El mayor es c \nel siguiente es a \nel menor es b");
			}
		}else if(b>a) {
				if(b>c) {
					if(a>c) {
						System.out.println("El mayor es b \nel siguiente es a \nel menor es c");
					}else {
						System.out.println("El mayor es b \nel siguiente es c \nel menor es a");
					}
			}else if (c>b) {
				System.out.println("El mayor es c \nel siguiente  es b \nel menor es a");
			}
		}
		
	}
}
