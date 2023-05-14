/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaejercicio9;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author Miguel Ángel
 */
public class GuiaEjercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el objeto Scanner
        Scanner entrada = new Scanner(System.in);
        // Declaramos una variable de tipo entero
        int num ; 
        // Inicializamos la varible suma
        int suma = 0;
        // Inicia el bucle, definimos la variable I dentro del paréntesis. 
        for (int i = 0; i < 20; i++){
            System.out.println("Ingrese un número");
            // leemos el número ingresado y lo vamos guardando en la variable num
            num = entrada.nextInt();
            
            if (num == 0) {
                System.out.println("Se capturó el número cero.");
                break; // salimos del bucle
            }
            if (num > 0) {
                suma += num;// Lo sumamos a la variable suma 
            }
        }
        System.out.println("La suma de los números leídos es: " + suma); 
    }
    
}
