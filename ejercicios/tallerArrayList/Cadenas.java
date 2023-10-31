import java.util.ArrayList;

public class Cadenas {
	
	public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("cadena 1");
        lista.add("cadena 2");
        lista.add("cadena 3");

        System.out.println("Primer elemento de la lista: " + lista.get(1));
        System.out.println("Ultimo elemento de la lista: " + lista.get(lista.size() - 1));

		for (int i=0; i<lista.size(); i++){
			lista.set(i,"Hola");
		}
        System.out.println("Todos los elementos de la lista modificados: " + lista);
	}
}

