package resueltos;

import java.util.Scanner;

public class resuelto4 {

public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	System.out.println("introduce numero:");
	int numero= sc.nextInt();
	
	int milesima;
	int centesima;
	int decima;
	int unidad; 
	
	milesima= numero/1000;
	centesima= ((numero%1000)/100);
	decima= (((numero%1000)%100)/10);
	unidad= (((numero%1000)%100)%10);
	
	int armstrong=  (int) ((Math.pow(milesima, 4)) + (Math.pow(centesima, 4)) + (Math.pow(decima, 4)) + (Math.pow(unidad, 4)));
	
	if (numero == armstrong) {
		System.out.println("Es armstrong");
	}else {System.out.println("no es armstrong");}
	
}

}