package propuestos;

import java.util.Random;

public class propuesto6 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int valor = rnd.nextInt();
		int mejor =0;
		
		for (int j=0; j<40; j++) {
		mejor = (int)(rnd.nextDouble()* 101 +100); //[0-99]
		System.out.println("has generado "+valor);
		}
	}

}
