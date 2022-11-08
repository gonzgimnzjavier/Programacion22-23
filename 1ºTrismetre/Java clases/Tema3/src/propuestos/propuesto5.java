package propuestos;

import java.util.Scanner;

public class propuesto5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia,mes,ano;
		int ln1;
		
		System.out.println("Introduce el dia:");
		dia=sc.nextInt();
		
		System.out.println("Introduce el mes:");
		mes=sc.nextInt();
		
		System.out.println("Introduce el ano:");
		ano=sc.nextInt();
		
		ln1=dia+mes+ano;
		
		int centena1=ln1/100;
		
		int decena1=((ln1%100)/10);
		
		int unidad1=((ln1%100)%10);
		
		int ln2=centena1+decena1+unidad1;
				int decena2=ln2/10;
				int unidad2=ln2%10;
				int ln3=decena2+unidad2;
				if(ln3>=10) {
					int decena3=ln3/10;
					int unidad3=ln3%10;
					int ln4=decena3+unidad3;
					System.out.println("Tu Lucky number es: "+ln4);
				}else {
					System.out.println("Tu Lucky number es: "+ln3);
				}	
	}

}
