package ejemplos.herencia_clase_abstracta_profesor;

public class ProfesorTitular extends Profesor {
	public ProfesorTitular(String nombre, String apellidos, int edad, String id) {
		super(nombre, apellidos, edad, id);
	}

	@Override
	public float importeNomina() {
		return 30f * 43.20f;
	} // Método abstracto sobreescrito en esta clase

}
