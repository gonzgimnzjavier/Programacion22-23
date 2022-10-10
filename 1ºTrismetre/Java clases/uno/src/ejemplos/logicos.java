package ejemplos;

public class logicos {
	
	
	public static void main(String[] args) {
		
		
		int m=2, n=5;
		boolean res;
		
		res =	(m > n) && (m >= n);			//res=false
		
		System.out.println("el valor de res: "+res);
		
		
		res =	!(	(m < n) || (m != n)	);		//res=false
		
		System.out.println("el valor de res es: "+res);
	}

}
