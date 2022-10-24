package PropuestosOctubre;

public class TestEntero {

	public static void main(String[] args) {
		
		
	//Creamos un constructor por defecto
		Entero defecto = new Entero();
		
	//Imprime por pantlla el valor de dicho metodo	
		System.out.println(defecto.toString());
		
		
	// Establecemos un valor para el construtor por defecto
		defecto.setValor(5);
	// y lo imprimimos por pantalla	
		System.out.println(defecto.toString());
		
		Entero Valuado = new Entero(6);
		
	//Probamos el metodo suma
	Valuado.suma(4);
	System.out.println(Valuado.toString());
	
	//Probamos el metodo resta
	
		Valuado.resta(4);
		System.out.println(Valuado.toString());
	
	//Probamos el metodo doble 
		
		Valuado.doble();
		System.out.println(Valuado.toString());
		
	//Probamos el metodo doble 
		
		Valuado.triple();
		System.out.println(Valuado.toString());
				
	}
	
	
	
}
