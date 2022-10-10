package ejemplos;

public class precedencia {
public static void main(String[] args) {
	
	int a = 4;
	a = 5 * a + 3;
	System.out.println("a vale ahora: "+a);
	
	a=4;
	a = 5 * (a + 3);
	System.out.println("a vale ahora: "+a);
}
}
