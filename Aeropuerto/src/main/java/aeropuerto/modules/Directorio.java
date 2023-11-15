package aeropuerto.modules;

import java.util.ArrayList;

public class Directorio {
    private ArrayList<String> aerolineas;

    public Directorio() {
    }
    
    public void menu() {
        // Instanciación de objetos para la clase Aerolinea
        Aerolinea air = new Aerolinea("Air");
        Aerolinea jetAirways = new Aerolinea("Jet Airways");
        Aerolinea emirates = new Aerolinea("Emirates");
        Aerolinea delta = new Aerolinea("Delta");
        Aerolinea united = new Aerolinea("United");

        // Instanciación de objetos para la clase Vuelo
        Vuelo vuelo1 = new Vuelo(101, "Air", "Internacional", "Terminal 1", "A1", "2023-01-15", "2023-01-16", "Ruta1", 150);
        Vuelo vuelo2 = new Vuelo(102, "Jet Airways", "Nacional", "Terminal 2", "B2", "2023-02-20", "2023-02-21", "Ruta2", 200);
        Vuelo vuelo3 = new Vuelo(201, "Emirates", "Internacional", "Terminal 3", "C3", "2023-03-25", "2023-03-26", "Ruta3", 300);
        Vuelo vuelo4 = new Vuelo(301, "Delta", "Nacional", "Terminal 4", "D4", "2023-04-30", "2023-05-01", "Ruta4", 180);
        Vuelo vuelo5 = new Vuelo(401, "United", "Internacional", "Terminal 5", "E5", "2023-05-15", "2023-05-16", "Ruta5", 250);

        // Instanciación de objetos para la clase Piloto
        Piloto piloto1 = new Piloto("John Doe", "Licencia123", "CategoriaA");
        Piloto piloto2 = new Piloto("Jane Smith", "Licencia456", "CategoriaB");
        Piloto piloto3 = new Piloto("Bob Johnson", "Licencia789", "CategoriaC");
        Piloto piloto4 = new Piloto("Alice Davis", "Licencia101", "CategoriaB");
        Piloto piloto5 = new Piloto("Charlie Brown", "Licencia112", "CategoriaA");

        // Instanciación de objetos para la clase Torre
        Torre torre1 = new Torre("T1", "Ubicacion1", "correo1@example.com", "123-456-7890");
        Torre torre2 = new Torre("T2", "Ubicacion2", "correo2@example.com", "987-654-3210");
        Torre torre3 = new Torre("T3", "Ubicacion3", "correo3@example.com", "111-222-3333");
        Torre torre4 = new Torre("T4", "Ubicacion4", "correo4@example.com", "444-555-6666");
        Torre torre5 = new Torre("T5", "Ubicacion5", "correo5@example.com", "777-888-9999");
    }

}
