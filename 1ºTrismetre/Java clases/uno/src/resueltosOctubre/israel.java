package resueltosOctubre;
/*Modifica el programa anterior creando una clase que permita almacenar los kilos de papas y chocos del
restaurante. Implementa los siguientes métodos:
public void addChocos(int x). Añade x kilos de chocos a los ya existentes.
public void addPapas(int x). Añade x kilos de papas a los ya existentes.
public int getComensales(). Devuelve el número de clientes que puede atender el restaurante (este es el
método anterior).
public void showChocos(). Muestra por pantalla los kilos de chocos que hay en el almacén.
public void showPapas(). Añade Muestra por pantalla los kilos de papas que hay en el almacén.*/

public class israel {
	//atributos
	private double patatas; //en kilos
	private double chocos; //en kilos
	
	//constructor por defecto 
	public israel() {
		patatas=0;
		chocos=0;
	}
	//constructor con parametros

	public israel(double p, double c) {
		super();
		this.patatas = p;
		this.chocos = c;
	}

	@Override
	public String toString() {
		return "israel [patatas=" + patatas + ", chocos=" + chocos + "]";
	}
	
	//getters y setters

	public double getPatatas() {
		return patatas;
	}

	public void setPatatas(double patatas) {
		this.patatas = patatas;
	}

	public double getChocos() {
		return chocos;
	}

	public void setChocos(double chocos) {
		this.chocos = chocos;
	}
	
	//metodos add
	
	public void addPatatas(double x) {
		patatas+=x;
	}
	public void addChocos(double y) {
		chocos+=y;
	}
		public int numeroClientes() {
			int com=0;
			if(patatas>=1 && chocos>=0.5) {
			//SU CODIGO AQUI
			if(patatas>2*chocos) {
				//sobran patatas o se me acaban los chocos
				com=(int)  (3*(2*chocos));
				patatas-=2*chocos;	
				//ultimo
				chocos-=chocos;
				
			}
			else {
				//sobran chocos y faltan patatas
				com=(int) (3*patatas);
				chocos-=patatas/2;
				//por ultimo
				patatas-=patatas;		
			}
			//fin de su codigo aqui
			}else {
				System.out.println("no prepraramos plato");
			}
			return com;
		}
	

}
