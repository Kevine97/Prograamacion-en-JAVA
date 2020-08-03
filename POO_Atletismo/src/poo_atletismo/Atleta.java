package poo_atletismo;

public class Atleta {

    private int numeroAtleta;
    private String Nombre;
    private float tiempo;

    public Atleta(int numeroAtleta, String Nombre, float tiempo) {
        this.numeroAtleta = numeroAtleta;
        this.Nombre = Nombre;
        this.tiempo = tiempo;
    }

    public float getTiempo() {
        return tiempo;
    }

    public String mostrarDatos() {

        return "\tNumero Atleta: " + numeroAtleta + "\n\tNombre: " + Nombre + "\n\tTiempo de llegada: " + tiempo+"\n";
    }

}
