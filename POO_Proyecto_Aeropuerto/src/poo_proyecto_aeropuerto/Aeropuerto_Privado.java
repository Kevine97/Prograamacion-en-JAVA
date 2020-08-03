package poo_proyecto_aeropuerto;

public class Aeropuerto_Privado extends Aeropuerto {

    private String lista_empresas[] = new String[10];
    private int num_empresa;

    public Aeropuerto_Privado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public Aeropuerto_Privado(String nombre, String ciudad, String pais, Compañia[] c, String e[]) {
        super(nombre, ciudad, pais, c);
        this.lista_empresas = e;
        num_empresa = e.length;
    }

    public void insetar_empresas(String e[]) {

        this.lista_empresas = e;
        num_empresa = e.length;
    }

    public void insertar_empresa(String e) {
        lista_empresas[num_empresa++] = e;

    }

    public String[] getLista_empresas() {
        return lista_empresas;
    }

    public int getNum_empresa() {
        return num_empresa;
    }

}
