/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5ej1;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Clase5Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creando la variable scanner
        Scanner entrada = new Scanner(System.in);
        // Creamos una variable numerica
        int num ;
        // Usamos un bucle condicional IF
        // Pedimos al usuario que ingrese el número
        System.out.println("Ingrese un número: ");
            // Leemos el valor ingresado
        num = entrada.nextInt();
        if (num % 2 ==0){
            // Escribimos la sentencia par
            System.out.println("El número ingresado es un número par");
        } else {
            System.out.println("El nuúmero ingresado es un número impar");
        } 
            
        
    }
    
}
