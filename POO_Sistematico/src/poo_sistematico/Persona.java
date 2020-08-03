package poo_sistematico;

public class Persona {

    final char sex = 'H';
    private String nombre;
    private int edad;
    private String dni;
    private String sexo;
    //Arreglo de objetos
    Cuenta cuenta[];

    //Constructur vacio
    public Persona() {

    }

    public Persona(String nombre, int edad, String dni, String sexo, Cuenta[] cuenta) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        if (sexo.isEmpty()) {
            this.sexo = "H";
        } else {
            this.sexo = sexo;
        }
        this.cuenta = cuenta;
    }

    //Geter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public char getSexo() {
        return sex;
    }

    

    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Metodo para consultar saldo
    public double consultarSaldo(int n) {

        return cuenta[n].getCantidad();
    }

    //Metodo ingresar dinero
    public void ingresarDinero(int n, double cantidad) {

        cuenta[n].ingresarDinero(cantidad);
    }

    public void retirarDinero(int n, double cantidad) {
        cuenta[n].retirarDinero(cantidad);
    }

    public boolean mayorEdad(int edad) {

        if (edad >= 18) {
            return true;
        } else {
            return false;
        }

    }

    public String persona() {

        return "\tNombre: " + nombre
                + "\tDNI: " + dni
                + "\tEdad: " + edad
                + "\tSexo: " + sexo;

    }

}
