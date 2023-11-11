package aeropuerto;

public class Prueba {
	
	private String attr;

	public Prueba(String attr) {
		this.attr = attr;	
	}

// GETTERS
	public String getAttr() {
		return this.attr;
	}

// SETTERS
	public void getAttr(String input) {
		this.attr = input;
	}

// imprimir valores de atributos
	public String toString() {
		return "attribute: " + this.attr;
	}
}

