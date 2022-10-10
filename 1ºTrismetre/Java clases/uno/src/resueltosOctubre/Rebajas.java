package resueltosOctubre;

import java.util.Scanner;

import java.util.Scanner;

public class Rebajas {

	public static double descubrePorcentaje(double original, double actual) {
	return(original-actual)*100/original;}
	
	//construir un metodo al que le pasemos el precio actual y el porcentaje
	//y nos devuelve el precio original
	
	public static double descubreOriginal(double actual, double porcentaje) {
		return actual/(1-porcentaje/100);
		
	}
	
	//construye por ultimo un metodo al que le pasemos el precio original y 
	//un porcentaje de descuento y nos de el precio final al que nos sale el articulo
	
	public static double descubreNuevo(double original, double porcentaje) {
		return  original - (original*porcentaje/100);
	}
	
	
	public static void main(String[] args) {
		
	
	boolean sigue=true;
		
	double antiguo, rebajado;
	
	double actual, porcentaje;
	
	double noriginal, nporcentaje;
	 
	int opcion=0;
	Scanner sc= new Scanner(System.in);
	
	while(sigue) {
		
	System.out.println("Pulse 1 para descubrir el porcentaje:\n");
	
	System.out.println("Pulse 2 para descubrir el precio original:\n");
	
	System.out.println("Pulse 3 para descubrir nuevo precio de un porcentaje:\n");
	
	System.out.println("Pulse 4 para salir:\n");
	
	opcion=sc.nextInt();
	
	
	
	switch(opcion) {
	
	case 1:
	System.out.println("\nIntroduce precio original:");
	antiguo=sc.nextDouble();
	System.out.println("Introduce precio rebajado:");
	rebajado=sc.nextDouble();
	System.out.println("\nSe ha rebajado un " +descubrePorcentaje(antiguo,rebajado)+"%"+"\n");
	break;
	case 2:
		System.out.println("\nIntroduce precio actual:");
		actual=sc.nextDouble();
		System.out.println("Introduce porcentaje rebajado:");
		porcentaje=sc.nextDouble();
		System.out.println("\nEl precio original es de " +descubreOriginal(actual,porcentaje)+" euros\n");
		break;
	case 3:
		System.out.println("\nIntroduce original:");
		 noriginal = sc.nextDouble();
		 System.out.println("Porcentaje que te descuentan:");
		 nporcentaje=sc.nextDouble();
		 System.out.println("\nEl precio nuevo es de " +descubreNuevo(noriginal, nporcentaje)+" euros\n");
		break;
	case 4:
		sigue=false;
		System.out.println("Saliendo...\n");
		System.out.println("Has salido.");
		break;
	default:
		System.out.println("opcion no valida");
		
	}
	
	}
		sc.close();
	}
}