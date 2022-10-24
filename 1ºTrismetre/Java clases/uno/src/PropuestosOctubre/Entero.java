package PropuestosOctubre;

public class Entero {
	
	//atributo
	int valor;

	
	
	
	//dos constructores
	Entero(){
	this.valor=0;
	}
	Entero(int v){
	valor=v;
	}
	
	
	
	//varios metodos
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int doble() {
		return this.valor * 2;
	}
	public int triple() {
		return this.valor * 3;
		}
	public void suma(int v) {
		this.valor=valor+v;
	}
	public void resta(int v) {
		this.valor=valor-v;
	}
	
	//to String
	@Override
	public String toString() {
		return "Entero [valor=" + valor + "]";
	
}


}


