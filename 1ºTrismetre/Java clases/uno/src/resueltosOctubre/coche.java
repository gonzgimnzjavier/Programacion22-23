package resueltosOctubre;

import java.util.Scanner;

/*Crea la clase coche con dos constructores. Uno no toma parámetros y el otro sí. Los dos constructores inicializarán
los atributos marca y modelo de la clase. Crea dos objetos (cada objeto llama a un constructor distinto) y verifica
que todo funciona correctamente.*/
public class coche {
//Atributos

private String marca;

private String modelo;

public coche() {
this.marca="";
this.modelo="";
}

public coche(String marca, String modelo) {
	this.marca = marca;
	this.modelo = modelo;
}

@Override
public String toString() {
	return "coche [marca=" + marca + ", modelo=" + modelo + "]";
}

public void setMarca(String marca) {
	this.marca=marca;
}
public void setModelo(String modelo) {
	this.modelo=modelo;
}

public String getMarca() {
	return this.marca;
}
public String getModelo() {
	return this.modelo;
}

public static void main(String[] args) {
	
	String aux;
	
	String aux2;
	
	Scanner manolin= new Scanner(System.in);
	
	System.out.println("dime marca:");
	
	aux=manolin.nextLine();
	
	System.out.println("dime modelo:");
	
	aux2=manolin.nextLine();
	
	coche uno = new coche(aux, aux2);
	System.out.println(uno.toString());
		
	coche dos = new coche();
	System.out.println(dos.toString());
	
	dos.setMarca("dina");
	dos.setModelo("mita");
	System.out.println(dos.toString());
	
	String info;
	
	info = uno.getMarca().concat(uno.getModelo());
	
	System.out.println(info);
	
}


}
