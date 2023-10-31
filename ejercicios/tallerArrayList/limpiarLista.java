import java.util.ArrayList;

public class limpiarLista {
	
	public static void main(String[] args){
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(3);
		numeros.add(34);
		numeros.add(6);
		numeros.add(5);
		numeros.add(8);	
		numeros.add(16);
	
		System.out.println("Lista original: " + numeros);

		for (int i=0; i<numeros.size(); i++){
			numeros.remove(i);
			i--;	
		}

		System.out.println("Lista sin elementos: " + numeros);
	}
}
