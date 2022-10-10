package ejemplos;

public class ejemplo4 {

	//ejemplo de tipos de info o tipos de dato
	public static void main(String[] args) {
		
		byte a=2;
		System.out.println("variable a (byte): " +a);
		short b, c=3;
		
		b=14;
		System.out.println("variable b (short): " +b);
		System.out.println("variable c (short): " +c);
		
		
		int d = -30;
		int e = 0xC125;
		System.out.println("variable d (int): " +d);
		System.out.println("variable c (int): " +e);
		
		
		long f = 434123 ;
		long g = 5L ; /* la L en este caso indica Long*/
		System.out.println("variable f (long): " +f);
		System.out.println("variable g (long): " +g);
		
		char car1 = 'c';
		char car2 = 99; /*car1 y car2 son lo mismo porque el 99 en decimal es la ‘c’ */
		System.out.println("variable car1 (char): " +car1);
		System.out.println("variable car2 (char): " +car2);
		
		
		float pi =  (float) 3.1416;
		float pi2 = 3.1416F; /* la F en este caso indica Float*/
		System.out.println("variable pi (fl): " +pi);
		System.out.println("variable pi2 (float): " +pi2);
		
		float medio = 1		/		2F; /*0.5*/
		System.out.println("variable medio (float): " +medio);
		
		double millon = 1e6; /* 1x106 */
		double medio2 = 1/2D; /*0.5 la D en este caso indica Double*/
		System.out.println("variable millon (dob): " +millon);
		System.out.println("variable medio2 (dob): " +medio2);
		
	}
}
