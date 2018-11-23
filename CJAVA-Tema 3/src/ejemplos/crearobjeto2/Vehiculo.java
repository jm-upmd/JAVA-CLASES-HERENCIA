package ejemplos.crearobjeto2;

public class Vehiculo {
	// Atributos de clase privados no seon accesibles desde exterior 
		private int numRuedas;
		private String tipoCombustible;
		private String color;
		private int velocidadMax;
		
		// Constructores
		
		// Constructor sin parametros de entrada.
		// Al crearse un objeto de la clase se inicializa la variable velocidadMax
		Vehiculo(){
			velocidadMax = 120;
		}
		
		// Constructor con párametros de entrada
		Vehiculo(int velMax, String color){
			velocidadMax = velMax;
			
			// Operador this para referirse a la propia clase y diferenciar 
			// parámetro color (local al método) con atributo de clase color.
			this.color = color; 
		}
		
		// Métodos de clase. Al ser public podrán ser accedidos desde cualquer otra clase,
		// incluso las de fuera de su paquete
		
		public int getNumRuedas() {
			return numRuedas;
		}
		public void setNumRuedas(int numRuedas) {
			// this hace referencia a la propia clase. 
			this.numRuedas = numRuedas;
		}
		public String getTipoCombustible() {
			return tipoCombustible;
		}
		public void setTipoCombustible(String tipoCombustible) {
			this.tipoCombustible = tipoCombustible;
		}
		public int getVelocidadMax() {
			return velocidadMax;
		}
		public void setVelocidadMax(int velocidadMax) {
			this.velocidadMax = velocidadMax;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
}
