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

    public String getUbicacion() {
        return ubicacion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void AsignarVuelo(int numVuelo) {
        if(numVuelo > 0 && numVuelo < 1000000) {
            this.listaVuelos.add(numVuelo);
        }
    }
}
