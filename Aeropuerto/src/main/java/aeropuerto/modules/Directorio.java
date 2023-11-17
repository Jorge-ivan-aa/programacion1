package aeropuerto.modules;

import java.util.ArrayList;
import java.util.Scanner;
import aeropuerto.modules.objects.ListaAtributos;
import aeropuerto.modules.templates.*;


public class Directorio extends ListaAtributos {

    public void vuelosPilotos(ArrayList<Piloto> pilotos) {

        Scanner input = new Scanner(System.in);
        boolean condicional = true;

        int key = -1;
        String licencia;

        while (condicional) {
            System.out.println("Los pilotos actuales identificados por sus licencias son:" + licenciaPilotos(pilotos) + "\nDigita la licencia del Piloto a consultar: ");
            licencia = input.nextLine();
            licencia.trim();

            for (int i=0; i<licenciaPilotos(pilotos).size(); i++) {
        
                if (licencia.equals(licenciaPilotos(pilotos).get(i))) {
                    condicional = false;
                    key = i;
                }
            }    
        }
                
        System.out.println("Los vuelos correspondientes al piloto, son: \n" + pilotos.get(key).getListaVuelos() + "\n");
    }

    public void vuelosTorres(ArrayList<Torre> torres){
        Scanner input = new Scanner(System.in);
        boolean condicional = true;

        int key = -1;
        String id;

        while (condicional) {
            System.out.println("Las torre actuales identificadas por sus ids son:" + idTorres(torres) + "\nDigita la id de la torre a consultar: ");
            id = input.nextLine();
            id.trim();

            for (int i=0; i<idTorres(torres).size(); i++) {
        
                if (id.equals(idTorres(torres).get(i))) {
                    condicional = false;
                    //input.close();
                    key = i;
                }
            }    
        }
                
        System.out.println("Los vuelos correspondientes a la torre, son: \n");
        System.out.println(torres.get(key).getListaVuelos() + "\n");


    }

     public void vuelosAerolineas(ArrayList<Aerolinea> aerolineas){
        Scanner input = new Scanner(System.in);
        boolean condicional = true;

        int key = -1;
        String nombre;

        while (condicional) {
            System.out.println("Las aerolineas actuales son:" + nombreAerolineas(aerolineas) + "\nIngresa el nombre de la aerolinea para consultar: ");
            nombre = input.nextLine();
            nombre.trim();

            for (int i=0; i<nombreAerolineas(aerolineas).size(); i++) {
        
                if (nombre.equals(nombreAerolineas(aerolineas).get(i))) {
                    condicional = false;
                    //input.close();
                    key = i;
                }
            }    
        }
        System.out.println("La cantidad total de vuelos que maneja la aerolinea son: " + aerolineas.get(key).getlistaVuelos().size());
        System.out.println("Lista de vuelos: " + numVuelos(aerolineas.get(key).getlistaVuelos()) + "\n");

        ArrayList<String> listaestados = estadoVuelo(aerolineas.get(key).getlistaVuelos());

        System.out.println("Los vuelos programados son: ");
        for (int j= 0; j < listaestados.size(); j++) {
            if("PROGRAMADO".equals(listaestados.get(j))){
                System.out.println(numVuelos(aerolineas.get(key).getlistaVuelos()).get(j));
            }
        }

        System.out.println("Los vuelos cancelados son: ");
        for (int k= 0; k < listaestados.size(); k++) {
            if("CANCELADO".equals(listaestados.get(k))){
                System.out.println(numVuelos(aerolineas.get(key).getlistaVuelos()).get(k));
            }
        }
    }

    public void showVuelos(ArrayList<Vuelo> vuelos) {
        System.out.println("La Lista de vuelos es: " + numVuelos(vuelos));
    }


}
