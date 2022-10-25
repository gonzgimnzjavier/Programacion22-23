package resueltos;

import java.util.Scanner;

public class multiplica {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un numero de 1 a 10");
		int num=sc.nextInt();
		
		System.out.println("tabla de multiplicar del "+num);
		
		for (int i=1; i<=10; i++) {
			System.out.println(num+ " x "+i+ " es "+(5*1));
		}
	}

}
