package PropuestosOctubre;

import java.util.Scanner;

public class MainPalestina {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double p; //en kilos
		double c; //en kilos
		
		System.out.println("cuantos kilos de patatas hay??");
		p=sc.nextDouble();
		System.out.println("cuantos kilos de chocos hay??");
		c=sc.nextDouble();
		palestina almacen = new palestina(c, p);
		System.out.println(almacen.toString());
		
		System.out.println("El numero de comensales es: "+almacen.numeroClientes());

		System.out.println(almacen.toString());
}
}
