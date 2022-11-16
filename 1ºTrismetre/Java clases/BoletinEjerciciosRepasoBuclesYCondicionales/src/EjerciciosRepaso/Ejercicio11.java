package EjerciciosRepaso;

/*Diseñar un programa que muestre el producto de los 10
primeros números impares.*/

public class Ejercicio11 {
	
	public static void main(String[] args) {
	
		int producto=1;
		
		for(int i=1; i<20; i++) {
			if(i%2!=0) {
				System.out.println(i);
				producto *=i;
				
			}
		}System.out.println("El producto de los 10 primeros impares es: "+producto);

	}
}
