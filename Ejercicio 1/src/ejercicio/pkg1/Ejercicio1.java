/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // creamos la viariable scanner que pide los datos
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa un número: ");
        int num1 = leer.nextByte();
        System.out.println("Ingresa un número: ");
        int num2 = leer.nextByte();
        
        int suma = num1 + num2;
        
        System.out.println("La suma de ambos numeros es: " + suma );
        
        
    }
  }
    



    
    

