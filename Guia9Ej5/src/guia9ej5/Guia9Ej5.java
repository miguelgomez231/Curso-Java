/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej5;

import Entidades.Persona;
import Servicios.PersonaService;

/**
 *
 * @author Miguel Ángel
 */
public class Guia9Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PersonaService ps = new PersonaService();
        Persona persona = ps.crearPersona();
        ps.mostrarPersona(persona);
        
    }
    
}
