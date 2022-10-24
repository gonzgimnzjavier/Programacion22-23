package PropuestosOctubre;

import java.util.Scanner;

public class Minumero {
		
		public static double ObtenerDoble(double numero) {
			return numero*2;}
			
		public static double ObtenerTriple(double numero) {
				return numero*3;}
				
		public static double ObtenerCuadruple(double numero) {
					return numero*4;}
			
		public static void main(String[] args) {
			double numero;
			Scanner sc= new Scanner(System.in);
			System.out.println("Introduce un numero:");
			numero=sc.nextDouble();
			System.out.println("El doble de "+numero  +" es " +ObtenerDoble(numero));
			System.out.println("El triple de "+numero  +" es "+ObtenerTriple(numero));
			System.out.println("El cuadruple de "+numero  +" es "+ObtenerCuadruple(numero));
			
			//Prueba de los metodos
			
			/*Si damos valor a la variable numero por ejemplo "2" se devolvera por pantalla
			 * El doble "4", el triple "6" y el cuadruple "8"
			 */
			
			/*
			double numero=2;
			System.out.println("El doble de "+numero  +" es " +ObtenerDoble(numero));
			System.out.println("El triple de "+numero  +" es "+ObtenerTriple(numero));
			System.out.println("El cuadruple de "+numero  +" es "+ObtenerCuadruple(numero));
			*/
			
		}

	}

