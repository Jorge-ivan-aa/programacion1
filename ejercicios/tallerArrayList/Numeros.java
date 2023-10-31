import java.util.ArrayList;

public class Numeros {
	
	public static void main(String[] args){

		ArrayList<Integer> numeros = new ArrayList<>();	
		numeros.add(5);
		numeros.add(10);
		numeros.add(15);
		
		for (int i=0; i<numeros.size(); i++){
			System.out.println("En la lista, el elemento " + numeros.get(i) + " se encuentra en el indice " + i);
		}

		System.out.println("\nLista: " + numeros);
	}
}

