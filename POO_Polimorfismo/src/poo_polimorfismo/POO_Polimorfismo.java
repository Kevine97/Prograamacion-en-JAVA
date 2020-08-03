/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_polimorfismo;

/**
 *
 * @author Ara-PC
 */
public class POO_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo misVehiculos[] = new Vehiculo[4];
        misVehiculos[0] = new Vehiculo("1004JK", "Ferrari", "F2019");
        misVehiculos[1] = new VehiculoTurismo(4, "114GH", "AUDI", "A2010");
        misVehiculos[2] = new VehiculoDeportivo(400, "AS204", "MERCEDEZ", "M2029");
        misVehiculos[3] = new VehiculoFurgoneta(800, "DFK890", "MONSTER", "MONS901");
        
        /*for(Vehiculo vehiculos: misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
        }*/
        
        for (int i = 0; i < misVehiculos.length; i++) {
            
            System.out.println(misVehiculos[i].mostrarDatos());
            
        }
        
        

    }

}
