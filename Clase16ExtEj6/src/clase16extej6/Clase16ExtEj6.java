/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase16extej6;

import clase16extej6.Entidad.Rectangulo;

/**
 *
 * @author Miguel Ángel
 */
public class Clase16ExtEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rectangulo1 = new Rectangulo(4 ,6);
//        int area = rectangulo1.calcular_area();
        System.out.println("El área del rectángulo es: " + rectangulo1.calcular_area());
    }
    
}
