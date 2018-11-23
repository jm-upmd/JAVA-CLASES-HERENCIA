package ejemplos.herencia_clase_abstracta_empleado;

import java.util.Calendar;

public class EmpAsalariado extends Empleado {
	
	 private double salarioBase;
	 
	    public EmpAsalariado () {
	        super();
	        salarioBase = 0.0;
	    }
	 
	    public EmpAsalariado (String dni, String nombre, String apellidos, 
	            int yearIngreso, double salarioBase) {
	        super(dni, nombre, apellidos, yearIngreso);
	        this.salarioBase = salarioBase;
	    }

	// Función abstracta definida en la clase padre. Es obligatorio implementarla
	// en cada clase hija
	@Override
	public double obtenerSalario() {
		Calendar now = Calendar.getInstance();
        int actualYear = now.get(Calendar.YEAR);
        int anios = actualYear - getYearIngreso(); 
        if (anios<0){
            System.out.println("Error: número de años negativo");
        }
        if (anios < 2) return salarioBase;
        else if (anios >= 2 && anios<=3) return salarioBase * 0.05 + salarioBase;
        else if (anios >= 4 && anios<=7) return salarioBase * 0.10 + salarioBase;
        else if (anios >= 8 && anios<=15) return salarioBase * 0.15 + salarioBase;
        else return salarioBase * 0.20 + salarioBase;   
	}
	
	// Llama a imprimir del padre e imprime adicionalmente obtenerSalario()
	@Override
	 public void imprimir(){
	        super.imprimir();
	        System.out.printf("Salario: %.2f\n", obtenerSalario());
	        System.out.println();
	    }
	    
	    public void setSalarioBase (double salarioBase) {
	        this.salarioBase = salarioBase;
	    }
	    
	    public double getSalarioBase(){
	        return salarioBase;
	    }
}
