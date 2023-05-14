/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase16exteje5;

import clase16exteje5.Entidad.Empleado;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Clase16ExtEje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado();
        Scanner leer = new Scanner(System.in);
        empleado.crearEmpleado();
        empleado.calcular_aumento();
        System.out.println("Desea aplicar aumento? ");
        String resp = leer.next();
//        if (resp.equalsIgnoreCase("S")) {
//            empleado.setSalario(empleado.getSalario()*);
//        }
//        Scanner leer = new Scanner(System.in);
//        System.out.print("Ingrese el Salario actual: ");
//        empleado.setSalario(leer.nextDouble());
//        System.out.print("Ingrese la edad del empleado: ");
//        empleado.setSalario(leer.nextDouble());
    }
    
}
