/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10eje3;

import servicios.AlumnosServicios;

/**
 *
 * @author Miguel Ángel
 */
public class Guia10Eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlumnosServicios al = new AlumnosServicios();
        al.cargarAlumnos();
        al.notaFinal();
    }
    
    
}
