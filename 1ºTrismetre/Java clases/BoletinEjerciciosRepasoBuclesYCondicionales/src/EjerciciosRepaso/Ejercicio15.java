package EjerciciosRepaso;

/*Dadas las edades y alturas de 5 alumnos, mostrar la edad y
la estatura media, la cantidad de alumnos mayores de 18 años, y
la cantidad de alumnos que miden más de 1.75.*/

import java.util.Scanner;

public class Ejercicio15 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador1=1;
		
		int edad;
		
		double altura;
		
		int sumaedad=0;
		
		double sumaaltura=0;
		
		int contador2=0;
		
		int mayoresde175=0;
		
		int mayoresdeedad=0;
		
		do {
		
		System.out.println("Introduce la edad del "+contador1+"º alumno:");
		edad=sc.nextInt();
		if(edad>=18) {
			mayoresdeedad++;
		}
		sumaedad+=edad;
		System.out.println("Introduce la estatura del "+contador1+"º alumno:");
		altura=sc.nextDouble();
		if(altura>=1.75) {
			mayoresde175++;
		}
		sumaaltura+=altura;
		contador1++;
		contador2++;
		
		
		}while(contador2<5);
		System.out.println("la altura media es de "+sumaaltura/contador2+" habiendo "+mayoresde175+" alumnos con altura superior a 1,75m\n");
		System.out.println("La edad media es de "+sumaedad/contador2 +" habiendo "+mayoresdeedad+" alumnos mayores de edad.");
	}

}
