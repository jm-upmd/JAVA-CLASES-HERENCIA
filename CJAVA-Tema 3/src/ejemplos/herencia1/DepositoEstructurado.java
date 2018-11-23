package ejemplos.herencia1;

public class DepositoEstructurado extends Deposito {
	
	// Nuevos atributos ampliados/añadidos a la clase padre Deposito
	private double tipoInteresAmpliado;
	private double capitalAmpliado;
	
	// Constructor. Recoge parametros para inicializar atributos tanto los de la clase padre como los suyos propios.
	public DepositoEstructurado(String titular, double capital, int plazoDias, double tipoInteres, double tipoInteresAmpliado,  double capitalAmpliado) {
		super(titular, capital, plazoDias, tipoInteres);  // Llamada a constructor de la clase padre
		
		// Inicializa sus propios atributos
		this.tipoInteresAmpliado = tipoInteresAmpliado;
		this.capitalAmpliado = capitalAmpliado;
	}
	
	// Definición de métodos propio
	public double obtenInteresesAmpliado() {		
		return (getPlazoDias() * tipoInteresAmpliado * capitalAmpliado )/365;
	}
	
	// Sobreescribe el métod liquidar() de la clase padre.
	// El @Override se puede poner o no. Es conveniente ponerlo. Si no se pone y por equivocación no ponemos el nombre del metodo igual
	// que en el padre, el compilador lo compila como método nuevo, sin embargo si tiene la etiqueta @Override dará
	// un error de compilación si el nombre no tienen coincidente en el padre
	
	@Override
	public double liquidar(){
		
		// llama a la clase liquidar del padre y al resultado le suma el 
		// capital ampliado y intereses ampliado
		return super.liquidar() + capitalAmpliado + obtenInteresesAmpliado();
	}
	
	// getters and setters
	public double getTipoInteresAmpliado() { 
		return tipoInteresAmpliado;
	}
	
	public void setTipoInteresAmpliado(double tipoInteresAmpliado){ 
		this.tipoInteresAmpliado = tipoInteresAmpliado;
	}
	
	public double getCapitalAmpliado() {
		return capitalAmpliado;
	}
	
	public void setCapitalAmpliado(double capitalAmpliado){
		this.capitalAmpliado = capitalAmpliado;
	}
}

