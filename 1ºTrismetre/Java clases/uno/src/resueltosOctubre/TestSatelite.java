package resueltosOctubre;

public class TestSatelite {
public static void main(String[] args) {
	
	//Se crea un nuevo satelite
	Satelite Luna= new Satelite();
	
	Satelite Aguacate= new Satelite();
	
	//Se utiliza el metodo setPosicion sin parametros
	Luna.setPosicion(0, 0, 0);
	
	/*Se crea un metodo que devuelva por pantlla
	los parametros establecidos*/
	System.out.println(Luna.toString());
	
	/*Se utiliza el metodo para establecer
	la posicion del satelite esta vez con parametros*/
	Aguacate.setPosicion(95.7,23.42, 47.21);
	
	/*Se crea un metodo que devuelva por pantalla 
	los parametros establecidos*/
	
	System.out.println(Aguacate.toString());
}
}
