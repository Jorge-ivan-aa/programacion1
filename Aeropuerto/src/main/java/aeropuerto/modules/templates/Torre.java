package aeropuerto.modules.templates;
import java.util.ArrayList;

public class Torre {
    private String id, ubicacion, correo, telefono;
    private ArrayList<Integer> listaVuelos;

    public Torre(String id, String ubicacion, String correo,  String telefono) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.correo = correo;
        this.telefono = telefono;
        this.listaVuelos = new ArrayList<>();
    }

    public ArrayList<Integer> getListaVuelos() {
        return listaVuelos;
    }

    public String getId() {
        return id;
    }

    public void AsignarVuelo(int numVuelo) {
        if(numVuelo > 0 && numVuelo < 10000000) {
            this.listaVuelos.add(numVuelo);
        }
    }

    public String toString() {
        return "Id torre: " + this.id + "\nUbicación: " + this.ubicacion + "\nCorreo: " + this.correo + "\nTelefono: " + this.telefono + "\nVuelos supervisados: " + this.listaVuelos;
    }
}
