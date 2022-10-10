package resueltos;

import java.util.Scanner;

public class propuesto6 {

	public static void main(String[] args) {
				
				Scanner IntroduceLado1= new Scanner(System.in);
				int lado1=0;
				System.out.println("Introduce valor entero (lado1): ");
				lado1=IntroduceLado1.nextInt();
				Scanner IntroduceLado2= new Scanner(System.in);
				int lado2=0;
				System.out.println("Introduce valor entero (lado2): ");
				lado2=IntroduceLado2.nextInt();
				int perimetro =2*lado1 + 2*lado2;
				int area=lado1*lado2;
				System.out.println("El perimetro es: "+perimetro);
				System.out.println("El area es: "+area);
		
		
	}
}
