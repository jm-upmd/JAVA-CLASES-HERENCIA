package ejemplos.crearobjeto3;

public class TestBombero {

	public static void main(String[] args) {
		
		Bombero unBombero = new Bombero("Paco", "Pérez", 35, false);
		
		System.out.println(unBombero.getApellidos() + ", " + unBombero.getNombre());
		System.out.println(unBombero.getEdad() + " años.");
		System.out.println( unBombero.isCasado() ? "Casado" : "Soltero");

	}

}
