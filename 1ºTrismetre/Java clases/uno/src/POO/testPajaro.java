package POO;

public class testPajaro {
public static void main(String[] args) {
	
	int años;
	
	Pajaro piolin;
	
	piolin= new Pajaro();
	
	piolin.setEdad(5);
	
	//piolin.imprimeEdad();
	System.out.println(piolin.toString());
	piolin.setEdad(8);
	
	años=piolin.getEdad();
	
	System.out.println("el pajaro tiene años: "+años);
	
	piolin.setColor('a');
	//piolin.imprimeColor();
	
	System.out.println(piolin.toString());
	
	//ejemplo de uso de constructor con todos los atributos
	Pajaro dos = new Pajaro('t', -12);
	System.out.println( dos.toString());
	}
}
