import java.util.ArrayList;

public class EliminarPares {

	public static void main(String[] args){

		ArrayList<Integer> numeros = new ArrayList<>();	
		numeros.add(5);
		numeros.add(10);
		numeros.add(15);
		numeros.add(3);
		numeros.add(34);
		numeros.add(6);
		numeros.add(2);
		numeros.add(8);	
		numeros.add(13);

		System.out.println("\nLista original: " + numeros);

		for (int i=0; i<numeros.size(); i++){
			if (numeros.get(i) % 2 == 0) {
				numeros.remove(i);
				i--;
			}
		}

		System.out.println("\nLista sin numeros pares: " + numeros);
	}
}
