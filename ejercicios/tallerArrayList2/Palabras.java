import java.util.ArrayList;

public class Palabras {
	
	public static void main(String[] args){
		ArrayList<String> palabras = new ArrayList<>();
		palabras.add("frijol");
		palabras.add("pastel");
		palabras.add("Puerta");
		palabras.add("radio");
		palabras.add("billetera");
		palabras.add("Blanco");

		
		System.out.println("La lista original es: "+ palabras);
		System.out.println("\n-_-_-_-_\n");

		for(int i=0; i<palabras.size(); i++) {
			System.out.println(palabras.get(i).toUpperCase());
		}
		System.out.println("\n-_-_-_-_\n");

		System.out.println("El penultimo elemento de la lista es: " + palabras.get(palabras.size()-2));
		System.out.println("\n-_-_-_-_\n");



	}
}

