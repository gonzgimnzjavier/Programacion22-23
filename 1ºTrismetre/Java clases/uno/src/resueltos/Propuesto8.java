package resueltos;

/*(Ejercicio de dificultad alta) Realiza un programa que genere letras aleatoriamente y determine si son vocales o
consonantes.*/
public class Propuesto8 {

	public static char getLetras(){
		return (char)(Math.random()*26 + 'a');
		}
	public static void main(String[] args) {
		int numero=0;
		char c;
		//generamos 15 caracteres y los visualizamos 
		for (int i=0;i<15;i++) {
			c=getLetras();
		System.out.println("generando: "+c);
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
		
		/* condicion para ser vocal 
		 * if (   (c=='a') ||  (c=='e') ||  (c=='o') ||  (c=='i') ||  (c=='u')   )  
				numero=numero+1;			//cuento otra vocal
		*/
		
			}
}
