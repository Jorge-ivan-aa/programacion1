package aeropuerto.modules;

public class Vuelo {
    private String aerolinea, categoria, estado, terminal, puertaEmbarque, fechaDespegue, fechaAterrizaje, ruta;
    private int numVuelo, numPasajeros;
    
    
    public Vuelo(int numVuelo, String aerolinea, String categoria, String estado, String terminal, String puertaEmbarque,
            String fechaDespegue, String fechaAterrizaje, String ruta, int numPasajeros) {
       
        this.numVuelo = numVuelo;
        this.aerolinea = aerolinea;
        this.categoria = categoria;
        this.estado = estado;
        this.terminal = terminal;
        this.puertaEmbarque = puertaEmbarque;
        this.fechaDespegue = fechaDespegue;
        this.fechaAterrizaje = fechaAterrizaje;
        this.ruta = ruta;
        this.numPasajeros = numPasajeros;
    }


    @Override
    public String toString() {
        return "Numero de vuelo: " + this.numVuelo + "aerolinea: " + this.aerolinea + "categoria: " +
        this.categoria + "estado: " + this.estado + "terminal: " + this.terminal + "puertaEmbarque: " + 
        this.puertaEmbarque + "fechaDespegue: " + this.fechaDespegue +"fechaAterrizaje: " + 
        this.fechaAterrizaje + "ruta: " + this.ruta + "numVuelo: " + this.numVuelo + 
        "numPasajeros: " + this.numPasajeros;
    }
    
    



}
