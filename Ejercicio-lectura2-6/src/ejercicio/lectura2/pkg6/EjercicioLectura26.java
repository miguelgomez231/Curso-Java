/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.lectura2.pkg6;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class EjercicioLectura26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedimos un números al usuario
        System.out.println("Ingrese el primer número");
        // Leemos el primer número
        Scanner leer = new Scanner(System.in);
        // Guardamos el valor ingresado en una variable
        int numero1 = leer.nextInt() ;
         // Pedimos un números al usuario
        System.out.println("Ingrese el segundo número");
        // Leemos el segundo número
        Scanner leer2 = new Scanner(System.in);
        // Guardamos el valor ingresado en una variable
        int numero2 = leer2.nextInt() ;
        
        // perdimos que compare los numeros anterios con 25
        if (numero1 > 25 && numero2 > 25) {
            System.out.println("Ambos números son mayores a 25.");
        } else if (numero1 > 25 || numero2 > 25 ){// Comprobamos si alguno de los dos es igual a 25
            System.out.println("Al menos uno de los números es mayor a 25.");
        } else { // si ninguno de los números es mayor a 25
            System.out.println("Ninguno de los números es mayor a 25.");
        }
    }
    
}
