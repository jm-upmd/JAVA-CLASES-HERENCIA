package ejemplos.herencia0;

public class Television extends Electrodomestico {

	//Constantes
	  
    /**
     * Resolución por defecto
     */
    private final static int RESOLUCION_DEF=20;
  
    //Atributos
  
    /**
     * Resolución del televisor
     */
    private int resolucion;
  
    /**
     * Indica si tiene o no sintonizadorTDT
     */
    private boolean sintonizadorTDT;
  
    //Métodos publicos
  
    /**
     * Precio final de la television
     * @return precio final de la television
     */
    // Sobrescribe método del padre
    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
    	// para incrementar precio según consumo energ. y peso
        double plus=super.precioFinal();
  
        //Sumamos plus asicional según resoulución
        if (resolucion>40){
            plus+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            plus+=50;
        }
  
        return plus;
    }
  
    //Constructor
  
    /**
     * Constructor por defecto
     */
    public Television(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
    }
  
    /**
     * Constructor con 2 parametros
     * @param precioBase
     * @param peso
     */
    public Television(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
    }
  
    /**
     * Contructor con 6 parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param resolucion
     * @param sintonizadorTDT
     */
    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }

}
