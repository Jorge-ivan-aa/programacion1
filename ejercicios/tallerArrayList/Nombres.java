import java.util.ArrayList;

public class Nombres {
	
	public static void main(String[] args){
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Jorge");
		nombres.add("Marco");
		nombres.add("Samira");
		nombres.add("Manuel");
		nombres.add("Diana");	
		nombres.add("Sofia");

		System.out.println("La lista original es: " + nombres);
		nombres.set(1,"Ana");
		System.out.println("La lista con el segundo elemento modificado: " + nombres);
		nombres.remove(0);
		System.out.println("La lista con el primer elemento eliminado: " + nombres);
		
		boolean existe = false;
		for (int i=0; i<nombres.size(); i++){
				if (nombres.get(i) == "Carlos") {
					existe = true;
				}
		}
		if(existe) {
			System.out.println("El nombre carlos existe en la lista");
		} else {	
			System.out.println("El nombre carlos NO existe en la lista");
		}
		

		nombres.set(1,"Pedro");
		System.out.println("La lista con el segundo elemento modificado: " + nombres);
	}
}

