/*Quiero generar 40 
 * numeros entre 1 y 99 y 
 * mostrar un resultado final 
 * mostrando cuanto de ellos 
 * son pares*/

package resueltos;
public class Ejerciciodictao {
	public static int dameUnNumero(){
		return (int) (Math.random()*100);	
		}
	public static void main(String[] args) {
		int numero=0;
		char pilla;
		 char c=(char) dameUnNumero();
		//generamos 15 caracteres y los visualizamos 
		for (int i=0;i<40;i++) {
			pilla=(char) dameUnNumero();
		System.out.println("generando: "+pilla);
		if (   (c=='a') ||  (c=='e') ||  (c=='o') ||  (c=='i') ||  (c=='u')   ) { 
			numero++;  //numero=numero+1; contamos una vocal mas
		System.out.println("vocal");
		}
			//fin if
			else {
				System.out.println("consonante");
			}
			}
				//fin bucle for
						
		

		System.out.println("hemos generado " +numero +" vocales ");
		
		System.out.println("hemos genrado "+(15-numero)+ " consonates ");
	}
}
		
	
