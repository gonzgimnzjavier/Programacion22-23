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
		int milesima;
		int centena;
		int decena;
		int unidad;
		milesima=num/1000;
		centena=(num%1000)/100;		
		decena= ((num%1000)%100)/10;		
		unidad= (((num%1000)%100)%10);		
		
		//System.out.println("la centena es: "+centena +" la decena es: "+decena+" y la unidad es: "+unidad);
		suma= (int) (Math.pow(milesima, 4) +Math.pow(centena, 4) +Math.pow(decena, 4) +Math.pow(unidad, 4));
		
		if(num==suma) {
			System.out.println(num+ " es armstrong");
		}else {
			System.out.println("no es armstrong");
		}
	}

}
