/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase20eje2;

import Servicios.CafeteraServicio;
import clase20eje2.Entidad.Cafetera;

/**
 *
 * @author Miguel Ángel
 */
public class Clase20eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CafeteraServicio cafe = new CafeteraServicio();
        Cafetera cafetera1 = cafe.llenarCafetera();
        // Ingresar dinero a la cuenta
        cafe.servirTaza(cafetera1, 0);
        // Retirar dinero de la cuenta
        cafe.vaciarCafetera(cafetera1, 0);
        // Realizar extracción rápida
        cafe.agregarCafe(cafetera1, 0);

    }
    
}
