package aeropuerto.modules.objects;

import aeropuerto.modules.templates.*;
import java.util.ArrayList;


public class BaseDeDatos{

	private Aerolinea air, jetAirways, emirates;
	private Piloto piloto1, piloto2, piloto3, piloto4;
	private Torre torre1, torre2;
	private ArrayList<Vuelo> vuelos;
	public BaseDeDatos() {
		// Instanciación de objetos para la clase Aerolinea
		this.air = new Aerolinea("Air");
		this.jetAirways = new Aerolinea("Jet Airways");
		this.emirates = new Aerolinea("Emirates");

		// Instanciación de objetos para la clase Vuelo
		this.vuelos = new ArrayList<>();

		// Instanciación de objetos para la clase Piloto
		this.piloto1 = new Piloto("John Doe", "Licencia123", "CategoriaA");
		this.piloto2 = new Piloto("Jane Smith", "Licencia456", "CategoriaB");
		this.piloto3 = new Piloto("Bob Johnson", "Licencia789", "Carga");
		this.piloto4 = new Piloto("Alice Davis", "Licencia101", "Comercial");

		// Instanciación de objetos para la clase Torre
		this.torre1 = new Torre("T1", "Sur", "correo1@example.com", "123-456-7890");
		this.torre2 = new Torre("T2", "Norte", "correo2@example.com", "987-654-3210");

	}


	public ArrayList<Aerolinea> getAerolineas() {
		ArrayList<Aerolinea> aerolinea = new ArrayList<>();
		aerolinea.add(air);
		aerolinea.add(jetAirways);
		aerolinea.add(emirates);

		return aerolinea;
	}


	public ArrayList<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelos.add(vuelo);
	}


	public ArrayList<Piloto> getPilotos() {
		ArrayList<Piloto> piloto = new ArrayList<>();
		piloto.add(piloto1);
		piloto.add(piloto2);
		piloto.add(piloto3);
		piloto.add(piloto4);
		
		return piloto;
	}
	

	public ArrayList<Torre> getTorres() {
		ArrayList<Torre> torre = new ArrayList<>();
		torre.add(torre1);
		torre.add(torre2);

		return torre;
	}
}