import java.util.ArrayList;
import java.util.Collections;

public class Apellidos {
	
	public static void main(String[] args){
		ArrayList<String> apellidos = new ArrayList<>();
		apellidos.add("Gomez");
		apellidos.add("Aristizabal");
		apellidos.add("Puerta");
		apellidos.add("Villamaria");
		apellidos.add("Solis");
		apellidos.add("Blanco");

		
		System.out.println("La lista original es: "+ apellidos);
		System.out.println("\n-_-_-_-_\n");

		apellidos.set(2, "Ramirez");
		System.out.println("La lista con el tercer elemento modificado es: "+ apellidos);
		apellidos.remove(5);
		System.out.println("La lista con el ultimo elemento eliminado es: "+ apellidos);

		System.out.println("\n-_-_-_-_\n");

		if(apellidos.contains("Gonzales")) {
			System.out.println("El apellido Gonzales existe en la lista.");
		} else {
			System.out.println("El apellido Gonzales NO existe en la lista");
		}

		System.out.println("\n-_-_-_-_\n");
		ArrayList<String> alfabeticoInverso = apellidos;
		Collections.sort(alfabeticoInverso);
		Collections.reverse(alfabeticoInverso);

		System.out.println("La lista con los elementos ordenados en orden inverso al alfabetico es: " + apellidos);
	}
}

