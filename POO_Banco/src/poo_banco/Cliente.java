package poo_banco;

/**
 *
 * @author Ara-PC
 */
public class Cliente {

    private String dni;
    private String nombre;
    private String apellido;
    Banco banco[];

    public Cliente() {

    }

    public Cliente(String dni, String nombre, String apellido, Banco[] banco) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.banco = banco;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double consultarSaldo(int n) {

        return banco[n].getSaldo();
    }

    public void ingresarDinero(int n, double cantidad) {

        banco[n].ingresarDinero(cantidad);
    }

    public void retirarDinero(int n, double cantidad) {
        banco[n].retirarDinero(cantidad);
    }

    public boolean inicioSesion(String user, String pass) {

        return user.equals("kevin") && pass.equals("upoli123");

    }

}
