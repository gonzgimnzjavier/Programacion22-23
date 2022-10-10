package resueltos;

public class Resuelto_rango_random {
	
	//queremos numeros entre 127 y 318 Ambos incluidos
	
	public static int dameUnNumero() {
		
	int numero=0;
	
	numero=(int) (127+ Math.random()* (  (318+1)- 127) );
		return numero;
	}
	
	
	public static void main(String[] args) {
		
		//bucle de repeticion de un numero conocido de veces
		for(int i=0;i<100;i++) {
		System.out.println(dameUnNumero());
		}
	}
		
		
	}


