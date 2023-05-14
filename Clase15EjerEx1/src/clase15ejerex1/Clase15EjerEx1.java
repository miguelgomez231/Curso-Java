/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase15ejerex1;

import clase15ejerex1.entidad.Cancion;

/**
 *
 * @author Miguel Ángel
 */
public class Clase15EjerEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cancion titulo2 = new Cancion("Mi perro", "Jose Larralde");
        System.out.println(titulo2.getAutor() + titulo2.getTitulo());
    }
    
}
