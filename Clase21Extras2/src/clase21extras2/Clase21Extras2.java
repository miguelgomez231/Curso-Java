/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase21extras2;

import Entidades.NIF;
import Servicio.NIFService;

/**
 *
 * @author Miguel Ángel
 */
public class Clase21Extras2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NIFService nf = new NIFService();
        
        NIF n = nf.crearNif();
        nf.mostrar(n);
    }
    
}
