package aeropuerto.modules.templates;

public class Vuelo extends Categoria {

    enum Estado {PROGRAMADO, VOLANDO, ATERRIZADO, CANCELADO}

    private Estado estado;
    private String aerolinea, terminal, puertaEmbarque, fechaDespegue, fechaAterrizaje, ruta, categoria;
    private int numVuelo, numPasajeros;

    
    public Vuelo(int numVuelo, String aerolinea, String categoria, String terminal, String puertaEmbarque, String fechaDespegue, String fechaAterrizaje, String ruta, int numPasajeros) {
       
        super(categoria);
        this.numVuelo = numVuelo;
        this.aerolinea = aerolinea;
        this.estado = Estado.PROGRAMADO;
        this.terminal = terminal;
        this.puertaEmbarque = puertaEmbarque;
        this.fechaDespegue = fechaDespegue;
        this.fechaAterrizaje = fechaAterrizaje;
        this.ruta = ruta;
        this.numPasajeros = numPasajeros;
    }

    public int getNumVuelo() {
        return this.numVuelo;
    }
    public String getEstado() {
        return this.estado.toString();
    }

    public void setVolando() {
        this.estado = Estado.VOLANDO;
    }

    public void setAterrizado() {
        this.estado = Estado.ATERRIZADO;
    }

    public void setCancelado() {
        this.estado = Estado.CANCELADO;
    }
    
    public String toString() {
        return "\n\nNumero de vuelo: " + this.numVuelo + "aerolinea: " + this.aerolinea + "categoria: " +
        this.categoria + "estado: " + this.estado + "terminal: " + this.terminal + "puertaEmbarque: " + 
        this.puertaEmbarque + "fechaDespegue: " + this.fechaDespegue +"fechaAterrizaje: " + 
        this.fechaAterrizaje + "ruta: " + this.ruta + "numVuelo: " + this.numVuelo + 
        "numPasajeros: " + this.numPasajeros + "\n\n";
    }
}
