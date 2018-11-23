package ejemplos.crearobjeto;

public class Vehiculo {
	
	// Atributos de clase
	private int numRuedas;
	private String tipoCombustible;
	private String color;
	private int velocidadMax;
	
	// Métodos de clase. Al ser public podrán ser accedidos desde cualquer otra clase,
	// incluso las de fuera de su paquete
	
	/* Los métodos get y set son métodos publicos cuya finalidad es permitir 
	 * modificar desde el exterior los atributos de clase privados.
	 * Es un mecanismo para realizar estas modificaciones de forma segura y controlada
	 * Por convenio (no es obligatorio) se suelen prefijar con "set" los que dan un 
	 * valor al atributo y  con "get" los que obtienen sus valores
	 */
	
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
