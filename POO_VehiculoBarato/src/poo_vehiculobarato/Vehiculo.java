package poo_vehiculobarato;

public class Vehiculo {

    private String marca;
    private String modelo;
    private float precio;

    //Metrodo constructor
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    //Geter del precio
    public float getPrecio() {
        return precio;
    }

    //Mostrar datos
    public String mostrarDatos() {

        return "\tMarca: " + marca + "\n\tModelo: " + modelo + "\n\tPrecio: " + precio + "$";
    }

}
