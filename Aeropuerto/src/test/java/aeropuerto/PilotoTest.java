package aeropuerto;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import aeropuerto.modules.Piloto;

public class PilotoTest {
    @Test
    public void testAsignarVuelo() {
        Piloto a = new Piloto("Roberto", "D1");
        a.AsignarVuelo(123);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(121);

        Object[] original = a.getListaVuelos().toArray();
        Object[] esperado = b.toArray();
        System.out.println("\n-_-_-_-_-_-_\n");
        System.out.println("el original: " + a.getListaVuelos() + " el esperado: " + b);
        assertArrayEquals(original, esperado, "Los arrays No son iguales");
        System.out.println("\n-_-_-_-_-_-_\n");

    }
}
