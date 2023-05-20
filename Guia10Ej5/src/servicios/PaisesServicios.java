/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class PaisesServicios {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearPaises(){
        HashSet<String> pais = new HashSet();
        
        boolean bandera = true;  
         do {
            
            System.out.println("Ingrese un país: ");
            pais.add(leer.next());
            
            System.out.println("¿Quiere guardar otro país o quiere salir? S/N");
            String respuesta = leer.next();
            
            
             if (respuesta.equalsIgnoreCase("n")) {
                 bandera= false;
             } 
        } while (bandera);
         
            System.out.println("Los países son: ");
            for (String paises : pais) {
            System.out.println(paises);
            }
        
        System.out.println("-----------------------------");    
        
        System.out.println("Mostramos los paises ordenados");
        ArrayList<String> lista = new ArrayList<>(pais);
        Collections.sort(lista);
        for (String paises : lista) {
            System.out.println(paises);
       }
            
        System.out.println("-------------------------"); 
        
        
        
        Iterator<String> it = pais.iterator();
        System.out.println("Ingrese el país a eliminar: ");
        String nombre = leer.next();
        int cont = 0;
        while (it.hasNext()) {
         if (it.next().equalsIgnoreCase(nombre)){
             
         it.remove();
         cont++; 
           } 
        
        }
        
        if (cont>0) {
            System.out.println("Los países que quedaron son: ");
         for (String paises : pais) {
            System.out.println(paises);
         }
        } else {
         System.err.println("No se encontro ese país");
        
         }
    }
    
}
