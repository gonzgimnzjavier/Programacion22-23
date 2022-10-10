package resueltosOctubre;

public class Satelite {
	
	
	//Atributos
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	
	//Constructor con todos los atributos
	Satelite (double m,double p,double d){
	meridiano=m;
	paralelo=p;
	distancia_tierra=d;
	}
	 // constructor sin atributos
	Satelite (){
	meridiano=paralelo=distancia_tierra=0;
	}
	//Metodo set de todos los atributos
	public void setPosicion(double m,double p,double d){
	meridiano=m;
	paralelo=p;
	distancia_tierra=d;
	}
	@Override
	public String toString() {
		return "Satelite [meridiano=" + meridiano + ", paralelo=" + paralelo + ", distancia_tierra=" + distancia_tierra
				+ "]";
	}
	
	
	

}
