package poo_herencia_empleados;

public class Comerciante extends Empleado {

    private double comision;

    public Comerciante(double comision, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "\n\nComerciante " + super.toString() + "\ncomision: " + comision;
    }

    @Override
    public double plus() {
        double dinero = 0;

        if (super.getEdad() > 30 && this.comision > 200) {

            dinero = super.getSalario() + super.PLUS;
            super.setSalario(dinero);
            //System.out.println("PLUS: " + super.getSalario());
            
        }

         return dinero;
    }

}
