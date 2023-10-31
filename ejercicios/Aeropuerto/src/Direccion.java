
public class Direccion {
	
	private String pais, ciudad, calle;
	private int numero;

	public Direccion(String pais, String ciudad, String calle, int numero) {
		this.pais = pais;
		this.ciudad = ciudad;	
		this.calle = calle;	
		this.numero = numero;	
	}

// GETTERS
	public String getPais() {
		return this.pais;
	}
	public String getCiudad() {
		return this.ciudad;
	}
	public String getCalle() {
		return this.calle;
	}
	public int getNumero() {
		return this.numero;
	}

// SETTERS
	public void setPais(String input) {
		this.pais = input;
	}
	public void setCiudad(String input) {
		this.ciudad = input;
	}
	public void setCalle(String input) {
		this.calle = input;
	}
	public void setNumero(int input) {
		this.numero = input;
	}

// imprimir valores de atributos
	public String toString() {
		return "Pais: " + this.pais + "Ciudad: " + this.ciudad + "Calle: " + this.numero;
	}
}
