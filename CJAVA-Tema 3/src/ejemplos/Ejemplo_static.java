package ejemplos;
/* Ejemplo para entender diferencia entre una variable miembro static
 * y no static
 */

// Una clase simple que solo tiene dos variables miembro 
// una static y otra no 
class Prueba {
	static int i; // definición de variable static
	int j;        // variable no static
}	
	
public class Ejemplo_static{
public static void  main(String arg[]) {
		
	// Instancio dos objetos de la clase prueba
	Prueba obj1 = new Prueba();
	Prueba obj2 = new Prueba();
	
	// Cada uno de los objetos tiene una copia de la variable miembro j
	// Sin embargo ambos comparten la variable statica i
	obj1.i = 100;
	obj1.j = 50;
	
	System.out.println("El valor de la variable statica i en obj1 es: " +  obj1.i);
	System.out.println("El valor de la variable no statica j en obj1 es: " +  obj1.j);
	
	obj2.i = 1000;
	obj2.j = 500;
	
	System.out.println("El valor de la variable statica i en obj1 es: " +  obj1.i);
	System.out.println("El valor de la variable statica i en obj2 es: " +  obj2.i);

	System.out.println("El valor de la variable no statica j en obj1 es: " +  obj1.j);
	System.out.println("El valor de la variable no statica j en obj2 es: " +  obj2.j);

	
	}
}
