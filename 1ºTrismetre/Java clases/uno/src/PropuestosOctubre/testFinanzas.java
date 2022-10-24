package PropuestosOctubre;

import java.util.Scanner;

public class testFinanzas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double aux=0d;
		int opcion=0;
		System.out.println("Pulsa 1 cambio por defecto:/n"
				+"Pulsa 2 para introducir tu cambio:");
		opcion=sc.nextInt();
		//Probamos constructor por defecto
		if(opcion ==1) {
		finanzas enero= new finanzas();
		System.out.println(enero.toString());
		
		
		System.out.println("Pulsa 2 cambio por defecto:");
		
				
		System.out.println("Introduce Euros: ");
		aux=sc.nextDouble();
		System.out.println("son: "+enero.EuroaDolar(aux));
		System.out.println("Introduce Dolares: ");
		aux=sc.nextDouble();
		System.out.println("son: "+enero.DolarAeuro(aux));
		}
		else {
		
			System.out.println("que cambio deseas??");
			aux=sc.nextDouble();
			
		//Probamos constructor por defecto
		finanzas octubre= new finanzas();
		System.out.println(octubre.toString());
		
		
		System.out.println("Introduce Euros: ");
		aux=sc.nextDouble();
		System.out.println("son: "+octubre.EuroaDolar(aux) +"dolares");
		System.out.println("Introduce Dolares: ");
		aux=sc.nextDouble();
		System.out.println("son: "+octubre.DolarAeuro(aux) +"euros");
		}
		
		sc.close();

	}

}
