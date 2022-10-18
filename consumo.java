package resueltosOctubre;
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
	
	
	public double tiempo() {
		double aux=0;
		return aux;	
	}
	
	public String consumoMedio() {
		String aux="";
		
		return aux;
	}
	
	public double consumoEuros() {
		double aux=0;
		
		return aux;
	}

	

}
