/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase15ejer4;

import clase15ejer4.entidad.Rectangulo;

/**
 *
 * @author Miguel Ángel
 */
public class Clase15ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo datos = new Rectangulo();
        // Llamamos al método crearRectangulo
        datos.crearRectangulo();
        int superficie = datos.supRectangulo();
        int perimetro = datos.perimRectangulo();
        System.out.println("----------------------------");
        System.out.println("La superficie del rectángulo es: " + superficie);
        System.out.println("----------------------------");
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        
        datos.dibujarRectangulo();
    }
    
}
