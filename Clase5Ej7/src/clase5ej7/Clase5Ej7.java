/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5ej7;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Clase5Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int correctas = 0, incorrectas = 0;
        String cadena;
        
        do {
            System.out.println("Ingrese una cadena: ");
            cadena = leer.nextLine();
            
            if (cadena.length() == 5 && cadena.substring(0,1).equals("X") && cadena.substring(4).equals("O")) {
                correctas += 1;
            } else if (!cadena.equals("&&&&&")) { incorrectas += 1; }
 
        } while (!cadena.equals("&&&&&"));
        
        System.out.println("Cantidad de cadenas correctas: " + correctas );
        System.out.println("Cantidad de cadenas incorrectas: " + incorrectas);
        
    }
    
    }
    

