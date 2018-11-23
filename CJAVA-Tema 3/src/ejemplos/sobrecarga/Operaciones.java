package ejemplos.sobrecarga;

public class Operaciones {
	 public int suma(int n1, int n2){//metodo para sumar, recibe dos numeros
	        int op; //variable que almacena la respuesta
	        op = n1 + n2; //operacion
	        return op; //devuelve el valor de la operacion
	    } //fin metodo suma
	 
	    public int suma(int n1, int n2, int n3){//metodo para sumar, recibe tres numeros
	        int op; //variable que almacena la respuesta
	        op = n1 + n2 + n3; //operacion
	        return op; //devuelve el valor de la operacion
	    } //fin metodo suma
	 
	    /*// Que ocurre si si suma devuelve otro tipo
	     public float suma(int n1, int n2, int n3){//metodo para sumar, recibe tres numeros
	        int op; //variable que almacena la respuesta
	        op = n1 + n2 + n3; //operacion
	        return op; //devuelve el valor de la operacion
	    } */
	     
	    public int resta (int n1, int n2){ //metodo para restar, recibe dos numeros
	        int op; //variable que almacena la respuesta
	        op = n1 - n2; //operacion
	        return op; //devuelve el valor de la operacion
	    }// fin metodo resta
	 
	    public int resta (int n1, int n2, int n3){ //metodo para restar, recibe tres numeros
	        int op; //variable que almacena la respuesta
	        op = n1 - n2 - n3; //operacion
	        return op; //devuelve el valor de la operacion
	    }// fin metodo resta
	 
	    public int multiplicacion(int n1, int n2){ //metodo para multiplicar, recibe dos numeros
	        int op; //variable que almacena la respuesta
	        op = n1 * n2; //operacion
	        return op; //devuelve el valor de la operacion
	    } //fin metodo multiplicacion 
	 
	    public int multiplicacion(int n1, int n2, int n3){ //metodo para multiplicar, recibe tres numeros
	        int op; //variable que almacena la respuesta
	        op = n1 * n2 * n3; //operacion
	        return op; //devuelve el valor de la operacion
	    } //fin metodo multiplicacion 
	 
	    public int division(int n1, int n2){ //metodo para division, recibe dos numeros
	        int op; //variable que almacena la respuesta
	        op = n1 / n2; //operacion
	        return op; //devuelve el valor de la operacion
	    }//fin metodo division
}
