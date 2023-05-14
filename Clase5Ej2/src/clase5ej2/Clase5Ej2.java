/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5ej2;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Clase5Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creando la variable scanner
        Scanner entrada = new Scanner(System.in);
        // Creamos una variable numerica
        String frase ;
         // Pedimos al usuario que ingrese el número
        System.out.println("Ingrese una frase: ");
            // Leemos el valor ingresado
        frase = entrada.nextLine();
        
        // Condicional if
        if (frase.equals("eureka") ){
            System.out.println("Correcto ");
        } else {
            System.out.println("Incorrecto ");
        }
    }
    
}
