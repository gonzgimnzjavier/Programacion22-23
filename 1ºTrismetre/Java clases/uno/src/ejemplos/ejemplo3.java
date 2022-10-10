package ejemplos;

import java.util.Scanner;

public class ejemplo3 {
	public static void main (String[]args) {
		
		Scanner src = new Scanner(System.in);
		String nombre ="";
		int edad =0;
		
		//paso 1
		System.out.println("Dime tu nombre: ");
		
		//paso 2
		nombre = src.nextLine();
		
		//paso 3
		System.out.println("dime cuantos años tienes");
		
		//paso 4
		edad = src.nextInt();
		
		//paso 5
		System.out.println("Bienvenido a DAM " + nombre);
		System.out.println("tu edad es " + edad);
	}

}
