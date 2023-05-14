/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase26ej4;

import Servicios.FechaService;
import java.util.Date;

/**
 *
 * @author Miguel Ángel
 */
public class Clase26Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FechaService fechas = new FechaService();
        
        Date fechaNacimiento = fechas.fechaNacimiento();
        System.out.println(fechaNacimiento.toString());
        System.out.println("---------------------------");
        
        Date fechaActual = fechas.fechaActual();
        System.out.println(fechaActual);
        int edad = fechas.diferencia(fechaNacimiento, fechaActual);
        System.out.println("La persona tiene: " + edad + " años");
    }
    
}
