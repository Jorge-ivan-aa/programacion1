package aeropuerto;

import java.util.Scanner;
import aeropuerto.modules.*;
import aeropuerto.modules.objects.*;

public class App {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        BaseDeDatos datos = new BaseDeDatos();
        Directorio directorio = new Directorio();
        Modificador modificador = new Modificador();

        System.out.println("### Bienvenido al controlador aereo del Aeropuerto XXXX ###");

        int menu = 0;
        String[] opt = {
            "\n1.Asignar vuelo a piloto",
            "\n2.Obtener informacion de los vuelos programados para un piloto",
            "\n3.Asignar vuelo a torre de control",
            "\n4.Obtener informacion de los vuelos supervisados por una torre de control",
            "\n5.Obtener informacion de aerolinea",
            "\n6.Cambiar estado de vuelo",
            "\n7.Ver todos los vuelos actuales",
            "\n8.Programar vuelo",
            "\n\nN.Oprima cualquier otro numero para salir",
        };

        boolean condition = true;
        while (condition) {
            System.out.println("\n-_-_-_-_-_-_-_-_\n");
            System.out.println("Seleccione una opcion del menu: " + opt[0] + opt[1]+ opt[2] + opt[3]+ opt[4] + opt[5] + opt[6] + opt[7] + opt[8]);
            menu = input.nextInt();

            switch (menu) {
                case 1: modificador.vueloAPiloto(datos.getVuelos(), datos.getPilotos()); break;
                case 2: directorio.vuelosPilotos(datos.getPilotos()); break;
                case 3: modificador.vueloATorre(datos.getVuelos(), datos.getTorres()); break;
                case 4: directorio.vuelosTorres(datos.getTorres()); break;
                case 5: directorio.vuelosAerolineas(datos.getAerolineas()); break;
                case 6: modificador.estadoDeVuelo(datos.getVuelos()); break;
                case 7: directorio.showVuelos(datos.getVuelos()); break;
                case 8: datos.setVuelo(modificador.registrarVuelo(datos.getAerolineas(), datos.getPilotos(), datos.getVuelos())); break;

                default: condition = false; break;
            }
        }

        input.close();
    }
}
