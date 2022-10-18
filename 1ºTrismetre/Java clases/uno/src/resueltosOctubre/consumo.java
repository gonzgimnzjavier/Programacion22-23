package resueltosOctubre;

import java.util.Scanner;

/*9. Implementa una clase consumo, la cual forma parte de la centralita electrónica de un coche y tiene las siguientes
características:
Atributos
kms. Kilómetros recorridos por el coche,
litros. Litros de combustible consumido,
vmed. Velocidad media,
pgas. Precio de la gasolina.*/
public class consumo {
	
	//Atributos
	
	 double kms;
	
	 double litros;
	
	 double velocidadmedia;
	
	 double pgas;
	
	//Constructor

	public consumo(double kms, double litros, double velocidadmedia, double pgas) {
		this.kms = kms;
		this.litros = litros;
		this.velocidadmedia = velocidadmedia;
		this.pgas = pgas;
	}
	
	//Metodos 
	
	@Override
	public String toString() {
		return "consumo [kms=" + kms + ", litros=" + litros + ", velocidadmedia=" + velocidadmedia + ", pgas=" + pgas
				+ "]";
	}
	
	//Indica el tiempo empleado en realizar el viaje
	public double tiempo() {
		double aux=kms/velocidadmedia;
		return aux;	
	}
	//consumo medio del vehiculo (en litros cada 100km)
	public double consumoMedio() {
		double aux=(litros/kms)*100;
		
		return aux;
	}
	//consumo medio del vehiculo (cada 100kms)
	public double consumoEuros() {
		double aux=(litros*pgas/kms)*100;
		
		return aux;
	}
	
	public static void main(String[] args) {
		double kms, litros, velocidadmedia, pgas;
		Scanner sc = new Scanner (System.in);
		System.out.println("dime kms: ");
		kms=sc.nextDouble();
		System.out.println("dime litros: ");
		litros=sc.nextDouble();
		System.out.println("dime velocidad media: ");
		velocidadmedia=sc.nextDouble();
		System.out.println("dime precio de la gasolina: ");
		pgas=sc.nextDouble();
		
		consumo c = new consumo(kms, litros, velocidadmedia, pgas);
		System.out.println(c.toString());
		
		//metodo tiempo
		System.out.println("el tiempo del viaje es: "+ c.tiempo());
		//metodo consumo/100kms
		System.out.println(c.consumoMedio());
		// metodo consumo en euros cada 100km 
		System.out.println(c.consumoEuros());
	}

	

}
