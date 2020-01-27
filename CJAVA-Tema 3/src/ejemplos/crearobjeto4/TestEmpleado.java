package ejemplos.crearobjeto4;

public class TestEmpleado {

	public static void main(String[] args) {
		Empleado [] empleados = new Empleado[100];
		
		for (int i = 0; i < empleados.length; i++) {
			empleados[i] = new Empleado(i+1);
		}
		
		for (int i = 0; i < empleados.length; i++) {
			Empleado e = empleados[i];
			if (e.getDepartamento().compareTo("COMPRAS") == 0 && e.getNomina() % 2 != 0) {
				System.out.println(e.getNombre() + " " + e.getApellidos());
			}
		}		
	}

}
