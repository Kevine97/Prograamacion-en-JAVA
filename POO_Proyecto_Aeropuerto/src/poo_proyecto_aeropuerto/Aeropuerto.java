package poo_proyecto_aeropuerto;

public class Aeropuerto {

    private String nombre;
    private String ciudad;
    private String pais;
    private Compañia lista_Compañias[] = new Compañia[10];
    private int num_compañia;

    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.num_compañia = 0;
    }

    public Aeropuerto(String nombre, String ciudad, String pais, Compañia c[]) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        lista_Compañias = c;
        this.num_compañia = c.length;

    }

    public void insertar_Compañia(Compañia compañia) {
        lista_Compañias[num_compañia] = compañia;
        num_compañia++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Compañia[] getLista_Compañias() {
        return lista_Compañias;
    }

    public void setLista_Compañias(Compañia[] lista_Compañias) {
        this.lista_Compañias = lista_Compañias;
    }

    public int getNum_compañia() {
        return num_compañia;
    }

    public void setNum_compañia(int num_compañia) {
        this.num_compañia = num_compañia;
    }

    public Compañia getCompañia(int i) {
        return lista_Compañias[i];
    }

    public Compañia getCompañia(String nombre) {
        boolean encontrado = false;
        int i = 0;
        Compañia c = null;

        while ((!encontrado) && (i < lista_Compañias.length)) {

            if (nombre.equals(lista_Compañias[i].getNombre())) {

                encontrado = true;
                i++;
                c = lista_Compañias[i];
            }

        }
        return c;
    }

}
