package resueltosOctubre;

public class TestRESUELTO2 {
	
	public static void main(String[] args) {
		
		RESUELTO2 Coche;
		Coche= new RESUELTO2();
		
		System.out.println(Coche.toString());
		Coche.acelera(20);
		Coche.frena(7);
		System.out.println(Coche.getVelocidad());
		
		System.out.println(Coche.toString());
		
		
	}

}
