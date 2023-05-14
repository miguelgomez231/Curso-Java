/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase21extras1;

import Entidades.Raices;
import Servicios.RaicesServicio;

/**
 *
 * @author Miguel Ángel
 */
public class Clase21Extras1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RaicesServicio rs = new RaicesServicio();
        Raices r = rs.crearEc();
        rs.calcular(r);
    }
    
}
