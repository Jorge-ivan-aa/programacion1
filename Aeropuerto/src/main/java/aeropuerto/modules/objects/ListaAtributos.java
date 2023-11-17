package aeropuerto.modules.objects;

import java.util.ArrayList;
import aeropuerto.modules.templates.*;

public class ListaAtributos {

    public ArrayList<String> licenciaPilotos(ArrayList<Piloto> listaObjeto) {
		ArrayList<String> listaString = new ArrayList<>();
		for(int i=0; i< listaObjeto.size(); i++) {
            listaString.add(listaObjeto.get(i).getLicencia());
		}
		return listaString;
	}

	public ArrayList<ArrayList<Integer>> VuelosPilotos(ArrayList<Piloto> listaObjeto) {
		ArrayList<ArrayList<Integer>> listaInt = new ArrayList<>();
		for(int i=0; i< listaObjeto.size(); i++) {
            listaInt.add(listaObjeto.get(i).getListaVuelos());
		}
		return listaInt;
	}


	public ArrayList<String> idTorres(ArrayList<Torre> listaObjeto) {
		ArrayList<String> listaString = new ArrayList<>();
		for(int i=0; i< listaObjeto.size(); i++) {
            listaString.add(listaObjeto.get(i).getId());
		}
		return listaString;
	}

	public ArrayList<Integer> numVuelos(ArrayList<Vuelo> listaObjeto) {
		ArrayList<Integer> listaInt = new ArrayList<>();
		for(int i=0; i< listaObjeto.size(); i++) {
            listaInt.add(listaObjeto.get(i).getNumVuelo());
		}
		return listaInt;
	}

	public ArrayList<String> nombreAerolineas(ArrayList<Aerolinea> listaObjeto) {
		ArrayList<String> listaStrings = new ArrayList<>();
		for(int i=0; i< listaObjeto.size(); i++) {
            listaStrings.add(listaObjeto.get(i).getNombre());
		}
		return listaStrings;
	}

	public ArrayList<String> estadoVuelo(ArrayList<Vuelo> listaObjeto) {
		ArrayList<String> listaStrings = new ArrayList<>();
		for(int i=0; i< listaObjeto.size(); i++) {
            listaStrings.add(listaObjeto.get(i).getEstado());
		}
		return listaStrings;
	}

	public ArrayList<String> categoriasExistentes(ArrayList<Piloto> listaObjeto) {
		ArrayList<String> listaStrings = new ArrayList<>();
		for(int i=0; i< listaObjeto.size(); i++) {
            listaStrings.add(listaObjeto.get(i).getCategoria());
		}
		return listaStrings;
	}

}
