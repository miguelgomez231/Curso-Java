/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase17eje1guia.ServicePersona.ServicePersona;

import clase17eje1guia.Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class ServicePersona {
    private Scanner leer = new Scanner(System.in);
    
    public Persona recibePersona(){
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = leer.next();
        System.out.println("Ingrese el genero de la persona:");
        String genero = leer.next();
        System.out.println("Ingrese la edad de la persona:");
        int edad = leer.nextInt();
        
        return new Persona(nombre, genero, edad);
    }
//        Persona per = new Persona();
//    //    String genero;
    //    int edad;


//        public ServicePersona() {
//        }
//
//        public Scanner getLeer() {
//            return leer;
//        }
//
//        public void setLeer(Scanner leer) {
//            this.leer = leer;
//        }
//
//        public Persona getPer() {
//            return per;
//        }
//
//        public void setPer(Persona per) {
//            this.per = per;
//        }
    
//    public void recibePersona(Persona p, String gen, int edad ){
//        
//        System.out.println("Ingrese el nombre de la persona:");
//        per.setNombre(leer.next());
//        System.out.println("Ingrese el genero de la persona:");
//        per.setGenero(leer.next());
//        System.out.println("Ingrese la edad de la persona:");
//        per.setEdad(leer.nextInt());
//        
//        
//        
//        System.out.println(per.getNombre()+ " " + per.getGenero() + " " + per.getEdad());
//    } 
}
