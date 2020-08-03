package spotify_examenfinal;

public class Multimedia {

    protected String titulo;
    protected String autor;
    protected String formato;
    protected double duracion;

    public Multimedia(String titulo, String autor, String formato, double duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "\t\nTitulo: " + titulo + "\n\tAutor: " + autor + "\n\tFormato: " + formato + "\n\tDuracion: " + duracion;
    }

}
