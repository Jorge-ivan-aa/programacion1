package aeropuerto.modules.templates;

import java.util.ArrayList;

public class Aerolinea {
    private String nombre;
    private ArrayList<Vuelo> listaVuelos;

    public Aerolinea(String nombre){
        this.nombre = nombre;
        this.listaVuelos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Vuelo> getlistaVuelos() {
        return this.listaVuelos;
    }

    public void setVuelos(Vuelo vuelo) {
        this.listaVuelos.add(vuelo);
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\nLista de vuelos: " + this.listaVuelos;
    }
}
