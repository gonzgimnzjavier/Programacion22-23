package resueltosOctubre;

public class Pajaro {
	
	public void setEdad(int e){edad = e;}
	public void printEdad(){
		System.out.println(edad);
		}
	public void setcolor(char c){
		color=c;
		}
	private char color;
	private int edad;
	
	public void volar() {
		System.out.println("volando voy, volando vengo");
	}

	public void cantar() {
		System.out.println("pio, pio");
	}
	@Override
	public String toString() {
		return "Pajaro [color=" + color + ", edad=" + edad + "]";
	}
	
}
