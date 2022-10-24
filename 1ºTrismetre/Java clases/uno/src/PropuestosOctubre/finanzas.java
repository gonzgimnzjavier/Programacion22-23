package PropuestosOctubre;

public class finanzas {
	
	static double cambio;
	final static double CAMBIO_POR_DEFECTO=1.36;
	
public static double EuroaDolar(double e) {
		
		double d=e/cambio;
		return d;
	}
	
public static double DolarAeuro(double d) {
		
		double e=d*1.05;
		return e;
		
	}
	
	
	finanzas(){
		this.cambio=CAMBIO_POR_DEFECTO;
	}
	finanzas(double c){
		this.cambio=c;
	}
	

	
	

	@Override
	public String toString() {
		return "finanzas []";
	}

	public static void main(String[] args) {}

}
