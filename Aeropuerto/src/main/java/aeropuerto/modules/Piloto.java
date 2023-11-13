package aeropuerto.modules;
import java.util.ArrayList;

public class Piloto {
    private String nombre, licencia;
    private ArrayList<Integer> listaVuelos;

    public Piloto(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
        this.listaVuelos = new ArrayList<>();
    }

    public ArrayList<Integer> getListaVuelos() {
        return listaVuelos;
    }

    public void AsignarVuelo(int numVuelo) {
        if(numVuelo > 0 && numVuelo < 10000000) {
            this.listaVuelos.add(numVuelo);
        }
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\nlicencia: " + this.licencia + "\nLista de vuelos: " + this.listaVuelos;
    }
}
