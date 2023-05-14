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
public class motores {
    
    public static void main(String[] args) {
    // Creo una variable de tipo entero que será la opción que elige el usuario
    int tipoMotor;
    // Lee la variable opcion que entrará por teclado
    Scanner leer = new Scanner(System.in);
    // Imprime por pantalla que pida la opcion al usuario
    System.out.println("Elija el número de motor que desee, entre el 1 y el 4: ");
    // Guarda el dato ingresado en la variable
    tipoMotor = leer.nextInt();
    
    // Acá hacemos la estructura condicional si la variable es mayor igual a 1 y menor igual a 4 se ejecuta:
    if (tipoMotor >= 1 && tipoMotor <=4) {
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua.");
                break ;
            case 2:
                System.out.println("La bomba es una bomba de gasolina.");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia.");
                break;
        }
     // acá se ejecuta si no se ingresó un valor válido
    } else if ( tipoMotor < 1 || tipoMotor > 4 ) {
        System.out.println("No existe un valor válido para tipo de bomba.");
        
    }
    
    
    
    }
}
