package ejemplos.constructor;

//import ejemplos.Ejemplo_accesibilidad;

/* 
 * Ejemplo de uso de la clase Fecha
 */

public class TestFecha {

	public static void main(String[] args) {
		Fecha origen = new Fecha();
		Fecha actual = new Fecha(5, 5, 2018);

		System.out.println("Primera fecha: " + origen.toString());
		System.out.println("Segunda fecha: " + actual.toString());
	}	

}
