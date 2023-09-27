public class Puerta {

	boolean  abierta;
	
	public Puerta(boolean abierta) {
		this.abierta = abierta;
	}

	public void abrir() {
		this.abierta = true;
	}

	public void cerrar() {
		this.abierta = false;
	}

	public void mostrarEstado() {
		if (abierta == true) {
			System.out.println("La puerta está abierta");
		} else {
			System.out.println("La puerta está cerrada");
		}
	}
}
