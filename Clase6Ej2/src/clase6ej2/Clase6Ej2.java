/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6ej2;



/**
 *
 * @author Miguel Ángel
 */
public class Clase6Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el objeto scanner
        
        // Creamos las variables
        int A = 5; 
        int B = 8;
        int C = 9;
        int D = 2;
        int aux;
        // Imprimo
        System.out.println("A = " + A + " B= " + B + " C= " + C + " D= " + D );
        // Empezamos a cambiar los valores
        aux = B; B = C; C = A; A = D; D = aux; 
        System.out.println("A = " + A + " B= " + B + " C= " + C + " D= " + D );
       
    }
    
}
