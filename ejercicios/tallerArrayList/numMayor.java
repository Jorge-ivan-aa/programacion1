import java.util.ArrayList;

public class numMayor {	

	public static void main(String[] args){
//		System.out.println();
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(3);
		numeros.add(34);
		numeros.add(6);
		numeros.add(2);
		numeros.add(8);	
		numeros.add(16);
		
		int comparador = 0;
		for (int i=0; i<numeros.size(); i++){
				if (comparador < numeros.get(i)) {
					comparador = numeros.get(i);
				}
		}

		System.out.println("De la lista: " + numeros + " el numero más grande es: " + comparador);
		
	}
}
