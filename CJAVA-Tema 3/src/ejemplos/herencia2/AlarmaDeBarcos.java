package ejemplos.herencia2;

// Clase base 
class Barco {
	public Barco() {
		System.out.print("\tSe crea parte de un barco. ");
	}

	public void alarma() {
		System.out.println("\tS.O.S desde un barco");
	}
}

// Subclase de Barco
class DeVapor extends Barco {
	public DeVapor() {
		System.out.print("Se crea la parte del barco de vapor. ");
	}

	public void alarma() {
		System.out.println("\tS.O.S desde un barco de vapor");
	}

	public void alarma(String msg) {
		System.out.println("\tMensaje: " + msg + " enviado desde un barco de vapor");
	}
}

// Subclase de Barco
class Velero extends Barco {
	public Velero() {
		System.out.println("Se crea la parte del barco velero. ");
	}

	public void alarma() {
		System.out.println("\tS.O.S desde un Velero");
	}
}

// Subclase de DeVapor
class Carguero extends DeVapor {
	public Carguero() {
		System.out.println("\tSe crea la parte del barco carguero. ");
	}

	public void alarma() {
		System.out.println("\tS.O.S desde un carguero");
	}

	public void alarma(String msg) {
		System.out.println("\tMensaje: " + msg + " enviado desde un carguero");
	}
}

// Clase con metodo main() para insanciar y usar las clases
public class AlarmaDeBarcos {

	public static void main(String[] args) {
		// Se crea Array para guardar tres objetos de tipo Barco
		Barco[] bs = new Barco[3];

		System.out.println();
		
		DeVapor mss = new DeVapor();

		Velero vss = new Velero();

		Carguero css = new Carguero();

		
		// en el array para almacenar objetos tipo Barco
		// guardo objetos tipo DeVapor, Velero y Carguero

		bs[0] = mss;
		bs[1] = vss;
		bs[2] = css;

		for (int i = 0; i < 3;)
			// Polimorfismo. Misma llamada  dar lugar a acciones diferentes dependiendo del objeto que lo recibe.
			bs[i++].alarma();
		
		mss = css; // la referencia mss al objeto DeVapor ahora apunta a un objeto Carguero
		mss.alarma("A 3 horas del puerto");
	}

}
