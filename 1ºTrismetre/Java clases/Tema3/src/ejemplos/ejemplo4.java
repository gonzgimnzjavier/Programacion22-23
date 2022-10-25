package ejemplos;

public class ejemplo4 {

	public static void main(String[] args) {
		
		int numero=1;//Inicializando una variable
		
		while(numero<=10){ //evaluando una expresion logica
			// bucle que cuenta hasta 10
		System.out.println(numero);
		numero++;//incrementamos el valor de la variable
		}
		System.out.println("------------------------");
		numero=1;
		do {
			System.out.println(numero);
			numero++;//incrementamos el valor de la variable
		}while(numero<=10);
		
		System.out.println("------------------------");
		
		for(int i=1;  i<=10;  i++) {
			System.out.println(i);
		}
		
		System.out.println("\nFin de codigo...");
		
	}
	
}
