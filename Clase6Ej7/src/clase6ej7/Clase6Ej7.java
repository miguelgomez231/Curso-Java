/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6ej7;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Clase6Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leerNum = new Scanner(System.in);
        int num ;
        int n ;
        int max  ;
        int min  ;
        int i = 0 ;
        boolean band = true;
        System.out.print("Ingrese la cantidad de números: ");
        n = leerNum.nextInt();
        while (i<n){
            System.out.print("Ingrese el número: ");
            num = leerNum.nextInt();
            if (band){
               max = num;
               min = num;
               band = false;
            }
        }
        
    }
    
}
