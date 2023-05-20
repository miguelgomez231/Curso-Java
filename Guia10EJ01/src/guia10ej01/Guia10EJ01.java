/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ej01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Guia10EJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> razaPerro = new ArrayList();
        Scanner leer = new Scanner(System.in);
        // Agregamos la raza en un bucle
        boolean opcion = true;
        do {
            System.out.println("Ingrese una raza de perro: ");
            razaPerro.add(leer.next());
            System.out.println("Desea seguir agregando razas? S/N" );
            String respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("N")) {
                opcion = false;
            }
        } while (opcion);
        
//        for (String razas : razaPerro) {
//            System.out.println(razas);
//        }
        System.out.println(razaPerro.toString());
        
        System.out.println("Igrese un perro a borrar: ");
        String aux = leer.next();
        Iterator it = razaPerro.iterator();
        boolean comp = true;
        while (it.hasNext()){
            if (it.next().equals(aux)) {
                it.remove();
                comp = false;
            } 
        }
        if (comp){
                System.out.println("No se encontro esa raza ");
               
        }
        
        Collections.sort(razaPerro);
        
        System.out.println(razaPerro.toString());
   
    }
    
}
