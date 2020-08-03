package poo_numeroscomplejos;

public class Complejo {

    //Ejemplo 3+4i
    private double a; //Parte real
    private double b; //Parte imaginaria

    public Complejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public Complejo suma(Complejo c) {

        Complejo suma = new Complejo(a + c.getA(), b + c.getB());
        return suma;
    }

    public Complejo producto(Complejo c) {

        Complejo mult = new Complejo((a * c.getA() - b * c.getB()), (a * c.getB() + b * c.getA()));
        return mult;
    }

    public boolean igualdad(Complejo c) {
        boolean igual = false;
        if ((a == c.getA()) && (b == c.getB())) {
            igual = true;
        }
        return igual;
    }

    public Complejo entero(int x) {
        Complejo mult = new Complejo(a * x, b * x);
        return mult;
    }

}
