package resueltosOctubre;

public class testconsumo {
	
	public static void main(String[] args) {
		

	
	consumo rojo = new consumo(2500, 50, 120, 200);
	
	System.out.println("el consumo es de:" +rojo.consumoMedio() +"litros");
	
	System.out.println("el consumo en euros es de:" +rojo.consumoEuros());
	
	System.out.println("tardas" +rojo.tiempo());

}
}