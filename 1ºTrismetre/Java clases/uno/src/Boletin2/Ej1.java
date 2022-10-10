package Boletin2;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		int horas;
		
		Scanner IntroduceHoras = new Scanner(System.in);
		System.out.println("Introduce el numero de horas: ");
		horas=IntroduceHoras.nextInt();
		System.out.println("\n");
		int semanas=horas/168;
		int dias=horas%168/24;
		int HorasEquivalentes=(horas%168)%24;
		System.out.println(horas +" horas equivalen a: ");
		if (semanas==1) {
			System.out.println(semanas+" semana ");
		}else {
		System.out.println(semanas+" semanas ");}
		if (dias==1) {
			System.out.println(dias +" dia ");
		}else{
		System.out.println(dias +" dias ");}
		if (HorasEquivalentes==1){
			System.out.println(HorasEquivalentes +" hora");
		}else {
		System.out.println(HorasEquivalentes+" horas ");}
		
	}

}


