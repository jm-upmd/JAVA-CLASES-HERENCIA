package ejemplos.herencia_clase_abstracta_empleado;

public abstract class Empleado {
	private String dni;
    private String nombre;
    private String apellidos;
    protected int yearIngreso;
 
    public Empleado () {
        dni = "00000000";
        nombre = "NN";
        apellidos = "NA";
        yearIngreso = 2000;
    }
 
    public Empleado (String dni, String nombre, String apellidos, 
			int yearIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.yearIngreso = yearIngreso;
    }
	
	public void imprimir(){
		System.out.println("DNI: " + getDni() + 
				"\nNombre y Apellidos: " + getNombre() + " " + getApellidos() + 
			   "\nAño de ingreso: " + getYearIngreso());
	}
        	
	
	// Clase abstracta que tendremos que definir en la clase hija
	abstract public double obtenerSalario();
 
    public void setDni (String dni) {
        this.dni = dni;
    }
 
    public String getDni () {
        return dni;
    }
 
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
 
    public String getNombre () {
        return nombre;
    }
 
    public void setApellidos (String apellidos) {
        this.apellidos = apellidos;
    }
 
    public String getApellidos () {
        return apellidos;
    }
 
    public void setYearIngreso (int yearIngreso) {
        this.yearIngreso = yearIngreso;
    }
 
    public int getYearIngreso () {
        return yearIngreso;
    }    
}
