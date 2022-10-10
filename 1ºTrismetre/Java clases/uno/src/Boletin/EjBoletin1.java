package Boletin;

import java.util.Scanner;

public class EjBoletin1 {
public static void main(String[] args) {
	double radio;
	double superficie;
	double volumen;
	double Pi = 3.14159;
	Scanner IntroduceElradio = new Scanner(System.in);
	System.out.println("Introduce el radio: ");
	radio=IntroduceElradio.nextDouble();
	superficie=4*Pi*Math.pow(radio, 2.0);
	System.out.println("La superficie es: "+superficie);
	volumen=4/3*Pi*Math.pow(radio, 3.0);
	System.out.println("El volumen es: "+volumen);
}
}
