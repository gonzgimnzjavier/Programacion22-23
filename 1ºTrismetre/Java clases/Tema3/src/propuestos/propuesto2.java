package propuestos;

public class propuesto2 {

	public static void main(String[] args) {
		
		System.out.println("columnas j->12345");
		for( int i=1; i<=5; i++) {
			System.out.print("fila i= "+i+ "--->");
			for( int j=1; j<=i; j++) {
			System.out.print("*");
		}
			System.out.println();
	}
}
}
