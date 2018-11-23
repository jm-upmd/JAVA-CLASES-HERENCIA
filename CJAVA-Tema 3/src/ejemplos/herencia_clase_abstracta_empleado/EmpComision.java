package ejemplos.herencia_clase_abstracta_empleado;

public class EmpComision extends Empleado {
	private int clientesCaptados;
    private double montoPorCliente;
    public static final double salarioMinimo = 750;
    
    // Constructores
    public EmpComision () {
        super();
        clientesCaptados = 0;
        montoPorCliente = 0;
    }
 
    public EmpComision (String dni, String nombre, String apellidos, int yearIngreso, 
            int clientesCaptados, double montoPorCliente) {
        super(dni, nombre, apellidos, yearIngreso);
        this.clientesCaptados = clientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }
	
    // Método abstracto del padre
    @Override
	public double obtenerSalario() {
	    if (montoPorCliente*clientesCaptados > salarioMinimo)
            return montoPorCliente*clientesCaptados;
        else
            return salarioMinimo;
	}
    
    @Override
    public void imprimir (){
        super.imprimir();
        System.out.printf("Salario: %.2f\n", obtenerSalario());
        System.out.println();
    }
    
    public void setClientesCaptados (int clientesCaptados) {
        this.clientesCaptados = clientesCaptados;        
    }
 
    public int getClientesCaptados () {
        return clientesCaptados;
    }
    
    public void setMontoPorCliente(double montoPorCliente){
        this.montoPorCliente = montoPorCliente;
    }
    
    public double getMontoPorCliente(){
        return montoPorCliente;
    }

}
