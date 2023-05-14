/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio1;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class PooEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        pedirDatos();
        
        // Mostramos los datos
        
       
    }

    private static void pedirDatos() {
        Libro libro = new Libro();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Título libro");
        libro.setTitulo(leer.next());
        System.out.println("Ingrese ISBM");
        libro.setISBN(leer.nextInt());
        System.out.println("Ingrese el autor del lubro " + libro.getTitulo());
        libro.setAutor(leer.next());
        System.out.println("Ingrese cantidad de páginas");
        libro.setNpagina(leer.nextInt());//To change body of generated methods, choose Tools | Templates.
        
         System.out.println("El título del libro es: " + libro.getTitulo() + ",su ISBN es " + libro.getISBN() + " su autor es " + libro.getAutor() + "La cantidad de páginas son: " + libro.getNpagina()  );
    } 
    
    
    
}
