/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcciondeherroresguia10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Miguel Ángel
 */
public class CorrecciondeHerroresGuia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> nombre = new TreeSet();
        HashMap<Integer,String> personas = new HashMap();
        
        //Agregamos objetos a la ArrayList:
        int a = 5;
        int b = 7;
        int c = 2;
        int d = 3;
        int e = 1;
        listado.add(a);
        listado.add(b);
        listado.add(c);
        listado.add(d);
        listado.add(e);
        
        // Agregamos 5 elementos al TreeSet:
        String nom1 = "Juan";
        String nom2 = "Jose";
        String nom3 = "Julia";
        String nom4 = "Jacket";
        String nom5 = "Jacksen";
        nombre.add(nom1);
        nombre.add(nom2);
        nombre.add(nom3);
        nombre.add(nom4);
        nombre.add(nom5);
        
        // Agregamos objetos al HashMap
        
       
        personas.put(a, nom1);
        personas.put(b, nom2);
        personas.put(c, nom3);
        personas.put(d, nom4);
        personas.put(e, nom5);
        
        // Eliminamos un elemento de la ArrayList:
        listado.remove(c);
        
        // Eliminamos un elemento de Treeset:
      //  nombre.remove(2);
        
        // Eliminamos un elemento del Map:
       // personas.remove(4);
        
        // Creamos un Interator:
        Iterator interator = listado.iterator();
        System.out.println("Elemento de la lista: " + listado);
    }
    
}
