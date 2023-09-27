public class Persona {
	String nombre;
	int  edad;

	Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void mostrarDatos() {
		System.out.println("Su nombre es " + this.nombre + " y su edad es " + this.edad);
	}


	public static void main(String[] args) {
		Persona p = new Persona("jorge", 19);
		p.mostrarDatos();
	}
}
