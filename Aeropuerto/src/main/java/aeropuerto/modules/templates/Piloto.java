package aeropuerto.modules.templates;
import java.util.ArrayList;

public class Piloto extends Categoria {
    String nombre, licencia;
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
        if(categoriaVuelo.equals(this.categoria)) {
            this.listaVuelos.add(numVuelo);
        }
        else {
            System.out.println("El piloto no pertenece a la categoria de vuelo:" + categoriaVuelo);
        }
    }

//    public String toString() {
  //      return "Nombre: " + this.nombre + "\nLicencia: " + this.licencia + "\nCategoria: " + this.categoria + "\nLista de vuelos: " + this.listaVuelos + "\n";
    //}
}
