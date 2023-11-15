package aeropuerto.modules.templates;

import java.util.ArrayList;

public class Aerolinea {
    private String nombre;
    private ArrayList<Integer> vuelos;

    public Aerolinea(String nombre){
        this.nombre = nombre;
        this.vuelos = new ArrayList<>();
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\nLista de vuelos: " + this.vuelos;
    }
}
