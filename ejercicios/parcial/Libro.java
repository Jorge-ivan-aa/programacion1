public class Libro {
	String titulo, autor, añoPublicacion, numPaginas;
	boolean prestado;
	
	public Libro(boolean prestado, String titulo, String autor, String añoPublicacion, String numPaginas) {
		this.prestado = prestado;
		this.titulo = titulo;
		this.autor = autor;
		this.añoPublicacion = añoPublicacion;
		this.numPaginas = numPaginas;
	}

	public void marcarPrestado() {
		this.prestado = true;
	}

	public void marcarDisponible() {
		this.prestado = false;
	}

	public void mostrarEstado() {
		if (prestado == true) {
			System.out.println("El libro actualmente está prestado");
		} else {
			System.out.println("El libro está disponible");
		}
	}

	public void descripcion() {
		System.out.println("Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nFecha de publicacion: " + this.añoPublicacion + "\nNumero de paginas: " + this.numPaginas);
	}

}
