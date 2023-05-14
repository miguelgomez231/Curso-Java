/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedimos al usuario que ingrese un número por teclado
        System.out.println("Ingrese un número");
        // Leemos el número ingresado por el usuario
        Scanner leer = new Scanner(System.in) ;
        // Guardamos el valor numérico en una variable
        int numero = leer.nextInt();
        int doble = numero*2 ;
        int triple = numero*3 ;
        double raizCuadrada = Math.sqrt(numero);
        // Mostramos por pantalla el doble del número
        System.out.println("El doble del número ingresado es: " + doble);
        // Mostramos el triple del número
        System.out.println("El triple del número ingresado es: " + triple);
        // Mostramos la raíz cuadrada del número
        System.out.println("La raíz cuadrada del número ingresado es: " + raizCuadrada);
        System.out.println("Quiero un perro");
    }
    
}
