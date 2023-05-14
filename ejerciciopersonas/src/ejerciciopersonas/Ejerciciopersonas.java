/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopersonas;

import ejerciciopersonas.entidades.Persona;

/**
 *
 * @author Miguel Ángel
 */
public class Ejerciciopersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona("Juan", 25);
        persona1.mostrarPersona(persona1);
    }
    
}
