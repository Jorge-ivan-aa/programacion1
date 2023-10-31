
public class Persona {
	private String nombre;
	private double sueldo;
	private boolean eliminado;


	public Persona(String nombre, double sueldo, boolean eliminado) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.eliminado = eliminado;
	}

/* getters */
	public String getNombre() {
		return this.nombre;
	}
	public double getSueldo() {
		return this.sueldo;
	}
	public boolean isELiminado() {
		return this.eliminado;
	}

/* setters	 */
	public void setNombre(String input) {
		this.nombre = input;
	}
	public void setSueldo(double input) {
		this.sueldo = input;
	}
	public void setEliminado(boolean input) {
		this.eliminado = input;
	}

	public String toString() {
		return "nombre: " + this.nombre + ", sueldo: " + this.sueldo + ", fue eliminado?: " + this.eliminado;
	}
}
