package ejemplos.herencia_interface;

// Interface solo permite declarar contantes 
// y meétodos abstractos

public interface Amortizable {
	
	// Constantes (no se pone modificador final)
	double LIMITE = 10000.0;  
	
	// Métodos abstracto (no se pone modificador abstract) 
	
	boolean amortizar(double cantidad); 
}
