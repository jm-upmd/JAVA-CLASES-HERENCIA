package ejemplos.herencia_clase_abstracta_profesor;

import java.util.ArrayList;

public class ListinProfesores {
	private ArrayList<Profesor> listinProfesores; // Campo de la clase

	public ListinProfesores() {
		listinProfesores = new ArrayList<Profesor>();
	} // Constructor

	public void addProfesor(Profesor profesor) {
		listinProfesores.add(profesor);
	} // Método

	public void imprimirListin() { // Método
		String tmpStr1 = ""; // String temporal que usamos como auxiliar
		System.out.println("Se procede a mostrar los datos de los profesores existentes en el listín \n");
		for (Profesor tmp : listinProfesores) {
			System.out.println(tmp.toString());
			if (tmp instanceof ProfesorInterino) {
				tmpStr1 = "Interino";
			} else {
				tmpStr1 = "Titular";
			}
			System.out.println(
					"-Tipo de este profesor:" + tmpStr1 + " -Nómina de este profesor: " + (tmp.importeNomina()) + "\n");
		}
	} // Cierre método imprimirListin

	public float importeTotalNominaProfesorado() {
		float importeTotal = 0f; // Variable temporal que usamos como auxiliar
		for(Profesor profesor: listinProfesores) {
			importeTotal = importeTotal +profesor.importeNomina();
		}
		
		return importeTotal;
	} // Cierre del método importeTotalNominaProfesorado

}
