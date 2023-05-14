/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio9guialectura;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Ejercio9Guialectura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el objeto Scanner
        Scanner entrada = new Scanner(System.in);
        // Creamos una variable de tipo entero
        int num ;
        // Creamos una variable de tipo caracter para alojar el "*"
        String ast = "*";
        // Usamos el bucle For para hacer las sentencias
        for (int i = 0; i < 4; i++) {
            // Pedimos al usuario que ingrese el número
            System.out.println("Ingrese un número entre 1 y 20");
            // Leemos el valor ingresado
            num = entrada.nextInt();
            if ( num >=1 || num <=20){
                //Imprimimos la sentencia
                System.out.print(num  );
                for (int j = 0; j < num; j++) {
                    System.out.print( ast);
                }
                System.out.println(" ");
            }
            
            
        }
    }
    
}
