import java.util.ArrayList;

public class duplicarNumeros {
	
	public static void main(String[] args){
		ArrayList<Integer> numeros = new ArrayList<>();	
		numeros.add(3);
		numeros.add(34);
		numeros.add(6);
		numeros.add(2);
		numeros.add(8);	
		numeros.add(16);
		
		System.out.println("Lista original: " + numeros);

		for (int i=0; i<numeros.size(); i++){
			numeros.set(i, numeros.get(i)*2);
		}

		System.out.println("\nLista depues de duplicar números: " + numeros);
	}
}

