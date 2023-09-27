public class Main {
	

	public static void main(String[] args) {
		Libro cualquiera = new Libro(false, "El coronel no tiene quien le escriba","Garcia Marquez","1994","80");
		
		cualquiera.descripcion();
		cualquiera.mostrarEstado();
		cualquiera.marcarPrestado();	
		cualquiera.mostrarEstado();

		Puerta calle = new Puerta(true);	
		calle.mostrarEstado();
		calle.cerrar();
		calle.mostrarEstado();
	}
}
