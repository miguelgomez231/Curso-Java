/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase15exej2;

import clase15exej2.Entidad.Puntos;

/**
 *
 * @author Miguel Ángel
 */
public class Clase15ExEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Puntos nums = new Puntos();
        nums.crearPuntos();
        
        double distancia= nums.calcDistancia();
        System.out.println("La distancia entre los dos puntos es: " + distancia);
    }
    
}
