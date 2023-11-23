
package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import aeropuerto.modules.templates.Torre;


// metodo(): función.| entradas.

public class TorreTest {
    @Test
// asignarVuelo(): añade un nuevo numero de vuelo a la lista de vuelos siempre que el numero ingresado sea un entero positivo menor a 1000000. | Recibe un numero de vuelo<Integer>.

    public void testAsignarVuelo() {
        Torre prueba = new Torre("T3", "este", "mail@example.com", "077-234-245");

        // datos de vuelo virtual.
        int numVuelo = 1234;


        ArrayList<Integer> esperado = new ArrayList<>();
        esperado.add(numVuelo);

        // ejecutar el metodo
        prueba.AsignarVuelo(numVuelo);

        ArrayList<Integer> resultado = prueba.getListaVuelos();


        assertArrayEquals(esperado.toArray(), resultado.toArray(), "Los listas no son iguales, probablemente el numero de vuelo ingresado no cumple los requisitos");     
    }
}
