public class Cliente {
	
	String nombre, direccion, contacto;

	Cliente(String nombre, String direccion, String contacto) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.contacto = contacto; 
	}

// getters
	public String getNombre() {
		return this.nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public String getContacto() {
		return this.contacto;
	}

// setters
	public void SetNombre(String set) {
		this.nombre = set;
	}

	public void SetDireccion(String set) {
		this.direccion = set;
	}

	public void SetContacto(String set) {
		this.contacto = set;
	}
}

