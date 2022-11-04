package repasos;

import java.util.Scanner;

public class ejercicio1 {
	
	public static void main(String[] args) {
		int altura;
		String genero;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce tu altura en cm:");
		altura=sc.nextInt();
		
		System.out.println("Introduce tu genero:");
		genero=sc.next();
		
		switch(genero) {
		case "masculino":
			int pesoidealh=altura-110;
			System.out.println("tu peso ideal es " +pesoidealh +" kg" );
			
			break;
			
		case "femenino":
			int pesoidealm=altura-120;
			System.out.println("tu peso ideal es " +pesoidealm +" kg");
			
			break;
		
		default:
			System.out.println("ERROR el genero introducido debe ser masculino o femenino:");
		}
	}

}
