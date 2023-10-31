import java.util.ArrayList;

public class Empty {
	public static void main(String[] args){
	ArrayList<String> lista = new ArrayList<>();	
	System.out.println("La lista tiene: " + lista.size() + " elementos");

	if (lista.isEmpty()) {
		System.out.println("La lista está vacia");
	} else {
		System.out.println("La lista tiene elementos");
	}

	System.out.println("\nAhora le agregue un elemento a la lista, por tanto:");
	lista.add("elemento1");
	System.out.println("La lista tiene: " + lista.size() + " elementos");

	if (lista.isEmpty()) {
		System.out.println("La lista está vacia");
	} else {
		System.out.println("La lista tiene elementos");
	}

	}
}

