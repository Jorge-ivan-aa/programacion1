import java.util.Scanner;

public class Producto {
	
	public static String obtenerDatos(String pregunta) {
		Scanner input = new Scanner(System.in);	
		System.out.println(pregunta);
		String dato = input.next();
		return dato;
	}

	public static int comprar(int stock, String producto) {
		int adquirido =  Integer.parseInt(obtenerDatos("Ingrese la cantidad de " + producto + " que desea comprar para añadir al stock"));
		stock = stock + adquirido;
		return stock;
	}

	public static int vender(int stock, String producto) {
		int vendido =  Integer.parseInt(obtenerDatos("Ingrese la cantidad de " + producto + " que va a vender"));
		stock = stock - vendido;
		return stock;
	}

	public static void mostrarTotal(int stock, int precio, String producto){
		int total = stock * precio;
		System.out.println("El valor total del producto "+ producto +" en stock es de " + total + " pesos, con la cantidad de " + stock + " productos.");
	}


	public static void main(String[] args) {
		int stock, precio;
		String producto;

		producto = obtenerDatos("Ingrese el nombre del producto");
		precio = Integer.parseInt(obtenerDatos("Ingrese el valor por unidad del producto"));
		stock = Integer.parseInt(obtenerDatos("Ingrese la cantidad de productos en stock"));
			
		boolean salir = false;
		while (salir == false) {
			System.out.println("\n-_-_-_-_-_-_-_-_-_-_\n");

			int menu = Integer.parseInt(obtenerDatos("ingrese una opcion del menu:\n 1. Comprar " + producto + "\n 2. Vender " + producto + "\n 3. Ver valor y cantidad total del stock\n 4. Salir\n" ));

			switch (menu) {
				case 1: stock = comprar(stock, producto);
				break;

				case 2: stock = vender(stock, producto);
				break;

				case 3: mostrarTotal(stock, precio, producto);
				break;

				case 4: salir = true ;
				break;
			}	
		}
	}

/* final del archivo */
}
