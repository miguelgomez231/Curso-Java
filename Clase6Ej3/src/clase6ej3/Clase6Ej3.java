/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6ej3;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Clase6Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leerCadena = new Scanner(System.in);
        // Pedimos al usuario
        System.out.println("Ingrese una letra: ");
        String letra = leerCadena.next();
        if (!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("0") || letra.equalsIgnoreCase("u")) ) {
            System.out.println("No ingresó ninguna vocal");
        }
    }
    
}
