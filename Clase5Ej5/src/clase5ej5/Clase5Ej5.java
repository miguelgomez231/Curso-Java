/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5ej5;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Clase5Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creando la variable scanner
        Scanner entrada = new Scanner(System.in);
        // Creamos una variable numerica
        int limit ;
        int num ;
        int suma = 0 ;
        // Le pedimos al usuario que ingrese el valor limite
        System.out.println("Ingrese un valor límite: ");
        limit = entrada.nextInt();
        // Le pedimos que ingrese un número
        
        // Usamos un bucle While
        while (suma < limit){
            System.out.println("Ingrese un numero: ");
            num = entrada.nextInt();
            suma = suma + num ;}
        
    }
    
}
