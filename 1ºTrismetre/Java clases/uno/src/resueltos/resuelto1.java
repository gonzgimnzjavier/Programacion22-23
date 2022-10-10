package resueltos;

public class resuelto1 {

	public static char getLetras(){
		return (char)(Math.random()*26 + 'a');
		}
	
		public static void main(String[] args) {
			
			
		/*	System.out.println( Math.round(Math.random()*26));
			System.out.println( Math.round(Math.random()*26));		
			System.out.println( Math.round(Math.random()*26));
			System.out.println( Math.round(Math.random()*26));	
			System.out.println( Math.round(Math.random()*26));*/			
		
			//llamamos cuatro veces al metodo
			//obteniendo 4 caracteres 
		System.out.println("generando: "+		getLetras()	);
		System.out.println("generando: "+	getLetras());
		System.out.println("generando: "+	getLetras());
		System.out.println("generando: "+	getLetras());
		}
}

