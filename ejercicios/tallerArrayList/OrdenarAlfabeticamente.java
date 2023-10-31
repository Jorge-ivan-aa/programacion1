import java.util.Collections;
import java.util.ArrayList;

public class OrdenarAlfabeticamente {
	
	public static void main(String[] args){
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Jorge");
		nombres.add("Marco");
		nombres.add("Samira");
		nombres.add("Manuel");
		nombres.add("Diana");	
		nombres.add("Sofia");

		System.out.println("La lista original es: " + nombres);

        Collections.sort(nombres);

		System.out.println("La lista ordenada alfabeticamente: " + nombres);
	}
}

