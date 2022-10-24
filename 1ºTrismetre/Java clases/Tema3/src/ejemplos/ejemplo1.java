package ejemplos;

import java.util.Scanner;

public class ejemplo1 {
	public static void main(String[] args) {
		int a = 4;
		Scanner sc = new Scanner(System.in);
		System.out.println("dame valor de a:");
		a=sc.nextInt();
		System.out.println("has introducido el valor para a:" +a);
		//ejemplo de if
		if (a == 4) {
		System.out.println("La variable es igual a 4");
		}
		//ejemplo de if-else
		if (a > 5) {
		System.out.println("La variable es mayor a 5");
		}else{
		System.out.println ("La variable es menor que 6");
		}
		//ejemplo de elseif else
		if (a > 5) {
		System.out.println("La variable es mayor a 5");
		}else if(a == 5){
		System.out.println("La variable es igual a 5");
		}else{
		System.out.println ( "La variable es menor que 5");
		}
	}

}
