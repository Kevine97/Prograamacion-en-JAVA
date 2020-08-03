package poo_tablero;

public class Tablero {

    //Atrivutos
    private int x;
    private int y;

    //Inicializamos nuestros atrivutos con nuestro constructor.
    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }


    //Si el usuario mueve hacia arriba
    public void moverArriba(int incremento) {
        y += incremento;
    }

    //Si el usuario mueve hacia abajo
    public void moverAbajo(int incremento) {
        y -= incremento;
    }

    //Si el usuario mueve hacia la derecha
    public void moverDerecha(int incremento) {
        x += incremento;
    }

    //Si el usuario mueve hacia la izquiera
    public void moverIzquierda(int incremento) {
        x -= incremento;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
