import java.util.Scanner;

public class Puntuacion {
	public static String preguntar(String pregunta) {
		Scanner input = new Scanner(System.in);
		System.out.println(pregunta);
		String respuesta = input.next();

		return respuesta;
	}

	public static int decrementar(int puntaje) {
		int reducir = Integer.parseInt(preguntar("Cuantos puntos desea quitar?"));
		puntaje = puntaje - reducir;

		return puntaje;
	}

	public static int incrementar(int puntaje) {
		int agregar = Integer.parseInt(preguntar("Cuantos puntos desea agregar?"));
		puntaje = puntaje + agregar;

		return puntaje;
	}

	public static void imprimir(String nombre, int puntaje) {
		System.out.println("El puntaje del jugador " + nombre + " es: " + puntaje);
	}
	
	public static void main(String[] args) {
		String nombre = preguntar("Ingrese el nombre del jugador: ");
		int puntaje = Integer.parseInt(preguntar("Ingrese el puntaje del jugador " + nombre));

		boolean salir = false;
		while(salir == false) {

			System.out.println("\n-_-_-_-_-_\n");
			int menu = Integer.parseInt(preguntar("Elija una opcion del menu:\n 1. Restar puntos\n 2. Sumar puntos\n 3. Mostrar puntaje\n 4. Salir"));
			switch(menu) {
				case 1: puntaje = decrementar(puntaje); break;
				case 2: puntaje = incrementar(puntaje); break;
				case 3: imprimir(nombre, puntaje); break;
				case 4: salir = true; break;
				default: System.out.println("Error: la opcion ingresada no existe!"); break;
			}
		}
	}
}
