
public class Aeropuerto {
	
	private int id;
	private String nombre, fechaInauguracion, capacidadMax;

	public Aeropuerto(int id, Strin nombre, String fechaInauguracion, String capacidadMax) {
		this.id = id;
		this.nombre = nombre;
		this.fechaInauguracion = fechaInauguracion;
		this.capacidadMax = capacidadMax;
	}

// GETTERS
	public id getId() {
		return this.id;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getFechaInaugaracion() {
		return this.fechaInauguracion;
	}
	public String getCapacidaMax() {
		return this.capacidadMax;
	}

// SETTERS
	public void setId(int input) {
		this.id = input;
	}
	public void getNombre(String input) {
		this.nombre = input;
	}
	public void getFechaInaugaracion(String input) {
		this.fechaInauguracion = input;
	}
	public void getCapacidaMax(String input) {
		this.capacidadMax = input;
	}

// imprimir valores de atributos
	public String toString() {
		return "Id aeropuerto: " + this.nombre + ", Nombre: " + this.nombre + ", Fecha de inauguracion: " + this.fechaInauguracion + ", Capacidad maxima: " + this.capacidadMax;
	}
}

