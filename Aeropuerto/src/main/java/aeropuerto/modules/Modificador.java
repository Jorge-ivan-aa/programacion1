package aeropuerto.modules;

import java.util.ArrayList;
import java.util.Scanner;
import aeropuerto.modules.templates.*;
import aeropuerto.modules.objects.ListaAtributos;

public class Modificador extends ListaAtributos{
    
    public Modificador() {

    }

    public void vueloAPiloto(ArrayList<Vuelo> vuelos, ArrayList<Piloto> pilotos) {
    
        if(vuelos.isEmpty()){
            System.out.println("No hay vuelos registrados para asignar");
        } else {
            Scanner input = new Scanner(System.in);
            boolean condicional = true;
            int numVuelo = 0;

            while (condicional) {
                System.out.println("La lista de vuelos es: " + numVuelos(vuelos));
                System.out.println("Digite el numero de vuelo a asignar: ");
                numVuelo = input.nextInt();

                for (int i = 0; i < vuelos.size(); i++) {
                    if (numVuelo == vuelos.get(i).getNumVuelo()) {
                        condicional = false;
                    }
                }
            }
            
            String licencia;
            while (condicional == false) {
                System.out.println("Los pilotos actuales son:" + licenciaPilotos(pilotos) + "\nDigita la licencia del Piloto al que se le va a asignar el vuelo: ");
                licencia = input.nextLine();
                licencia.trim();

                for (int i=0; i < pilotos.size(); i++) {
                    if (licencia.equals(pilotos.get(i).getLicencia())) {
                        condicional = true;
                        pilotos.get(i).AsignarVuelo(numVuelo, pilotos.get(i).getCategoria());
                    }
                }
            
            }
            //input.close();
        }
    }

    public void vueloATorre(ArrayList<Vuelo> vuelos, ArrayList<Torre> torres) {
        if(vuelos.isEmpty()){
            System.out.println("No hay vuelos registrados para asignar");
        } else {
          Scanner input = new Scanner(System.in);
            boolean condicional = true;
            int numVuelo = 0;

            while (condicional) {
                System.out.println("La lista de vuelos es: " + numVuelos(vuelos));
                System.out.println("Digite el numero de vuelo a asignar: ");
                numVuelo = input.nextInt();

                for (int i = 0; i < vuelos.size(); i++) {
                    if (numVuelo == vuelos.get(i).getNumVuelo()) {
                        condicional = false;
                    }
                }
            }
            
            String id;
            while (condicional == false) {
                System.out.println("Los torres actuales son:" + idTorres(torres) + "\nDigita el id de la torre que va a vigilar el vuelo: ");
                id = input.nextLine();
                id.trim();

                for (int i=0; i < torres.size(); i++) {
                    if (id.equals(torres.get(i).getId())) {
                        condicional = true;
                        torres.get(i).AsignarVuelo(numVuelo);
                    }
                }
            
            }            
            //input.close();
        }
    }

    public void estadoDeVuelo(ArrayList<Vuelo> vuelos) {
        if (vuelos.isEmpty()) {
            System.out.println("No hay vuelos registrados para asignar");
        } else {
            Scanner input = new Scanner(System.in);
            boolean condicional = true;
            int numVuelo = 0;
            int key = -1;

            while (condicional) {
                System.out.println("La lista de vuelos es: " + numVuelos(vuelos));
                System.out.println("Digite el numero de vuelo a asignar: ");
                numVuelo = input.nextInt();

                for (int i = 0; i < vuelos.size(); i++) {
                    if (numVuelo == vuelos.get(i).getNumVuelo()) {
                        condicional = false;
                        key = i;
                    }
                }
            }

            int menu = 0;
            System.out.println("Ingrese el numero de estado al que quiere cambiar el vuelo: ");
            System.out.println("1.Aterrizado.\n2.Volando.\n3.Cancelado");
            menu = input.nextInt();

            switch (menu) {
                case 1: vuelos.get(key).setAterrizado(); break;
                case 2: vuelos.get(key).setVolando(); break;
                case 3: vuelos.get(key).setCancelado();; break;

                default: System.out.println("El estado ingresado no existe");
                    break;
            }
            //input.close();
        }
        
    }

    public Vuelo registrarVuelo(ArrayList<Aerolinea> aerolineas, ArrayList<Piloto> piloto, ArrayList<Vuelo> vuelo) {
        Scanner input = new Scanner(System.in);
        boolean condition = true;
        
        int numVuelo = 0;

        while (condition) {
            System.out.println("Ingrese el numero del vuelo");
            numVuelo = input.nextInt();

            if(numVuelos(vuelo).contains(numVuelo)) {
                System.out.println("Error: el vuelo ya existe");
            } else {
                condition = false;
            };
        }

        String aerolinea = "";
        int aerolineaKey = -1;
        while (condition == false) {
            System.out.println("Las aerolineas actuales son:"+ nombreAerolineas(aerolineas) +"\nIngrese el nombre de una aerolinea:");
            aerolinea = input.next();

            for (int i = 0; i < nombreAerolineas(aerolineas).size(); i++) {
                if(aerolinea.equals(nombreAerolineas(aerolineas).get(i))) {
                    condition = true;
                    aerolineaKey = i;
                }
            }
        }
        
        System.out.println("Ingrese una categoria para el vuelo:");
        System.out.println("NOTA: Ingresar una categoria no existente puede significar no poder asignar un piloto al vuelo, las categorias actuales son:" + categoriasExistentes(piloto));
        String categoria = input.next();

        System.out.println("Ingrese la terminal de vuelo");
        String terminal = input.next(); 

        System.out.println("Ingrese el codigo de la puerta de embarque");
        String puertaEmbarque = input.next();

        System.out.println("Ingrese la fecha de despegue en formato DD/MM/YY/HH:MM");
        String fechaDespegue = input.next();

        System.out.println("Ingrese la fecha de aterrizaje en formato DD/MM/YY/HH:MM");
        String fechaAterrizaje = input.next(); 

        System.out.println("Ingrese la ruta a cubrir");
        String ruta = input.next();

        int numPasajero = 0;
        while (condition) {
            System.out.println("Ingrese el numero de pasajeros. Maximo 300 pasajeros, minimo 20");
            numPasajero = input.nextInt();

            if (numPasajero <=300 && numPasajero >= 20) {
                condition = false;
            }
        }
        
        Vuelo nuevoVuelo = new Vuelo(numVuelo, aerolinea, categoria, terminal, puertaEmbarque, fechaDespegue, fechaAterrizaje, ruta, numPasajero);

        aerolineas.get(aerolineaKey).setVuelos(nuevoVuelo);

        return nuevoVuelo;
    }
}
