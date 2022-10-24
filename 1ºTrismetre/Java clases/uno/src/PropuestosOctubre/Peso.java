package PropuestosOctubre;

public class Peso {

	double  valor; //valor del peso en kg
	
	Peso(double v, String medida){
	
		this.valor= (v / getValor(v,medida));
		
	}
	
	public static double getValor(double numero,String medida) {
		
		double aux=0d;
		switch(medida) {
			case "Libra":
				//convertir valor a libras y guardarlo en aux
				aux= numero/0.453;
				break;
			case "Lingote":
				//convertir valor a lingotes y guardarlo en aux
				aux= numero/14.59;
				break;
			case "Onza":
				//convertir valor a onzas y guardarlo en aux
				aux= numero/0.02835;
				break;
			case "Penique":
				//convertir valor a peniques y guardarlo en aux
				aux=numero/0.00155;
				break;
			case "Kilo" :
				//SOLO DEVOLVEMOS EL VALOR PUES YA ESTA EN KILOS
				 aux=numero;
				break;
			case "Gramo":
				//MULTIPLICO POR MIL PARA CONVERTIR A GRAMOS y lo GUAROD en aux
				 aux=numero/0.001;
				break;
			case "Quintal":
				//convertir valor a quintales y guardarlo en aux
				aux=numero/43.3;
				break;
			default:
				System.out.println("NO EXISTE ESA UNIDAD DE MEDIDA");
				}
			return aux;
			}

	
	@Override
	public String toString() {
		return "Peso [valor=" + valor + "]";
	}
	
	
}