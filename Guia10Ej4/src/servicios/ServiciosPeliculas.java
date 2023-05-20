/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Peliculas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import peliculasUtilidades.comparador;


/**
 *
 * @author Miguel Ángel
 */
public class ServiciosPeliculas {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ServiciosPeliculas() {
    }
    
    
    
    public void crearPelícula(){
         ArrayList<Peliculas> peli = new ArrayList();
         
         boolean bandera = true;  
         do {
            Peliculas pelicula = new Peliculas();
            System.out.println("Ingrese el título de la película");
            pelicula.setTilulo(leer.next());
            
            System.out.println("Igrese el director: ");
            pelicula.setDirector(leer.next());
            System.out.println("Igrese la duración: ");
            pelicula.setDuración(leer.nextDouble());
            
            peli.add(pelicula);
            
            System.out.println("Quierer crear otra película");
            String respuesta = leer.next();
            
            
             if (respuesta.equalsIgnoreCase("n")) {
                 bandera= false;
             }
        } while (bandera);
        System.out.println("Lista de peliculas");
        
        for (Peliculas pel : peli) {
            System.out.println(pel);
        }
        System.out.println("-----------------------------------------");
        System.out.println("Peliculas mayores a 1 hora");
        
        for (Peliculas pel : peli) {
            if (pel.getDuración()>1) {
                System.out.println(pel);
            }
            
        }
        System.out.println("-----------------------------------------");
       
        System.out.println("Ordena las peliculas de mayor a menor");
            
        Collections.sort(peli, comparador.comparaDuracion.reversed());
        
        for (Peliculas pelicula : peli) {
            System.out.println(pelicula);
        }
        System.out.println("---------------------------------");
        System.out.println("Ordena las peliculas de menor a mayor");
            
        Collections.sort(peli, comparador.comparaDuracion);
        
        for (Peliculas pelicula : peli) {
            System.out.println(pelicula);
        }
        
        System.out.println("----------------------------------------");
        
        System.out.println("Titulos ordenados alfabéticamente");
        
        Collections.sort(peli, comparador.comparaTitulo);
        
        for (Peliculas pelicula : peli) {
            System.out.println(pelicula);
        }
        
        System.out.println("----------------------------------------");
        
    }
    
}
