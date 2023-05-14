/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;
/**
 *
 * @author Miguel Ángel
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedimos al usuario que ingrese una frase
        //System.out.println("Ingresa una frase:");
        System.out.println("Ingrese tres palabras");
        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();
        
        // Mostramos la frase en mayúsculas
        System.out.print("La frase en mayúsculas es:");
        System.out.println(frase.toUpperCase());
        
        // Mostramos la frase en minúsculas
        System.out.print("La frase en minúsculas es:");
        System.out.println(frase.toLowerCase());
    }
    
}
