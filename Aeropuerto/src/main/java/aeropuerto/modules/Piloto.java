package aeropuerto.modules;
import java.util.ArrayList;

public class Piloto extends Categoria {
    private String nombre, licencia;
    private ArrayList<Integer> listaVuelos;

    public Piloto(String nombre, String licencia, String categoria) {
        super(categoria);
        this.nombre = nombre;
        this.licencia = licencia;
        this.listaVuelos = new ArrayList<>();
    }

    public ArrayList<Integer> getListaVuelos() {
        return listaVuelos;
    }

    public void AsignarVuelo(int numVuelo, String categoriaVuelo) {
        if(numVuelo > 0 && numVuelo < 10000000 && categoriaVuelo == this.categoria) {
            this.listaVuelos.add(numVuelo);
        }
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\nlicencia: " + this.licencia + "\nLista de vuelos: " + this.listaVuelos;
    }
}
