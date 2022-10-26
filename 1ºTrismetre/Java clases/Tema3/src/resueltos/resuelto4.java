package resueltos;

import java.util.Scanner;

/*- 4. Realiza un método que, dado un número de tres cifras, averigüe si es un número Armstrong. Un número es
Armstrong cuando la suma de cada uno de los números que lo componen elevado al número de dígitos de dicho
número da como resultado el propio número. Como esta definición es algo compleja, con la siguiente imagen se verá
más claro qué es un número Armstrong:*/

public class resuelto4 {
	
	public static void main(String[] args) {
		
		int num=0;
		int suma=0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("dime un numero de TRES cifras: ");
		num =sc.nextInt();
		int centena;
		int decena;
		int unidad;
		
		centena=num/100;			// 153 / 100 --->1
		decena= (num%100)/10;		// 53  / 10  --->5
		unidad= (num%100)%10;		// 53  % 10 ->>>>3
		
		//System.out.println("la centena es: "+centena +" la decena es: "+decena+" y la unidad es: "+unidad);
		suma= (int) (Math.pow(centena, 3.) +Math.pow(decena, 3) +Math.pow(unidad, 3));
		
		if(num==suma) {
			System.out.println(num+ " es armstrong");
		}else {
			System.out.println("no es armstrong");
		}
	}

}
