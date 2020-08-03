package poo_proyecto_aeropuerto;

public class Vuelo {
    
    private String id_Vuelo;
    private String ciudad_Origen;
    private String ciudad_Destino;
    private double precio;
    private int max_Pasajeros;
    private int num_act_Pasajeros;
    private Pasajero lista_Pasajero[];
    
    public Vuelo(String id_Vuelo, String ciudad_Origen, String ciudad_Destino, double precio, int max_Pasajeros) {
        this.id_Vuelo = id_Vuelo;
        this.ciudad_Origen = ciudad_Origen;
        this.ciudad_Destino = ciudad_Destino;
        this.precio = precio;
        this.max_Pasajeros = max_Pasajeros;
        this.num_act_Pasajeros = 0;
        this.lista_Pasajero = new Pasajero[max_Pasajeros];
    }
    
    public void insertar_pasajero(Pasajero pasajero) {
        lista_Pasajero[num_act_Pasajeros] = pasajero;
        num_act_Pasajeros++;
    }
    
    public String getId_Vuelo() {
        return id_Vuelo;
    }
    
    public String getCiudad_Origen() {
        return ciudad_Origen;
    }
    
    public String getCiudad_Destino() {
        return ciudad_Destino;
    }
    
    public int getMax_Pasajeros() {
        return max_Pasajeros;
    }
    
    public int getNum_act_Pasajeros() {
        return num_act_Pasajeros;
    }
    
    public Pasajero getPasajero(int i) {
        return lista_Pasajero[i];
    }
    
    public Pasajero getPasajero(String pasaporte) {
        
        boolean encontrado = false;
        int i = 0;
        Pasajero pas = null;
        
        while ((!encontrado) && (i < lista_Pasajero.length)) {
            
            if (pasaporte.equals(lista_Pasajero[i].getPasaporte())) {
                encontrado = true;
                pas = lista_Pasajero[i];
                i++;
                
            }
            
        }
        
        return pas;
        
    }
    
}
