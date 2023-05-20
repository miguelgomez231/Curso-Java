/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcciondeherrores2guia10;

import Entidades.Libros;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Miguel Ángel
 */
public class CorrecciondeHerrores2Guia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        HashMap<Integer,String> personas = new HashMap();
//        String n1 = "Albus";
//        String n2 = "Severus";
//        int llave = 1;
//        int llave1 = 2;
//        personas.put(llave, n1);
//        personas.put(llave1, n2);

        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        System.out.println(bebidas);
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()){
        if (it.next().equals("café")){
        it.remove();
             }
        }
        System.out.println(bebidas);
        
        ArrayList<Libros> libros = new ArrayList();
        Libros libro = new Libros();
        libros.add(libro);
        
        for (Libros ejemplar : libros) {
            System.out.println(ejemplar);
        }
        
    }
}
