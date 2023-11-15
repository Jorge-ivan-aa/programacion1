package aeropuerto.modules.templates;
import java.util.ArrayList;

public class Piloto extends Categoria {
    public String nombre, licencia;
    private ArrayList<Integer> listaVuelos;

    public Piloto(String nombre, String licencia, String categoria) {
        super(categoria);
        this.nombre = nombre;
        this.licencia = licencia;
        this.listaVuelos = new ArrayList<>();
    }

    public ArrayList<Integer> getListaVuelos() {
        return this.listaVuelos;
    }

    public String getLicencia() {
        return licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void AsignarVuelo(int numVuelo, String categoriaVuelo) {
        if(numVuelo > 0 && numVuelo < 10000000 && categoriaVuelo == this.categoria) {
            this.listaVuelos.add(numVuelo);
        }
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\nLicencia: " + this.licencia + "\nCategoria: " + this.categoria + "\nLista de vuelos: " + this.listaVuelos + "\n";
    }
}
