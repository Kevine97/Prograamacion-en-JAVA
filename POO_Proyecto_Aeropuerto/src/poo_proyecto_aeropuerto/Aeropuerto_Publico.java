package poo_proyecto_aeropuerto;

public class Aeropuerto_Publico extends Aeropuerto {

    private double subvencion;

    public Aeropuerto_Publico(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public Aeropuerto_Publico(double subvencion, String nombre, String ciudad, String pais, Compañia[] c) {
        super(nombre, ciudad, pais, c);
        this.subvencion = subvencion;
    }

    public Aeropuerto_Publico(double subvencion, String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
        this.subvencion = subvencion;
    }

    public double getSubvencion() {
        return subvencion;
    }

}
