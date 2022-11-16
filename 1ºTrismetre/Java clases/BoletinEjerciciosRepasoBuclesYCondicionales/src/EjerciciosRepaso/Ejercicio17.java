package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio17 {
	
	/*Una empresa que se dedica a la venta de desinfectantes
necesita un programa para gestionar las facturas. En cada
factura figura: el código del artículo, la cantidad vendida en
litros y el precio por litro.
Se pide de 5 facturas introducidas: Facturación total, cantidad
en litros vendidos del artículo 1 y cuantas facturas se
emitieron de más de 600 €.*/
	
	public static void main(String[] args) {
		
		int codigo;
		
		double litrosvendidos;
		
		double preciolitros;
		
		int contador=1;
		
		double total;
		
		int masde600=0;
		
		
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los datos del "+contador+"º articulo\n");
		System.out.println("Introduce el codigo:");
		codigo=sc.nextInt();
		System.out.println("Introduce litros que desea comprar:");
		litrosvendidos=sc.nextDouble();
		System.out.println("Ingresa el precio:");
		preciolitros=sc.nextDouble();
		total=litrosvendidos*preciolitros;
		System.out.println("Facturacion "+total+"€\n");
		contador++;
		if(total>600)
			masde600++;
		}while(contador<6);
		System.out.println("Se han emitido "+masde600+" facturas con precios superiores a 600€");
	}

}
