package ejemplos.creaobjeto5;

public class Luz {
	private String color;
	
	Luz(){
		color = "rojo";
	}
	
	public String getColor() {
		return color;
	}
	
	void cambio() {
		switch (color) {
		case "rojo":
			color = "verde";
			break;
		case "amarillo":
			color = "rojo";
			break;
		case "verde":
			color ="amarillo";
			break;
		}
	}

	
	
	
}
