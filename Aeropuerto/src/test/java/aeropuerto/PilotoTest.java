package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import aeropuerto.modules.templates.Piloto;


// metodo(): función.| entradas.

public class PilotoTest {
    @Test

// asignarVuelo(): añade un nuevo numero de vuelo a la lista de vuelos siempre que la categoria del vuelo coincida con la categoria del piloto. | Recibe un numero de vuelo<Integer> y una categoria<String>.

    public void testAsignarVuelo() {
        Piloto prueba = new Piloto("juan", "fgfhgj", "Carga");

        // datos de vuelo virtual.
        String categoria = "Internacional";
        int numVuelo = 1234;


        ArrayList<Integer> esperado = new ArrayList<>();
        esperado.add(numVuelo);

        // ejecutar el metodo
        prueba.AsignarVuelo(numVuelo, categoria);

        ArrayList<Integer> resultado = prueba.getListaVuelos();


        assertArrayEquals(esperado.toArray(), resultado.toArray(), "Las listas no son iguales, probablemente la categoria no exista");
    }
}
