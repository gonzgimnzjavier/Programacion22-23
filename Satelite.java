package resueltosOctubre;

//propuesto 5

/*
Modifica la clase satélite y añádele los siguientes métodos:
Método void variaAltura(double desplazamiento). Este método acepta un parámetro que será positivo o
negativo dependiendo de si el satélite tiene que alejarse o acercarse a La Tierra.
Método boolean enOrbitaQ. Este método devolverá false si el satélite está en tierra y true en caso
contrario.
Método void variaPosicion(double variap, double variam). Este método permite modificar los atributos de
posición (meridiano y paralelo) mediante los parámetros variap y variam. Estos parámetros serán valores
positivos o negativos relativos que harán al satélite modificar su posición.
*/
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
	public void variaAltura(double desplazamiento) {
		//distancia_tierra=distancia_tierra+desplazamiento;
		distancia_tierra+=desplazamiento;
	}
	
	public boolean enOribita() {
		if(distancia_tierra==0)
		{return false;}
		else {return true;}
	}
	
	public void variaCoordenadas(double variap, double variam) {
		paralelo+=variap;
		meridiano+=variam; }
}
	
	/* public void variaPosicion(double p; double d) {
		paralelo+=p;
		meridiano+=m;

}*/
	

