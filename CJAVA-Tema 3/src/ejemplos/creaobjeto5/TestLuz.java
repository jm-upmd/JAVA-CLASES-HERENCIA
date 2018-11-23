package ejemplos.creaobjeto5;


import java.util.Scanner;

public class TestLuz {

	public static void main(String[] args) {

		// Crea objeto Scanner para leer del teclado
		Scanner lectorTecla = new Scanner(System.in);

		// Crea objeto Luz
		Luz semaforo = new Luz();

		System.out.println("Pulsa tecla 'return' cambiar color. Tecla 'S' para salir");
		//Llamada a método getColor() de objeto semaforo
		System.out.println("Color actual: " + semaforo.getColor()); 


		while (!teclaSalir(lectorTecla)) {
			System.out.print("Cambiado de color " + semaforo.getColor());
			semaforo.cambio();  // llamada a método cambio() del objeto samaforo
			System.out.println(" a color " + semaforo.getColor());
		}
		
		System.out.println("Programa terminado");

		lectorTecla.close();

	}

	static boolean teclaSalir(Scanner lectorTecla) {
		String st = lectorTecla.nextLine();
		
		if( st.isEmpty() ) {   // Si pulso return sin haber escrito previamente una letra
			return false;
		} else if(st.toUpperCase().charAt(0) != 'S') { // Si letra pulsada no es 's' ni 'S'
			return false;
		}
		return true;  // Si letra pulsada es 's' o 'S'

	}

}
