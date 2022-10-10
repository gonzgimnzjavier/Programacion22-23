package POO;

public class Coche extends Object{
	
	//ATRIBUTOS
	int numero_ruedas;
	String color;
	String marca;
	String modelo;
	int numero_de_puertas;
	double consumo;
	int potencia;
	
	//constructor sin parametros
	public Coche() {
		
	}
	
	
	//constructor con todos los parametros
	public Coche(int numero_ruedas, String color, String marca, String modelo, int numero_de_puertas, double consumo,
			int potencia) {
		super();
		this.numero_ruedas = numero_ruedas;
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.numero_de_puertas = numero_de_puertas;
		this.consumo = consumo;
		this.potencia = potencia;
	}
	//metodos
	
	public void arrancar() {
		System.out.println("esta arrancando");
	}
	public void frenar() {
		System.out.println("esta frenando");
	}
	public void acelerar() {
		System.out.println("dalle ghas blas");
	}
	public void acelerar(int c) {
		System.out.println("has acelerado"+c);
	}
	
	public void pasarITV() {
		System.out.println("rezar mucho");
	}
	
	
	
	@Override
	public String toString() {
		return "Coche [numero_ruedas=" + numero_ruedas + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo
				+ ", numero_de_puertas=" + numero_de_puertas + ", consumo=" + consumo + ", potencia=" + potencia + "]";
	}

	public static void main(String[] args) {
		
		Coche feo = new Coche(4, "marron","ni_se_sabe","antiguo", 2, 7.32, 14);
		
		feo.arrancar();
		feo.acelerar();
		feo.frenar();
		feo.pasarITV();
		
		System.out.println(feo.toString());
		
		
	}
	
}
