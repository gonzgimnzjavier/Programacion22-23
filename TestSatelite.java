package resueltosOctubre;

import java.util.Scanner;

public class TestSatelite {
public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);

double aux1, aux2, aux3;

Satelite azul;

//pide datos para usar un constructor completo
System.out.println("Cual es el meridiano del satelite");
aux1 =sc.nextDouble();
System.out.println("Cual es el paralelo del satelite");
aux2 =sc.nextDouble();
System.out.println("Cual es la altura del satelite");
aux3 =sc.nextDouble();

//creamos objeto azul
azul = new Satelite (aux1,aux2, aux3);
}
}

