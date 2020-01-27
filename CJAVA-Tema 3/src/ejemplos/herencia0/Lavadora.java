package ejemplos.herencia0;

public class Lavadora extends Electrodomestico {
    //Constantes
	  
    /**
     * Carga por defecto
     */
    private final static int CARGA_DEF=5;
  
    //Atributos
  
    /**
     * Carga de la lavadora
     */
    private int carga;
  
    //Métodos públicos
  
    /**
     * Devuelve la carga de la lavadora
     * @return
     */
    public int getCarga() {
        return carga;
    }
  
    /**
     * Precio final de la lavadora
     * @return precio final de la lavadora
     */
    
    // Reescritura del método precioFinal del la clase padre
    @Override
    public double precioFinal(){
    	//System.out.println("Dentro de precioFinal Lavadora.");
    	
        //Invocamos el método precioFinal del método padre
    	// que aplica recargo por peso y consumo energético
        double plus=super.precioFinal();
  
        	
        // en el caso de una lavadora tiene un recargo adicional
        // si la carga de lavado en mayor de 30
        if (carga>30){
            plus+=50;
        }
  
        return plus;
    }
	
	
	// Constructores
	public Lavadora() {
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);

	}

	 /**
     * Constructor con 2 parametros
     * @param precioBase
     * @param peso
     */
    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }
  
    /**
     * Constructor con 5 parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param carga
     */
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }

}
