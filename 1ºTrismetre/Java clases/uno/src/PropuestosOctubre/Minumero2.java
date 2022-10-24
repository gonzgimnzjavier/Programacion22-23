package PropuestosOctubre;

public class Minumero2 {

	double valor;
	
	Minumero2(double v){
		this.valor=v;
	}

	@Override
	public String toString() {
		return "Minumero2 [valor=" + valor + "]";
	}
	
	public double doble() {
		return this.valor * 2;
	}
	public double triple() {
		return this.valor * 3;
		}
	public double cuadruple() {
		return this.valor * 4;
	}
}
