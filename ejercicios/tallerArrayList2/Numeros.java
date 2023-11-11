import java.util.ArrayList;
import java.util.Collections;

public class Numeros {
	
	public static void main(String[] args){
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(5);
		numeros.add(31);
		numeros.add(27);
		numeros.add(94);
		numeros.add(61);
		numeros.add(47);
		numeros.add(10);

		
		System.out.println("La lista original es: "+ numeros);
		System.out.println("\n-_-_-_-_\n");

		if(numeros.contains(10)) {
			System.out.println("El numero 10 SI existe en la lista.");
		} else {
			System.out.println("El numero 10 NO existe en la lista");
		}

		System.out.println("\n-_-_-_-_\n");

// ordenar de menor a mayor
		ArrayList<Integer> reverseNumeros = numeros;
		Collections.sort(reverseNumeros);
// obtener el numero mayor
		System.out.println("De la lista, el numero mas grande es: " + reverseNumeros.get(7));

		System.out.println("\n-_-_-_-_\n");
	}	
}

