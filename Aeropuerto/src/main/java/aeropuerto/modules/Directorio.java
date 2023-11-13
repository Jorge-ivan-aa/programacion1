package aeropuerto.modules;

import java.util.ArrayList;

public class Directorio {
    private ArrayList<String> aerolineas;

    public Directorio(ArrayList<String> aerolineas) {
        this.aerolineas = aerolineas;
    }

    public ArrayList<String> getAerolineas() {
        return aerolineas;
    }

    @Override
    public String toString() {
        return "Nuestro directorio de aerolineas:" + aerolineas;
    }

    


}
