package propuestos;

import java.util.Scanner;

public class propuesto8 {
	
	public static String decimaltoRoman(int n) {
		String rom="";
		
		do {
			while(n>=1000) {
				rom+="M";
				System.out.println(rom);
				n-=1000;
				}
			while(n>=900) {
				rom+="CM";
				System.out.println(rom);
				n-=900;
				}
			while(n>=500) {
				rom+="D";
				System.out.println(rom);
				n-=500;
				}
			while(n>=400) {
			rom+="CD";
			System.out.println(rom);
			n-=400;
			}	
			while(n>=100) {
				rom+="C";
				System.out.println(rom);
				n-=100;
				}
			while(n>=90) {
				rom+="XC";
				System.out.println(rom);
				n-=10;
			}
			while(n>=50) {
				rom+="L";
				System.out.println(rom);
				n-=10;
			}
			while(n>=40) {
				rom+="XL";
				System.out.println(rom);
				n-=10;
			}
			
			while(n>=10) {
				rom+="X";
				System.out.println(rom);
				n-=10;
			}
			while(n>=9) {
				rom="IX";
				System.out.println(rom);
				n-=9;
			}
			while(n>=5) {
				rom+="V";
				System.out.println(rom);
				n-=5;
			}
			while (n>=4) {
				rom+="IV";
				System.out.println(rom);
				n-=4;
			}
			
			while(n>=1) {
				rom+="I";
				System.out.println(rom);
				n-=1;
			}
			
			
		}while(n!=0);
		return rom;
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=0;
		System.out.println("dame un numero entero: ");
		n=sc.nextInt();
		String rom="";
		
		
		
		
		System.out.println("en romanos: "+decimaltoRoman(n));
	}

}
