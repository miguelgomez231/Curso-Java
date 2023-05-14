/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioahorcado;

import Entidades.Hanged;
import Servicios.HangedService;

/**
 *
 * @author Miguel Ángel
 */
public class EjercicioAhorcado {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        
        Hanged ah = new Hanged();
        HangedService ahs = new HangedService();
        
        ahs.juego();

    }
    
}
