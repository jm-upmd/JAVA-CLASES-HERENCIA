package ejemplos.constructor;

public class Fecha {
	// Atributos o variables miembro
	private int dia;
	private int mes;
	private int anio;

	// Constructor 1
	public Fecha() {
		dia = 1; 
		mes = 1; 
		anio = 2000;
	}

	// Constructor 2
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	// Sobreescribe el método toString de Object
	// ¿Qué ocurre si no lo sobreescribo y lo uso?

	@Override
	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.anio;
	}
}
