package resueltos;

import java.util.Scanner;

public class letras {
	//atributo
	private char letra;
	
	//constructor
	letras(char i){
	letra = i;
		if (i >= 'a') {
			letra -= 'a';	//npi
			letra += 'A';	//npi
		}
	}
	//getter
	public char getLetra() {
		return letra;
		}
	@Override
	public String toString() {
		return "letras [letra=" + letra + "]";
	}
	public static void main(String[] args) {
		char let;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame una letra: ");
		let =sc.nextLine().charAt(0);
		letras una =new letras(let);
		
		System.out.println(una.toString());
	}

}

