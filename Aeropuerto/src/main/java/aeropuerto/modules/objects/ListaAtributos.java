package aeropuerto.modules.objects;

import java.util.ArrayList;
import aeropuerto.modules.templates.*;

public class ListaAtributos {

// Metodo que obtiene una lista de pilotos y retorna una lista de licencias de pilotos
    public ArrayList<String> licenciaPilotos(ArrayList<Piloto> listaObjeto) {
		ArrayList<String> listaString = new ArrayList<>();
		for(int i=0; i< listaObjeto.size(); i++) {
            listaString.add(listaObjeto.get(i).getLicencia());
		}
		return listaString;
	}

// Metodo que obtiene una lista de pilotos y retorna una lista de vuelos que maneja cada piloto.
	public ArrayList<ArrayList<Integer>> VuelosPilotos(ArrayList<Piloto> listaObjeto) {
		ArrayList<ArrayList<Integer>> listaInt = new ArrayList<>();
		for(int i=0; i< listaObjeto.size(); i++) {
            listaInt.add(listaObjeto.get(i).getListaVuelos());
		}
		return listaInt;
	}

// Metodo que obtiene una lista de torres y retorna una lista de id de torres
	public ArrayList<String> idTorres(ArrayList<Torre> listaObjeto) {
		ArrayList<String> listaString = new ArrayList<>();
		for(int i=0; i< listaObjeto.size(); i++) {
            listaString.add(listaObjeto.get(i).getId());
		}
		return listaString;
	}

// Metodo que obtiene una lista de vuelos y retorna una lista de numero de vuelos
	public ArrayList<Integer> numVuelos(ArrayList<Vuelo> listaObjeto) {
		ArrayList<Integer> listaInt = new ArrayList<>();
		for(int i=0; i< listaObjeto.size(); i++) {
            listaInt.add(listaObjeto.get(i).getNumVuelo());
		}
		return listaInt;
	}

// Metodo que obtiene una lista de vuelos y retorna una lista de informacion de vuelos
	public ArrayList<String> infoVuelos(ArrayList<Vuelo> listaObjeto) {
		ArrayList<String> listaString = new ArrayList<>();

		for(int i=0; i< listaObjeto.size(); i++) {
            listaString.add(listaObjeto.get(i).infoVuelo());
		}
		return listaString;
	}

// Metodo que obtiene una lista de aerolineas y retorna una lista nombres de aerolineas
	public ArrayList<String> nombreAerolineas(ArrayList<Aerolinea> listaObjeto) {
		ArrayList<String> listaStrings = new ArrayList<>();
		for(int i=0; i< listaObjeto.size(); i++) {
            listaStrings.add(listaObjeto.get(i).getNombre());
		}
		return listaStrings;
	}

// Metodo que obtiene una lista de vuelos y retorna una lista de estados de los vuelos
	public ArrayList<String> estadoVuelo(ArrayList<Vuelo> listaObjeto) {
		ArrayList<String> listaStrings = new ArrayList<>();
		for(int i=0; i< listaObjeto.size(); i++) {
            listaStrings.add(listaObjeto.get(i).getEstado());
		}
		return listaStrings;
	}

// Metodo que obtiene una lista de pilotos y retorna una lista de categorias de vuelo de los pilotos
	public ArrayList<String> categoriasExistentes(ArrayList<Piloto> listaObjeto) {
		ArrayList<String> listaStrings = new ArrayList<>();
		for(int i=0; i< listaObjeto.size(); i++) {
            listaStrings.add(listaObjeto.get(i).getCategoria());
		}
		return listaStrings;
	}
}
