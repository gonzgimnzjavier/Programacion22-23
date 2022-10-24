package PropuestosOctubre;

public class palestina {
	//atributos
		private double patatas; //en kilos
		private double chocos; //en kilos
		
		
		//constructor por defecto 
		public palestina() {
			patatas=0;
			chocos=0;
		}

		public palestina(double p, double c) {
			this.patatas = p;
			this.chocos = c;
		}

		@Override
		public String toString() {
			return "palestina [patatas=" + patatas + ", chocos=" + chocos + "]";
		}
		
		//getters y setters

		public double getPatatas() {
			return patatas;
		}

		public void setPatatas(double patatas) {
			this.patatas = patatas;
		}

		public double getChocos() {
			return chocos;
		}

		public void setChocos(double chocos) {
			this.chocos = chocos;
		}
		
		//metodos add
		
		public void addPatatas(double x) {
			patatas+=x;
		}
		public void addChocos(double y) {
			chocos+=y;
		}
			public int numeroClientes() {
				int com=0;
				
				while(chocos>=0.5 && patatas>=1) {
					patatas=patatas-1;
					chocos=chocos-0.5;
					com=com+3;
				}
			return com;
			}
}
