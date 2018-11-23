package ejemplos.crearobjeto3;

public class Bombero {
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean casado;
	
	public Bombero (String nombre, String apellidos, int edad, boolean casado){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad=edad;
		this.casado=casado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	
}
