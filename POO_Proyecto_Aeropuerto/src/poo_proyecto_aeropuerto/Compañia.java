package poo_proyecto_aeropuerto;

public class Compañia {

    private String nombre;
    private Vuelo listaVuelo[] = new Vuelo[10];
    private int num_vuelo = 0;

    public Compañia(String nombre) {
        this.nombre = nombre;
    }

    public Compañia(String nombre, Vuelo v[]) {
        this.nombre = nombre;
        this.listaVuelo = v;
        num_vuelo = v.length;
    }

    public void insertar_Vuelo(Vuelo vuelo) {

        listaVuelo[num_vuelo] = vuelo;
        num_vuelo++;

    }

    public String getNombre() {
        return nombre;
    }

    public int getNum_vuelo() {
        return num_vuelo;
    }

    public Vuelo getVuelo(int i) {

        return listaVuelo[i];
    }

    public Vuelo getVuelo(String vuelo) {

        int i = 0;
        boolean encontrado = false;
        Vuelo v = null;

        while ((!encontrado) && (i < listaVuelo.length)) {

            if (vuelo.equals(listaVuelo[i].getId_Vuelo())) {
                encontrado = true;
                i++;
                v = listaVuelo[i];
            }

        }
        return v;
    }

}
