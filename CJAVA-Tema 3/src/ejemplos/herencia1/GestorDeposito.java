package ejemplos.herencia1;

import leer.Leer;

public class GestorDeposito {
	public static void main(String[] args){
		String titular;
		double capital;
		int plazoDias;
		double tipoInteres;
		double tipoInteresAmpliado;
		double capitalAmpliado;
		
		// Datos para el depóstio básico
		System.out.println("Introduce datos para el depósito básico");
		System.out.println("Introduce nombre y apellidos del titular");
		titular = Leer.dato();
		System.out.println("Introduce capital a invertir");
		capital = Leer.datoFloat();
		System.out.println("Introduce el número de días");
		plazoDias = Leer.datoInt();
		System.out.println("Introduce el tipo de interés");
		tipoInteres = Leer.datoFloat();
		
		// Construye objeto deposito
		Deposito deposito1 = new Deposito(titular, capital, 
				plazoDias, tipoInteres);
		
		
		// Datos para el depóstio estructurado
		System.out.println("Introduce datos para el depósito básico");
		System.out.println("Introduce nombre y apellidos del titular");
		titular =Leer.dato();
		System.out.println("Introduce capital básico a invertir");
		capital = Leer.datoFloat();
		System.out.println("Introduce el número de días");
		plazoDias = Leer.datoInt();
		System.out.println("Introduce el tipo de interés básico");
		tipoInteres = Leer.datoFloat();
		System.out.println("Introduce el tipo de interés ampliado");
		tipoInteresAmpliado = Leer.datoFloat();
		System.out.println("Introduce el capital ampliado");
		capitalAmpliado = Leer.datoFloat();
		
		//Construye objeto deposito estructurado
		DepositoEstructurado deposito2 = new DepositoEstructurado(titular, capital, 
				plazoDias, tipoInteres, tipoInteresAmpliado, capitalAmpliado);
		
		// El método liquidar en cada objeto calcula una cosa distinta ya que se ha ralizado 
		// sobrecarga del método
		System.out.println("El resultado del depósito básico es: " + deposito1.liquidar());
		System.out.println("El resultado del depósito estructurado es: " + deposito2.liquidar());
	}

}
