
public class AeropuertoPublico {
	
	private String attr;

	public AeropuertoPublico(Strin attr) {
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
		return 'atribute: ' + this.attr;
	}
}

