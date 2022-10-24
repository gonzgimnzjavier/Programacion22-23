package ejemplos;

import java.util.Scanner;

public class ejemplo3 {
	
	public static void main(String[] args) {
	int mes=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("dime numero del mes: ");
	mes = sc.nextInt();
	
	switch (mes) {
	case 1,3,5,7,8,10,12:
		System.out.println("Tiene 31 dias");
		break;
	case 2:
		System.out.println("Tiene 28 dias");
		break;
	case 4,6,9,11:
		System.out.println("Tiene 30 dias");
		break;
	}
	}

}
