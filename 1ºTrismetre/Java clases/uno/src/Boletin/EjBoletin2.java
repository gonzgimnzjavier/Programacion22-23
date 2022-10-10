package Boletin;

import java.util.Scanner;

public class EjBoletin2 {
public static void main(String[] args) {
	double peso;
	double altura;
	double Ims;
	Scanner IntroducePeso= new Scanner(System.in);
	Scanner IntroduceAltura= new Scanner(System.in);
	System.out.println("Introduzca su peso: ");
	peso=IntroducePeso.nextDouble();
	System.out.println("Introduzca su altura: ");
	altura=IntroduceAltura.nextDouble();
	Ims=peso/Math.pow(altura, 2.0);
	System.out.println("Su indice de masa corporal es de: "+Ims);
	if (Ims<18){
		System.out.println("No estas sano");
	}
	if (Ims>18 && Ims<25) {
		System.out.println("Estas sano");
	}
	if (Ims>25) {
		System.out.println("No estas sano");
	}
	
}
}
