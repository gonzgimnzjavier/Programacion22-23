package ejemplos;

import java.util.Scanner;

public class ejemplo2 {
	
	public static void main(String[] args) {
		
		int matematicas =0, lengua =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("nota de mates:");
		matematicas =sc.nextInt();
		System.out.println("nota de lengua: ");
		lengua=sc.nextInt();
		
		if (matematicas >=5 && lengua >=5) {
			System.out.println("HAS APROBADO TODAS");
		}else if (matematicas >=5 && lengua <=5) {
			System.out.println("HAS APROBADO MATEMATICAS PERO SUSPENDIDO LENGUA");
		}else if  (matematicas <=5 && lengua >=5) {
			System.out.println("HAS APROBADO LENGUA PERO SUSPENDIDO MATEMATICAS");
		}else if(matematicas <=5 && lengua <=5){
			System.out.println("HAS SUSPENDIDO TODAS");
		}
	}
}
