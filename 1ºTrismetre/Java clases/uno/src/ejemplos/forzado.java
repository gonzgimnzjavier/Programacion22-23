package ejemplos;

public class forzado {
	
	public static void main(String[] args) {
		
	//	int idato=5;
	//	byte bdato;
		double despues;
		float chico;
		double grande= 3.154D; 
		System.out.println("mostrando valor de grande: "+grande);
		
	//	bdato= (byte) idato;
		chico= (float) grande; 
		
		System.out.println("mostrando el valor guardado en chico: "+chico);
	//	System.out.println(bdato);	//	sacará 5 por pantalla 
		
		despues= chico; 
		System.out.println("Mostrando el valor guardado en despues: "+despues);
	}

}
