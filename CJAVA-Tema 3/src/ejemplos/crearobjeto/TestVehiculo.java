package ejemplos.crearobjeto;

public class TestVehiculo {

	public static void main(String[] args) {
		// Instancio (o creo) un objeto de la clase Vehiculo
		
		Vehiculo miVehiculo = new Vehiculo();
		
		// Doy valores a sus atributos privados a través de metodos públicos
		
		miVehiculo.setNumRuedas(4);
		miVehiculo.setColor("blanco");
		miVehiculo.setTipoCombustible("diésel");
		miVehiculo.setVelocidadMax(180);
		
		System.out.println(miVehiculo.getVelocidadMax());
		
		if (miVehiculo.getNumRuedas() == 3)
			System.out.println("Es un triciclo");
		else System.out.println("No es un triciclo");

	}

}
