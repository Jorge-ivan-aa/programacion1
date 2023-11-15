package aeropuerto.modules;

import java.util.ArrayList;
//import java.util.Scanner;
import aeropuerto.modules.objects.BaseDeDatos;

public class Directorio {

    public void directorioLicencia(ArrayList<Object> pilotos) {
        for (int i = 0; i <= pilotos.size(); i++) {
            System.out.println("Este es un objeto: " + pilotos.get(i));
        }

    }
    
    public void menu() {
        //Scanner input = new Scanner(System.in);
        BaseDeDatos datos = new BaseDeDatos();

        // int menu = 0;
        // boolean condition = true;

        // while (condition) {
        //     System.out.println("Seleccione una opcion del menu: \n1.Obtener informacion de los vuelos programados para un piloto:");
        //     menu = input.nextInt();
        //     if(menu >= 1 && menu <= 4) {
        //         condition = false;
        //         input.close();
        //     }
        // }
        System.out.println(datos.getPilotos());
    }
}
