/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Le pedimos al usuario que ingrese los grados en celsius
        System.out.println("Ingrese la cantidad de grados celsius que desea convertir a F°");
        // Leemos los datos que ingresa el usuario
        Scanner leer = new Scanner(System.in);
        // Creamos la variable que guarda datos en celsius
        double temperaturaCelsius = leer.nextDouble();
        // Mostramos los datos ingresados por el usuario
        System.out.println("La temperatura ingresada es de:" + temperaturaCelsius);
        // Mostramos su equivalente en Fahrenheit
        System.out.println("Su equivalente en grados Fahrenheit es: " + (32 + (9*temperaturaCelsius/5)));
    }
    
}
