/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6ej5;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Clase6Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leerNum = new Scanner(System.in);
        Scanner leerStr = new Scanner(System.in);
        // Creamos las variables
        String cate ;
        double num ;
        System.out.print("Ingrese su categoría (A / B / C): ");
        cate = leerStr.next();
        System.out.print("Ingrese el monto del tratamiento: ");
        num = leerNum.nextDouble();
        // Condicional
        if (cate.equalsIgnoreCase("A")){
            num = num - (num*0.5);
        } else if (cate.equalsIgnoreCase("B")){
            num = num - (num*0.35);
        }
        System.out.println("El monto a pagar del tratamiento es: " + num);
    }
    
}
