package ejemplos.herencia_interface;

public class DepositoEstructurado extends Deposito implements Amortizable {

	// Nuevos atributos ampliados/añadidos a la clase padre Deposito
	private double tipoInteresVariable;
	private double capitalVariable;

	// Constructor. Recoge parametros para inicializar atributos tanto los de la
	// clase padre como los suyos propios.
	public DepositoEstructurado(String titular, double capital, int plazoDias, double tipoInteres,
			double tipoInteresAmpliado, double capitalAmpliado) {
		super(titular, capital, plazoDias, tipoInteres); // Llamada a constructor de la clase padre

		// Inicializa sus propios atributos
		this.tipoInteresVariable = tipoInteresAmpliado;
		this.capitalVariable = capitalAmpliado;
	}

	// Definición de métodos propio
	public double obtenInteresesAmpliado() {
		return (getPlazoDias() * tipoInteresVariable * capitalVariable) / 365;
	}

	// Sobreescribe el métod liquidar() de la clase padre.
	// El @Override se puede poner o no. Es conveniente ponerlo. Si no se pone y por
	// equivocación no ponemos el nombre del metodo igual
	// que en el padre, el compilador lo compila como método nuevo, sin embargo si
	// tiene la etiqueta @Override dará
	// un error de compilación si el nombre no tienen coincidente en el padre

	@Override
	public double liquidar() {

		// llama a la clase liquidar del padre y al resultado le suma el
		// capital ampliado y intereses ampliado
		return super.liquidar() + capitalVariable + obtenInteresesAmpliado();
	}

	// Implementamos metodo amortizar de la interface Amortizable
	// Es obligatorio

	@Override
	public boolean amortizar(double cantidad) {
		if (cantidad > capitalVariable)
			return false;
		capitalVariable = capitalVariable - cantidad;
		return true;
	}

	// getters and setters
	public double getTipoInteresAmpliado() {
		return tipoInteresVariable;
	}

	public void setTipoInteresAmpliado(double tipoInteresAmpliado) {
		this.tipoInteresVariable = tipoInteresAmpliado;
	}

	public double getCapitalAmpliado() {
		return capitalVariable;
	}

	public void setCapitalAmpliado(double capitalAmpliado) {
		this.capitalVariable = capitalAmpliado;
	}
}
