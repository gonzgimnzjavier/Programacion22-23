package POO;

public class Pajaro {

	//*** atributos o propiedades ****
	private char color; //propiedad o atributo color
	private int edad; //propiedad o atributo edad
	
	Pajaro(){
	
	}
	
	Pajaro(char color ,int edad){
		this.color=color;
		
		if(edad>=0) {
		this.edad=edad;
		}else {
			System.out.println("no se admiten edades negativas");
			this.edad=0;
		}
	}
	
	
	//metodo invento
	
	public void imprimeEdad(){
		System.out.println(edad);
		}
	
	public void imprimeColor(){
	switch(color){//abre switch
	//Los pájaros son verdes, amarillos, grises, negros o blancos
	//No existen pájaros de otros colores
	case 'v': 
		System.out.println("verde");
		break;
	case 'a': 
		System.out.println("amarillo");
		break;
	case 'g':
		System.out.println("gris");
		break;
	case 'n':
		System.out.println("negro");
		break;
	case 'b':
		System.out.println("blanco");
		break;
	default:
		System.out.println("color no establecido");
	}//fin switch
	}
	//*** métodos de la clase ****
	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Pajaro [color=" + color + ", edad=" + edad + "]";
	}
	
}
