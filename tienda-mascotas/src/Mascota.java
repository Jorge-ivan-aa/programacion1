public class Mascota {
	
	String nombre, tipo, raza;
	int edad;

	Mascota(String nombre, String tipo, String raza, int edad) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.raza = raza; 
		this.edad = edad;
	}

// getters
	public String getNombre() {
		return this.nombre;
	}

	public String getTipo() {
		return this.tipo;
	}

	public String getRaza() {
		return this.raza;
	}

	public int getEdad() {
		return this.edad;
	}

// setters
	public void SetNombre(String set) {
		this.nombre = set;
	}

	public void SetTipo(String set) {
		this.tipo = set;
	}

	public void SetRaza(String set) {
		this.raza = set;
	}

	public void SetEdad(int set) {
		this.edad = set;
	}
}
