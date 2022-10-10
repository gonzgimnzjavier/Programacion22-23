package resueltos;

public class Ejercicio_Primitiva {

	public static int dameUnNumero(){
		int numero=0;
		numero=  (int) (1 + Math.random()*( (49+1)-1));
		return numero;
	}
		
	
		public static void main(String[] args) {

			//llamamos cuatro seis veces al metodo obteniendo 6 NUMEROS ENTEROS 
		System.out.println("generando: "+	dameUnNumero()	);
		System.out.println("generando: "+	dameUnNumero());
		System.out.println("generando: "+	dameUnNumero());
		System.out.println("generando: "+	dameUnNumero());
		System.out.println("generando: "+	dameUnNumero());
		System.out.println("generando: "+	dameUnNumero());
		
		}
}

