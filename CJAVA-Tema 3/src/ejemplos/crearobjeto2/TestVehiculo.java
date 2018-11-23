package ejemplos.crearobjeto2;


public class TestVehiculo {

	public static void main(String[] args) {
		// Instancio (o creo) un objeto de la clase Vehiculo
		
		Vehiculo miVehiculo = new Vehiculo();
		System.out.println("Velocidad máxima: " + miVehiculo.getVelocidadMax());
		System.out.println("Color: " + miVehiculo.getColor());
		
		System.out.println("Creando vehículo (Otro vehículo)");
		Vehiculo otroVehiculo = new Vehiculo(200,"Amarillo");
		System.out.println("(Otro vehículo) Velocidad máxima: " + otroVehiculo.getVelocidadMax());
		System.out.println("(Otro vehículo) Color: " + otroVehiculo.getColor());
		

	}

}
