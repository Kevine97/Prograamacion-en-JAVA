package poo_sistematico;

public class Cuenta {

    private double cantidad;
    private int numeroCuenta;

    public Cuenta() {

    }

    public Cuenta(double cantidad, int numeroCuenta) {
        this.cantidad = cantidad;
        this.numeroCuenta = numeroCuenta;
    }

    //Constructur copia
    public Cuenta(Cuenta n) {
        n.cantidad = cantidad;
        n.numeroCuenta = numeroCuenta;
    }

    //Setter
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    //Geter
    public double getCantidad() {
        return cantidad;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    //Metdodo Ingresar Dinero
    public void ingresarDinero(double saldo) {
        cantidad += saldo;
    }

    //Metodod Retirar Dinero
    public void retirarDinero(double saldo) {
        cantidad -= saldo;
    }

    public String mostrarCuenta(){
        return "\tNumero de cuenta: "+numeroCuenta
                +"\tSaldo: "+"$"+cantidad;
    }
}
