/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase17eje1guia;


import clase17eje1guia.Entidad.Persona;
import clase17eje1guia.ServicePersona.ServicePersona.ServicePersona;

/**
 *
 * @author Miguel Ángel
 */
public class Clase17eje1guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicePersona per1 = new ServicePersona();
        
        Persona p1 = per1.recibePersona();
        System.out.println(p1.toString());
        
        
    }
    
}
