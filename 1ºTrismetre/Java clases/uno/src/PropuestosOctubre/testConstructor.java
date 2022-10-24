package PropuestosOctubre;

import java.util.Scanner;

public class testConstructor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String m;
		double v;

		while (true) {
			System.out.println("valor???: ");
			v = sc.nextDouble();
			System.out.println("que unidad es???: ");
			m = sc.next();

			Peso dos = new Peso(v, m);

			// Hemos construido en kilos
			System.out.println(dos.toString() + " en kilos");
		}
	}
}
