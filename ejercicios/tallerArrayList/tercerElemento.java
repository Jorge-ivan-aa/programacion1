import java.util.ArrayList;

public class tercerElemento {
	
	public static void main(String[] args){
		
		ArrayList<Integer> numeros = new ArrayList<>();	
		numeros.add(3);
		numeros.add(34);
		numeros.add(6);
		numeros.add(2);
		numeros.add(8);	
		numeros.add(16);

		System.out.println(numeros);
		System.out.println("El tercer número de la lista es: " + numeros.get(2));
	}
}
