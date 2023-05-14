/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo01;

/**
 *
 * @author Miguel Ángel
 */
public class Poo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona();
        Persona p2 = new Persona("Franco",24,"30.652.900");
        
        p1.setNombre("Jose");
        p1.setEdad(35);
        p1.setDni("35.900.658");
        
        System.out.println(p1.getNombre());
    }
   
}
