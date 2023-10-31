
public class Avion {
	
	private String modelo;
	private int numAsientos, velMax;

	public Avion(String modelo, int numAsientos, int velMax) {
		this.modelo = modelo;
		this.numAsientos = numAsientos;	
		this.velMax = velMax;	
	}

// GETTERS
	public String getModelo() {
		return this.modelo;
	}
	public int getNumAsientos() {
		return this.numAsientos;
	}
	public int getVelMax() {
		return this.velMax;
	}

// SETTERS
	public void setModelo(String input) {
		this.modelo = input;
	}
	public void setNumAsientos(int input) {
		this.numAsientos = input;
	}
	public void setVelMax(int input) {
		this.velMax = input;
	}

// imprimir valores de atributos
	public String toString() {
		return "Modelo: " + this.modelo + ", Numero de asientos: " + this.numAsientos + ", Velocidad maxima: " + this.velMax;
	}
}

