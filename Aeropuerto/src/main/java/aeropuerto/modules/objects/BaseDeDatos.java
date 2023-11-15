package aeropuerto.modules.objects;

import aeropuerto.modules.templates.*;
import java.util.ArrayList;


public class BaseDeDatos {

	private Aerolinea air, jetAirways, emirates;
	private Vuelo vuelo1, vuelo2, vuelo3, vuelo4, vuelo5;
	private Piloto piloto1, piloto2, piloto3, piloto4;
	private Torre torre1, torre2;

	public BaseDeDatos() {
		// Instanciación de objetos para la clase Aerolinea
		this.air = new Aerolinea("Air");
		this.jetAirways = new Aerolinea("Jet Airways");
		this.emirates = new Aerolinea("Emirates");

		// Instanciación de objetos para la clase Vuelo
		this.vuelo1 = new Vuelo(101, "Air", "Internacional", "Terminal 1", "A1", "2023-01-15", "2023-01-16", "Ruta1", 150);
		this.vuelo2 = new Vuelo(102, "Jet Airways", "Nacional", "Terminal 2", "B2", "2023-02-20", "2023-02-21", "Ruta2", 200);
		this.vuelo3 = new Vuelo(201, "Emirates", "Internacional", "Terminal 3", "C3", "2023-03-25", "2023-03-26", "Ruta3", 300);
		this.vuelo4 = new Vuelo(301, "Air", "Carga", "Terminal 4", "D4", "2023-04-30", "2023-05-01", "Ruta4", 180);
		this.vuelo5 = new Vuelo(401, "Emirates", "Internacional", "Terminal 5", "E5", "2023-05-15", "2023-05-16", "Ruta5", 250);

		// Instanciación de objetos para la clase Piloto
		this.piloto1 = new Piloto("John Doe", "Licencia123", "CategoriaA");
		this.piloto2 = new Piloto("Jane Smith", "Licencia456", "CategoriaB");
		this.piloto3 = new Piloto("Bob Johnson", "Licencia789", "Carga");
		this.piloto4 = new Piloto("Alice Davis", "Licencia101", "Comercial");

		// Instanciación de objetos para la clase Torre
		this.torre1 = new Torre("T1", "Sur", "correo1@example.com", "123-456-7890");
		this.torre2 = new Torre("T2", "Norte", "correo2@example.com", "987-654-3210");

	}

	public ArrayList<Object> getAerolineas() {
		ArrayList<Object> aerolinea = new ArrayList<>();
		aerolinea.add(air);
		aerolinea.add(jetAirways);
		aerolinea.add(emirates);

		return aerolinea;
	}

	public ArrayList<Object> getVuelos() {
		ArrayList<Object> vuelos = new ArrayList<>();
		vuelos.add(vuelo1);
		vuelos.add(vuelo2);
		vuelos.add(vuelo3);
		vuelos.add(vuelo4);
		vuelos.add(vuelo5);

		return vuelos;
	}
	public ArrayList<Object> getPilotos() {
		ArrayList<Object> piloto = new ArrayList<>();
		piloto.add(piloto1);
		piloto.add(piloto2);
		piloto.add(piloto3);
		piloto.add(piloto4);

		return piloto;
	}
	public ArrayList<Object> getTorres() {
		ArrayList<Object> torre = new ArrayList<>();
		torre.add(torre1);
		torre.add(torre2);

		return torre;
	}
}
