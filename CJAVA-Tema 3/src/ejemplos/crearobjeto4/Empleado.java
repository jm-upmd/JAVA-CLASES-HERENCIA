package ejemplos.crearobjeto4;

public class Empleado {

	private String nombre;
	private String apellidos;
	private String departamento;
	private int nomina;
	
	Empleado( int nomina){
		this.nomina = nomina;
		this.nombre = "nombre" + "_" + nomina;
		this.apellidos = "apellidos" + "_" + nomina;
		if (nomina <= 50) 
			this.departamento = "VENTAS";
		else
			this.departamento = "COMPRAS";	
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDepartamento() {
		return departamento;
	}

	public int getNomina() {
		return nomina;
	}
	
	
}
