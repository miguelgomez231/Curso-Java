/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio8guia;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Ejercio8guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos un objeto Scanner para leer la entrada
        Scanner entrada = new Scanner(System.in);
        // Inicializamos la variable nota
        double nota = -1;
        
        // Se crea el bucle mientra la nota no esté en el rango
        while (nota < 0 || nota > 10) {
            // se le pide al usuario que ingrese la nota
            System.out.println("Ingrese la nota (0-10): ");
            // Leemos la nota ingresada por el usuario
            nota = entrada.nextDouble();
            // Verificamos si la nota está fuera de rango
            if (nota < 0 || nota > 10){
                System.out.println("La nota ingresada no es correcta");
            }
        }
        // mostramos la nota ingresa por el usuario
        System.out.println("La nota ingresada es: " + nota);
        // cerramos el objeto scanner
        entrada.close();
    }
    
}
