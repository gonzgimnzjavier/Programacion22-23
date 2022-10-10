package POO;

public class Pajarov2 {
	
	
		///*** atributos o propiedades ****
		//atributo de CLASE
		//sirve para llevar la cuenta de los pajaros que se han creado 
		private static int numpajaros=0;
		
		//Los de siempre
		private char color; //propiedad o atributo color
		private int edad; //propiedad o atributo edad
		
		//*** métodos de la clase ****
		//metodo de clase que incrementa el numero de pajaros existentes en 1
		static void nuevopajaro(){
			numpajaros++;
			}
			//defecto
		Pajarov2 () {
			color = 'v'; 
			//edad=0;
			nuevopajaro ();
			muestrapajaros();
			}
		Pajarov2(char c, int e){
			color = c; 
			edad = e; 
			nuevopajaro();
			muestrapajaros();
			}
		//metodo de CLASE no necesito ningun objeto para llamarlo
		static void muestrapajaros(){
			System.out.println(numpajaros);
			}
		
		//metodo dinamico o de objeto
		@Override
		public String toString() {
			return "Pajarov2 [color=" + color + ", edad=" + edad + "]";
		}


}
